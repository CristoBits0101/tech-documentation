import React from "react";
import SkillsCard from "../components/common/SkillsCard/SkillsCard";

import aws from "../assets/icons/aws.svg";
import bootstrap from "../assets/icons/bootstrap.svg";
import css from "../assets/icons/css.svg";
import docker from "../assets/icons/docker.svg";
import figma from "../assets/icons/figma.svg";
import filmora from "../assets/icons/filmora.svg";
import freemarker from "../assets/icons/freemarker.svg";
import git from "../assets/icons/git.svg";
import github2 from "../assets/icons/github2.svg";
import html5 from "../assets/icons/html5.svg";
import java from "../assets/icons/java.svg";
import javascript from "../assets/icons/javascript.svg";
import json from "../assets/icons/json.svg";
import laravel from "../assets/icons/laravel.svg";
import linux from "../assets/icons/linux.svg";
import magnolia from "../assets/icons/magnolia.svg";
import mysql from "../assets/icons/mysql.svg";
import networking from "../assets/icons/networking.svg";
import php from "../assets/icons/php.svg";
import postgresql from "../assets/icons/postgresql.svg";
import python from "../assets/icons/python.svg";
import react from "../assets/icons/react.svg";
import sass from "../assets/icons/sass.svg";
import spring from "../assets/icons/spring.svg";
import sql from "../assets/icons/sql.svg";
import xml from "../assets/icons/xml.svg";
import yaml from "../assets/icons/yaml.svg";

const Skills = () => {
  const frontendTechnologies = [
    { icon: html5, name: "HTML" },
    { icon: css, name: "CSS" },
    { icon: bootstrap, name: "Bootstrap" },
    { icon: sass, name: "Sass" },
    { icon: javascript, name: "JavaScript" },
    { icon: react, name: "React" },
    { icon: magnolia, name: "Magnolia" },
    { icon: figma, name: "Figma" },
    { icon: filmora, name: "Filmora" },
  ];

  const backendTechnologies = [
    { icon: php, name: "PHP" },
    { icon: laravel, name: "Laravel" },
    { icon: python, name: "Python" },
    { icon: java, name: "Java" },
    { icon: spring, name: "Spring" },
    { icon: freemarker, name: "FreeMarker" },
    { icon: xml, name: "XML" },
    { icon: json, name: "JSON" },
    { icon: yaml, name: "YAML" },
  ];

  const technologies = [
    { icon: sql, name: "SQL" },
    { icon: mysql, name: "MySQL" },
    { icon: postgresql, name: "PostgreSQL" },
    { icon: git, name: "Git" },
    { icon: github2, name: "GitHub" },
    { icon: aws, name: "AWS" },
    { icon: docker, name: "Docker" },
    { icon: linux, name: "GNU/Linux" },
    { icon: networking, name: "Networking" },
  ];

  return (
    <>
      <SkillsCard
        title="Frontend"
        technologies={frontendTechnologies}
        className="card card-1"
      />
      <SkillsCard
        title="Backend"
        technologies={backendTechnologies}
        className="card card-2"
      />
      <SkillsCard
        title="Technologies"
        technologies={technologies}
        className="card card-3"
      />
    </>
  );
};

export default Skills;
