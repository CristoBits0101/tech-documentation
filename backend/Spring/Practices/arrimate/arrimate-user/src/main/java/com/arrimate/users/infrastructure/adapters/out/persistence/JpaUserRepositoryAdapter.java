package com.arrimate.users.infrastructure.adapters.out.persistence;

import com.arrimate.users.domain.models.UserModel;
import com.arrimate.users.domain.ports.out.UserRepositoryPort;
import com.arrimate.users.infrastructure.adapters.out.persistence.entity.UserEntity;
import com.arrimate.users.infrastructure.adapters.out.persistence.repositories.JpaUserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    @Autowired
    private final JpaUserRepository jpaUserRepository;

    public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaUserRepository.existsById(id)){
            jpaUserRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<UserModel> findAll() {
        return jpaUserRepository
                .findAll()
                .stream()
                .map(UserEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserModel> findById(Long id) {
        return jpaUserRepository
                .findById(id)
                .map(UserEntity::toDomainModel);
    }

    @Override
    public UserModel save(UserModel user) {
        UserEntity userEntity = UserEntity.fromDomainModel(user);
        UserEntity savedUserEntity = jpaUserRepository.save(userEntity);
        return savedUserEntity.toDomainModel();
    }

    @Override
    public Optional<UserModel> update(Long id, UserModel user) {
        if (jpaUserRepository.existsById(id)) {
            UserEntity userEntity = UserEntity.fromDomainModel(user);
            UserEntity updateUserEntity = jpaUserRepository.save(userEntity);
            return Optional.of(updateUserEntity.toDomainModel());
        }
        return Optional.empty();
    }

}
