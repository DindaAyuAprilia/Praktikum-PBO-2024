///////////////////////////////////////////////////////////////////////////////////////
/*                         Library Yang Di perlukan                                  */
///////////////////////////////////////////////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
///////////////////////////////////////////////////////////////////////////////////////

public class BantuanUang extends Bantuan {

///////////////////////////////////////////////////////////////////////////////////////
/*                       Deklarasi Objek Yang di perlukan                            */
///////////////////////////////////////////////////////////////////////////////////////
    private int jumlahUang;

    // Deklarasi objek yang akan digunakan
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static Tampilan look = new Tampilan();

    // ArrayList untuk menyimpan data anak
    static ArrayList<Bantuan> daftarBantuan = new ArrayList<>();

    public BantuanUang(int idDonatur, int jumlahUang) {
        super(idDonatur, new Date());
        this.jumlahUang = jumlahUang;
    }

    public int getJumlahUang() {
        return jumlahUang;
    }

///////////////////////////////////////////////////////////////////////////////////////
/*                            Method Yang Diperlukan                                 */
///////////////////////////////////////////////////////////////////////////////////////
//  [1] Mehode tambah bantuan uang
    public static void tambahBantuanUang(int idDonatur) throws IOException {
        look.cls();
        look.notif("Detail Bantuan Uang");
        System.out.print("Jumlah Uang: ");
        int jumlah = Integer.parseInt(input.readLine());
        look.garis();
        Bantuan.tambahBantuanUang(idDonatur,jumlah);

        look.cls();
        look.notif("Data Bantuan Barang Berhasil ditambahkan!");
    }
}
