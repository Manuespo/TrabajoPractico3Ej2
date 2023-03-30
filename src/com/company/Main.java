package com.company;

public class Main {

    public static void main(String[] args) {
        int contadorEstudiantes=0;
        int contadorStaff=0;
        double ingresos=0;
    Persona personas[]=new Persona[10];
    personas[0]=new Estudiante("Manuel","Esposito",38606957,"manuelesposito@outlook.com","Quiroga 4267",2021,1500,"TUP");
    personas[1]=new Estudiante("Candela Maria","Ale",39282746,"candelaale@gmail.com","Castelli 2822",2014,2000,"Radiologia");
    personas[2]=new Staff("Juan","Lofrano",18214142,"juanlofrano@gmail.com","San Juan 2341",2600,"Tarde");
    personas[3]= new Staff("Juan", "Pérez", 12345678, "juan.perez@gmail.com", "Calle Mayor 1", 1500.0, "mañana");
    personas[4] = new Staff("María", "García", 87654321, "maria.garcia@gmail.com", "Calle Mayor 2", 1700.0, "tarde");
    personas[5] = new Staff("Pedro", "Martínez", 11111111, "pedro.martinez@gmail.com", "Calle Mayor 3", 1800.0, "mañana");
    personas[6] = new Staff("Ana", "Ruiz", 22222222, "ana.ruiz@gmail.com", "Calle Mayor 4", 1900.0, "tarde");
    personas[7] = new Staff("Carlos", "Sánchez", 33333333, "carlos.sanchez@gmail.com", "Calle Mayor 5", 2000.0, "mañana");
        for (Persona persona:
             personas) {
            System.out.println(persona);
        }
        for (int i=0;i< personas.length;i++) {
            if (personas[i] instanceof Estudiante){
                contadorEstudiantes++;
            ingresos += ((Estudiante) personas[i]).getCuotaMensual();
        }
            if (personas[i]instanceof Staff)
                contadorStaff++;
        }
        System.out.println("La cantidad de estudiantes es "+contadorEstudiantes+" y la cantidad de Staff es "+contadorStaff);
        System.out.println(ingresos);

    }
}
