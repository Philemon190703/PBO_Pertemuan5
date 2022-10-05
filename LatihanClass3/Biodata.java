/*
|* Buat program untuk menginput dan menampilkan data nim dan nama dengan konsep PBO.
|* 1. Analisis Spesifikasi kebutuhan sistem
|*  a. Spesifikasi kebutuhan input dari data ke sistem
|*     - nim : String
|*     - nama : String
|*  b. Spesifikasi kebutuhan output data dari sistem
|*     - nim
|*     - nama
|*  c. Rekayasa Proses
|*     - InputData(String a, String b): void
|*     - viewData(): void
 */
package LatihanClass3 ;
public class Biodata {
        private String nim;
        private String nama;

        public void inputData(String nim, String nama) {
            this.nim = nim;
            this.nama = nama;
        }
        public void viewData() {
            System.out.println("NIM: " + this.nim);
            System.out.println("Nama: " + this.nama);
        }
}
