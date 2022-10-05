package LatihanClass3;

import LatihanClass3.Biodata;

public class main {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.inputData( "2021001", "Dodi");
        biodata.viewData();

        Biodata mhs = new Biodata();
        mhs.inputData( "2022002", "Dewi");
        mhs.viewData();
    }
}
