package data.types.clase;

import java.util.Optional;

public class MyOptional {

    private String day;

    public MyOptional() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    // 1.1. Sin optional
    public String checkDayOne() {
        return (this.day == null) ? null : this.day;
    }

    // 2.1. Con optional
    public Optional<String> checkDayTwo() {
        return (this.day == null) ? Optional.empty()        // Fabrica un opcional vacío y no nulo
                                  : Optional.of(this.day);  // Fabrica un opcional con un valor
                                  
        // return Optional.ofNullable(this.day);            // Comprueba day y retorna optional empty si en nulo
    }

    public static void main(String[] args) {

        MyOptional optional = new MyOptional();
        optional.setDay(null);

        // 1.2. Si no compruebas si devulve null peta
        System.out.println(optional.checkDayOne());

        // 2.2. Con optional estamos obligados a comprobar
        Optional<String> optionalDay = optional.checkDayTwo();

        /**
         * optionalDay.get()         -> Devuelve el valor o throws
         * optionalDay.orElseThrow() -> Igual que get pero más semántico
         * optionalDay.empty()       -> True sí el optional está vacío
         * optionalDay.isPresent()   -> True sí el optional no está vacío
         */
        if (optionalDay.isPresent())
            System.out.println(optionalDay.orElseThrow());

    }

}
