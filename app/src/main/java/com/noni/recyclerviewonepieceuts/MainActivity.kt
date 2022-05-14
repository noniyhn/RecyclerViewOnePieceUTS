package com.noni.recyclerviewonepieceuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val karakteropList = listOf<KarakterOP>(
            KarakterOP(
                R.drawable.logo,
                "One Piece",
                "One Piece adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan " +
                        "oleh Eiichiro Oda. Manga ini telah dimuat di majalah Weekly Shōnen Jump " +
                        "milik Shueisha, sejak tanggal 22 Juli 1997. Dan telah dibundel menjadi 91 " +
                        "volume tankōbon. Manga ini telah diadaptasi menjadi sebuah animasi video asli " +
                        "(OVA) yang diproduksi oleh Production I.G pada tahun 1998, dan sebuah serial " +
                        "anime yang diproduksi oleh Toei Animation, yang mulai tayang di Jepang pada " +
                        "tahun 1999. One Piece telah menerima pujian atas alur cerita, gambar, " +
                        "karakterisasi, dan humornya. Beberapa volume dari manga ini telah memecahkan " +
                        "rekor penerbitan, termasuk cetakan awal tertinggi dari buku apa pun di Jepang."
            ),
            KarakterOP(
                R.drawable.luffy,
                "Monkey D. Luffy",
                "Alias: Topi Jerami, Manusia karet.\n" +
                        "Jabatan: Kapten.\n" +
                        "Tebusan/Bounty: ฿1.500.000.000\n" +
                        " Monkey D. Luffy, seorang anak laki-laki pemakan buah iblis Gomu Gomu no Mi " +
                        "sehingga ia menjadi manusia karet. kemampuan ini membuat tubuhnya memiliki atribut" +
                        " yang sama dengan karet, seperti melar, peredam listrik, dsb.. \n" +
                        "Luffy memiliki cita-cita menjadi Raja Bajak Laut setelah bertemu dengan Shanks Si Rambut " +
                        "Merah yang singgah di pulau kelahirannya, Fusha. Topi jerami yang menjadi ciri khasnya adalah " +
                        "pemberian dari Shanks dan dia berjanji akan memberikan topi itu kembali kepadanya saat mereka " +
                        "bertemu kembali.\n" +
                        "Dengan kru bajak lautnya, yang dinamakan Bajak Laut Topi Jerami, Luffy menjelajahi Grand Line " +
                        "untuk mencari harta karun terbesar di dunia yang dikenal sebagai \"One Piece\" dalam rangka untuk " +
                        "menjadi Raja Bajak Laut yang berikutnya.\n"
            ),
            KarakterOP(
                R.drawable.zoro,
                "Roronoa Zoro",
                "Alias: Pemburu Bajak Laut, Tiga Pedang.\n" +
                        "Jabatan: Petarung, Beban Kapal,Pendekar Pedang.\n" +
                        "Tebusan/Bounty: ฿320.000.000\n" +
                        "Merupakan kru pertama yang ikut bergabung dalam Kelompok Topi Jerami dan " +
                        "menjabat sebagai wakil kapten. Teknik bertarungnya menggunakan 3 pedang yang " +
                        "merupakan pedang langka dalam dunia One Piece. Zoro memiliki cita-cita untuk " +
                        "menjadi pendekar pedang terkuat di dunia, mewarisi cita-cita sahabat masa " +
                        "kecilnya, Kuina, yang meninggal karena kecelakaan.\n"
            ),
            KarakterOP(
                R.drawable.sanj,
                "Vinsmoke Sanji",
                "Alias: Kaki Hitam, Alis Melingkar.\n" +
                        "Jabatan: Koki.\n" +
                        "Tebusan/Bounty: ฿330.000.000\n" +
                        "Koki di anggota Bajak Laut Topi Jerami dan merupakan rival Roronoa Zoro. " +
                        "Sanji merupakan seorang bangsawan dari negeri kuat Germa 66. Ia melarikan diri " +
                        "dari kerajaannya menjadi seorang koki di sebuah kapal. Dia seorang Koki yang " +
                        "bercita-cita menemukan lautan legendaris di mana semua sumber bahan makanan berasal, " +
                        "yaitu All Blue. Ia juga merupakan murid dari Zeff si Kaki Merah, koki andal dari Restoran " +
                        "Baratie yang dulunya bajak laut. Sanji sangat genit terhadap wanita. Sanji mempunyai prinsip " +
                        "yaitu tidak akan melukai wanita walaupun harus mati. Sanji menggunakan kedua kakinya untuk" +
                        " bertarung dan tidak pernah menggunakan tangannya karena menurutnya, tangan adalah harta karun " +
                        "bagi seorang koki. Sanji bertarung dengan teknik tendangan yang sangat kuat. Dia juga bisa " +
                        "memakai tenknik \"Diable Jump/Diable Jambe\" yang membuat kakinya mengeluarkan api. " +
                        "Teknik ini bisa memperkuat tendangannya dan memberikan efek terbakar pada musuhnya. "
            ),
            KarakterOP(
                R.drawable.nami,
                "Nami",
                "Alias: Kucing Pencuri.\n" +
                        "Jabatan: Navigator.\n" +
                        "Tebusan/Bounty: ฿66.000.000\n" +
                        "Navigator dari Kelompok Topi Jerami yang dapat merasakan perubahan cuaca dengan tubuhnya. " +
                        "Kemampuan lain selain navigasi adalah mencuri dan membuat peta. Cita-cita dari Nami adalah " +
                        "membuat peta seluruh dunia. Senjata yang digunakan adalah tongkat dengan berbagai modifikasi " +
                        "dari Usopp.\n"
            ),
            KarakterOP(
                R.drawable.usp,
                "Ussop",
                "Alias: Hidung Panjang, Dewa Usopp, Soge King.\n" +
                        "Jabatan: Penembak Jitu.\n" +
                        "Tebusan/Bounty: ฿200.000.000\n" +
                        "Penembak jitu di Kelompok Bajak Laut Topi Jerami. Bercita-cita menjadi penembak jitu pemberani di " +
                        "seluruh lautan dan ingin pergi ke Pulau Elbaf. Ayahnya, Yasopp, adalah seorang penembak jitu di " +
                        "Kelompok Bajak Laut Shanks. Sangat suka berbohong, dan bercerita yang tinggi-tinggi. " +
                        "Bertarung dengan memakai tembakan katapel dengan peluru unik dan jebakan-jebakan. Setelah 2 tahun " +
                        "latihan mampu mengendalikan Pop Green, tumbuhan yang bisa tumbuh dengan agresif dan cepat. \n" +
                        "Usopp merupakan anggota yang sempat berselisih dengan Luffy di Arc Water 7 yang berakhir dengan " +
                        "duel antara Luffy vs Usopp di depan kapal Going Merry. Walaupun termasuk 3 terlemah, dia merupakan " +
                        "orang yang berani bertarung melawan sang kapten Monkey D. Luffy dan membakar bendera Pemerintah " +
                        "Dunia.\n"
            ),
            KarakterOP(
                R.drawable.rbin,
                "Nico Robin",
                "Alias: Anak Iblis.\n" +
                        "Jabatan: Arkeolog.\n" +
                        "Tebusan/Bounty: ฿130.000.000\n" +
                        "Arkeolog satu-satunya di dunia yang tersisa dari Pulau Ohara yang meneliti asal usul penyandang " +
                        "inisial 'D' melalui Poneglyph yang mungungkapkan kejadian yang sebenarnya pada sejarah 100 tahun " +
                        "yang hilang. Merupakan buruan paling dicari oleh pihak pemerintah dunia karena dianggap sebagai" +
                        " iblis yang dapat mengacaukan perdamaian dunia. Hal ini dibuktikan dengan nilai buruan pada saat " +
                        "umurnya 8 tahun sangat tinggi. Pemakan buah iblis Hana Hana sehingga dapat menggandakan anggota" +
                        " tubuhnya di mana saja (tetapi lebih sering menggandakan tangannya). Bertarung dengan menggandakan " +
                        "tubuhnya, bisa digunakan untuk berbagai variasi jurus (seperti menumbuhkan tangan di tubuh lawan " +
                        "lalu memukulnya). Saat menggunakan kekuatannya dia menyilangkan tangannya.\n"
            ),
            KarakterOP(
                R.drawable.chop,
                "Tony Tony Chopper",
                "Alias: Pecinta Permen Kapas.\n" +
                        "Jabatan: Dokter.\n" +
                        "Tebusan/Bounty: ฿100\n" +
                        "Dokter yang berwujud rusa kutub ini mempunyai tujuh wujud perubahan. Chopper mengemban" +
                        " keinginan dari dokter terhebat di dunia dokter Hiluluk, yang bercita-cita menyembuhkan " +
                        "segala penyakit yang ada di dunia. Dia pemakan buah iblis Hito Hito sehingga dapat " +
                        "berbicara layaknya manusia. Kekuatan buah Hito-Hito juga membuatnya bisa berubah menjadi " +
                        "berbagai macam wujud termasuk menjadi monster. Setelah 2 tahun, dia bisa memakai wujud " +
                        "monsternya tanpa kehilangan kesadaran.\n"
            ),
            KarakterOP(
                R.drawable.franky,
                "Cutty Flam/franky",
                "Alias: Cyborg.\n" +
                        "Jabatan: Tukang Kayu.\n" +
                        "Tebusan/Bounty: ฿94.000.000\n" +
                        "Cyborg sekaligus Tukang kayu kapal yang bercita-cita membangun kapal impian, kapal yang mampu " +
                        "mengarungi seluruh lautan seperti kapal Raja Bajak Laut Gol D. Roger, Oro Jackson, yang dibuat " +
                        "oleh Tom. Saat Tom ditangkap oleh Angkatan Laut, Franky berniat menghentikan kereta api atas laut " +
                        "yang mengangkut Tom ke Ennies Lobby. Akibatnya, ia tertabrak kereta tersebut dan nyaris meninggal." +
                        " Untuk bertahan hidup, ia mengubah struktur tubuhnya dengan berbagai teknologi hingga menjadi Cyborg." +
                        " Teknik bertarung Franky cukup bervariasi. Ia menggunakan senjata yang tersembunyi di seluruh " +
                        "tubuhnya, dan menggunakan Cola sebagai bahan bakar. Dua tahun kemudian, setelah berkumpul kembali," +
                        " Franky merakit ulang tubuhnya dengan teknologi canggih dari Angkatan Laut, yang merupakan hasil " +
                        "penelitian dari Vegapunk, seorang ilmuwan dari Angkatan Laut. "
            ),
            KarakterOP(
                R.drawable.br,
                "Brook",
                "Alias: Pendekar Bersenandung.\n" +
                        "Jabatan: Musisi.\n" +
                        "Tebusan/Bounty: ฿83.000.000\n" +
                        "Manusia tengkorak berambut afro dan juga seorang pemusik yang direkrut setelah peristiwa Thriller Bark." +
                        " Dia merupakan bajak laut yang berjanji pada seekor paus yang bernama Laboon dan bercita-cita " +
                        "untuk meneruskan perjalanan hingga Raftel, pulau ujung dunia dan berjanji akan kembali lagi " +
                        "menemui Laboon. Bertarung dengan menggunakan pedang dan biolanya. Kekuatan musiknya bisa " +
                        "menghipnosis orang yang mendengarkan lagunya dan juga bisa menidurkan orang. Pemakan buah" +
                        " iblis Yomi Yomi yang artinya hidup kembali. Sebenarnya dia sudah lama meninggal, tetapi karena" +
                        " kekuatan buah iblis ini arwahnya kembali dan menemukan jasadnya yang telah tinggal " +
                        "tulang belulang. Setelah 2 tahun berlatih mampu menyambung tubuhnya yang putus, pedangnya " +
                        "bisa membekukan dan bisa mengeluarkan roh dari jasad tengkoraknya.\n"
            ),
            KarakterOP(
                R.drawable.jinbey,
                "Jinbei",
                "Alias: ksatria lautan.\n" +
                        "Jabatan: supir/pengemudi kapal. \n" +
                        "Tebusan/Bounty: ฿438.000.000\n" +
                        "Manusia ikan satu-satunya di kelompok topi jerami yang bergabung dengan kelompok topi jerami di arc " +
                        "wholecake island. Jinbe adalah seorang mermen spesies hiu paus, mantan Shichibukai dan kapten kedua" +
                        " kelompok Bajak Laut Matahari setelah Fisher Tiger. Gelar Shichibukainya dicabut karena menolak ikut" +
                        " serta dalam perang melawan Shirohige, serta secara terang-terangan membantu Monkey D. Luffy dan " +
                        "Bajak Laut Whitebeard. Ia kemudian bersekutu dengan Luffy dan kru topi jerami melawan pemberontakan" +
                        " Bajak Laut Manusia Ikan Baru dan Vander Decken IX terhadap Kerajaan Ryugu.\n"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.op_karakter)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KarakterOPAdapter(this, karakteropList) {

            val intent = Intent(this, DetailKarakterOPActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}