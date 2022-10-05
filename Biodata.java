package LatihanClass3a;
        
public class Biodata {
    public String nim;
    public String nama;
    
    private int umur;
    
    private String Jkel;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getjkel() {
        String jeniskelamin = "perempuan";
        if(this.Jkel == "L") {
            jeniskelamin = "laki-laki";
        }
        return jeniskelamin;
    }
    
    public void setJkel(String jkel){
        Jkel = jkel;
    }
    
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.setNim("2021001");
        biodata.setNama("Dodi");
        biodata.setJkel("L");
        biodata.setUmur(19);

        System.out.println("NINM : " + biodata.getNim());
        System.out.println("Nama : " + biodata.getNama());
        System.out.println("umur : " + biodata.getUmur());
        System.out.println("Jkel : " + biodata.getjkel());
    }
}
