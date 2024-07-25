/**
 * Modelo -> Pojo o clase simple
 * Modelo -> Se considera entidad si trabaja con bd.
 * 1. Se crea el modelo.
 * 2. Se instancia.
 * 3. Se inicializa.
 * 4. Se manipula.
 * 5. Se retorna.
 */
public class User {

    public String name;
    public int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
