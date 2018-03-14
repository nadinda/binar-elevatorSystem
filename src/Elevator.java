/** Buat sistem lift
 - ada 20 lantai
 - posisi pemain ada di lantai `x`
 - pemain ingin ke lantai `y`

 Soal:
 gambarkan alur lift tersebut.

 Contoh:
 posisi pemain = 5
 tujuan = 15

 lantai 5
 lantai 6
 lantai 7
 lantai 8
 lantai 9
 ...
 lantai 15
 **/
import java.util.Scanner;

public class Elevator {
    int totalFloor = 20;
    int currentFloor;
    int destinationFloor;

    public void inputFloor() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Lantai berapa posisi Anda sekarang? ");
            currentFloor = scanner.nextInt();

            System.out.println("Jumlah lantai di Gedung ini ada " + totalFloor + " Lantai");

            System.out.print("Lantai berapa yang ingin Anda tuju? ");
            destinationFloor = scanner.nextInt();

            if (currentFloor <= 0 || currentFloor >= totalFloor || destinationFloor > totalFloor) {
                System.err.println("Input Anda tidak valid");
                inputFloor();
            } else {
                elevatorSystem();
            }

        } catch (Exception ex) {
            errorHandling();
        }
    }

    public void errorHandling() {
        System.err.println("Mohon hanya masukkan angka");
        inputFloor();
    }

    public void elevatorSystem() {
        int x = currentFloor;
        int y = destinationFloor;
        int z = totalFloor;

//        if(x == y) {
//            System.out.print("Anda sudah berada di Lantai " + y);
//        } else {
//            System.out.print("Anda akan menuju lantai " + y);
//        }

        if(x < y) {
            do {
                System.out.println("Lantai " + x);
                x++;
            } while (x <= y && x <= z);
            System.out.println("Anda sudah sampai di Lantai " + y + ", Selamat beraktivitas!");
        }

        else if(x > y) {
            do {
                System.out.println("Lantai " + x);
                x--;
            } while (x >= y && x <= z);
            System.out.println("Anda sudah sampai di Lantai " + y + ", Selamat beraktivitas!");
        }

        else {
            System.out.println("Anda sudah berada di Lantai " + y);
        }
    }
}
