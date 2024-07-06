package com.example.administrasiuns.ui.facility

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.administrasiuns.R

class DetailFacilityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView : View = inflater.inflate(R.layout.fragment_detail_facility, container, false)

        val textViewDetail = rootView.findViewById<TextView>(R.id.textViewDetail)
        val imageViewFacility = rootView.findViewById<ImageView>(R.id.imageViewFacility)
        arguments?.let {
            val facility = it.getString(EXTRA_FACILITY)
            textViewDetail.text = getFacilityDetail(facility)
            when (facility) {
                "Perpustakaan" -> imageViewFacility.setImageResource(R.drawable.perpustakaan)
                "Asrama Mahasiswa" -> imageViewFacility.setImageResource(R.drawable.asrama_mahasiswa)
                "Medical Centre" -> imageViewFacility.setImageResource(R.drawable.mc_uns)
                "UNS Inn" -> imageViewFacility.setImageResource(R.drawable.uns_inn)
                "Hotspot Area" -> imageViewFacility.setImageResource(R.drawable.hotspot_area)
                "Transportasi Kampus" -> imageViewFacility.setImageResource(R.drawable.transportasi)
                "UNS Press" -> imageViewFacility.setImageResource(R.drawable.uns_press)
                "Olahraga" -> imageViewFacility.setImageResource(R.drawable.olahraga)
                "Tempat Ibadah" -> imageViewFacility.setImageResource(R.drawable.tempatibadah)
                // Tambahkan kondisi untuk fasilitas lain jika ada gambar
            }
        }

        return rootView
    }
    private fun getFacilityDetail(facility: String?): String {
        return when (facility) {
            "Perpustakaan" -> "Perpustakaan Universitas Sebelas Maret (UNS) merupakan salah satu fasilitas penting yang ada di kampus tersebut. Berikut beberapa informasi tentang Perpustakaan UNS:\n" +
                    "\n" +
                    "Lokasi: Perpustakaan UNS terletak di Kampus Kentingan, Jl. Ir. Sutami 36A, Surakarta.\n" +
                    "\n" +
                    "Koleksi: Perpustakaan ini memiliki berbagai macam koleksi buku, jurnal, skripsi, tesis, disertasi, dan bahan pustaka lainnya. Koleksinya mencakup berbagai disiplin ilmu yang diajarkan di UNS.\n" +
                    "\n" +
                    "Fasilitas: Selain koleksi bahan pustaka, perpustakaan ini juga dilengkapi dengan fasilitas seperti ruang baca yang nyaman, ruang diskusi, ruang multimedia, dan akses komputer dengan internet. Tersedia juga layanan peminjaman dan pengembalian buku secara online.\n" +
                    "\n" +
                    "Layanan Digital: Perpustakaan UNS menyediakan layanan digital yang memungkinkan mahasiswa dan staf untuk mengakses berbagai sumber daya elektronik, termasuk e-books, e-journals, dan database akademik.\n" +
                    "\n" +
                    "Jam Operasional: Perpustakaan biasanya buka dari Senin hingga Jumat, dengan jam operasional mulai pagi hingga sore. Pada hari Sabtu, perpustakaan mungkin buka dengan jam operasional yang lebih singkat. Untuk informasi lebih detail mengenai jam operasional, disarankan untuk mengunjungi situs web resmi perpustakaan atau menghubungi langsung pihak perpustakaan.\n" +
                    "\n" +
                    "Keanggotaan: Mahasiswa, dosen, dan staf UNS otomatis menjadi anggota perpustakaan dan dapat memanfaatkan semua layanan yang disediakan. Pengguna dari luar UNS juga dapat mendaftar untuk menjadi anggota dengan mengikuti prosedur yang ditetapkan."

            "Asrama Mahasiswa" -> "Salah satu fasilitas yang dapat dimanfaatkan oleh mahasiswa UNS baik diploma, sarjana, maupun pasca-sarjana adalah Asrama Kampus Universitas Sebelas Maret (UNS). Terletak di JL. Kartika III, Ngoresan, Jebres, Surakarta, asrama kampus ini mempunyai 4 gedung utama, gedung A,B, C, dan D.\n" +
                    "\n" +
                    "Terdapat beberapa umum asrama yang dapat dimanfaatkan oleh para penghuni, seperti ruang tamu/ lobbi, kantin, serta ruang rapat. Untuk kamar tidur, terdapat dua tipe, yaitu tipe single (untuk satu orang) dan sharing ( untuk 2 orang). Masing masing kamar mempunyai fasilitas tempat tidur, meja belajar, kursi serta almari.\n" +
                    "\n" +
                    "Bagi para mahasiswa UNS yang berminat untuk tinggal di asrama kampus, dapat langsung mendatangi kantor asrama yang berada di gedung D kompleks asrama kampus atau menghubungi:\n" +
                    "\n" +
                    "Telepon : 0271-6793336 \n" +
                    "Handphone/Whatsapp: 08112649464\n" +
                    "Email: asrama01mahasiswauns@gmail.com\n" +
                    "Instagram: https://www.instagram.com/asramauns"
            "Olahraga" -> "Stadion UNS:\n" +
                    "\n" +
                    "Stadion ini digunakan untuk berbagai kegiatan olahraga seperti sepak bola, atletik, dan acara-acara besar lainnya.\n" +
                    "Dilengkapi dengan lapangan rumput yang luas dan trek lari.\n" +
                    "Gelanggang Olahraga (GOR):\n" +
                    "\n" +
                    "GOR UNS digunakan untuk berbagai olahraga dalam ruangan seperti bulu tangkis, basket, voli, dan futsal.\n" +
                    "Memiliki tribun penonton untuk menyaksikan pertandingan.\n" +
                    "\n" +
                    "Lapangan Tenis:\n" +
                    "UNS memiliki beberapa lapangan tenis yang dapat digunakan oleh mahasiswa dan staf.\n" +
                    "Lapangan ini sering digunakan untuk latihan dan pertandingan tenis.\n" +
                    "\n" +
                    "Lapangan Basket:\n" +
                    "Terdapat beberapa lapangan basket di area kampus yang bisa digunakan untuk latihan dan pertandingan.\n" +
                    "Beberapa lapangan dilengkapi dengan penerangan untuk penggunaan pada malam hari.\n" +
                    "\n" +
                    "Lapangan Voli:\n" +
                    "Lapangan voli tersedia di dalam dan luar ruangan, cocok untuk latihan dan turnamen.\n" +
                    "\n" +
                    "Selain stadion utama, terdapat beberapa lapangan sepak bola lainnya di dalam kampus yang dapat digunakan untuk latihan dan pertandingan.\n" +
                    "Fasilitas Pendukung:\n" +
                    "\n" +
                    "Terdapat ruang ganti, kamar mandi, dan fasilitas pendukung lainnya di sekitar area olahraga untuk kenyamanan pengguna.\n" +
                    "Beberapa fasilitas olahraga juga dilengkapi dengan kantin dan tempat istirahat.\n" +
                    "Klub dan Komunitas Olahraga:\n" +
                    "\n" +
                    "UNS memiliki berbagai klub dan komunitas olahraga yang aktif, seperti klub sepak bola, basket, bulu tangkis, tenis, dan lain-lain.\n" +
                    "Klub-klub ini sering mengadakan latihan rutin, kompetisi internal, dan mengikuti turnamen eksternal."
            "Medical Centre" -> "MC UNS. Medical Center Universitas Sebelas Maret, sebagai wujud dalam memperhatikan kesehatan, bentuknya adalah dengan mendirikan fasilitas kesehatan bernama Medical Centre. UNS Medical Centre didukung oleh para dokter dan tenaga medis profesional yang juga merupakan staf pengajar di Fakultas  Kedokteran. Medical Centre terdiri dari 4 divisi, di antaranya: Kesehatan Umum, Gigi, Mata serta Telinga Hidung dan Tenggorokan (THT).\n" +
                    "\n" +
                    "Medical Centre  tidak hanya melayani civitas akademika UNS tetapi juga pemeriksaan kesehatan untuk warga sekitar UNS sebagai salah satu wujud pengabdian kepada masyarakat.  Selain sebagai pusat pelayanan kesehatan, Medical Centre juga menjadi sarana penunjang kegiatan belajar mengajar bagi mahasiswa S-1 Fakultas Kedokteran dan mahasiswa S-2 Kedokteran Keluarga. Medical Centre bisa Anda kunjungi di kompleks kampus pusat UNS, Kentingan.\n" +
                    "\n" +
                    "VISI :\n" +
                    "\n" +
                    "Terciptanya peningkatan status kesehatan yang holistik pada sivitas akademika UNS dan masyarakat sekitarnya melalui pelayanan kesehatan dan upaya kesehatan masyarakat yang dibutuhkan, baik promotif, preventif, kuratif dan rehabilitatif, yang bermutu dan biaya terjangkau, dengan penerapatan pendekatan kedokteran keluarga.\n" +
                    "\n" +
                    "MISI :\n" +
                    "\n" +
                    "Memberikan pelayanan kesehatan dan upaya kesehatan masyarakat yang dibutuhkan, yang unggul, terdepan, holistik, komprehensif, terpadu, berkelanjutan, terjangkau dan berkeadilan dengan pendekatan kedokteran keluarga;\n" +
                    "Melakukan pendidikan kesehatan kepada sivitas akademika UNS dan masyarakat;\n" +
                    "Melakukan penelitian kedokteran dan kesehatan masyarakat untuk pembuatan kebijakan dan pengambilan keputusan;\n" +
                    "Melakukan pengabdian kepada masyarakat pada bidang kedokteran dan kesehatan masyarakat."
            "UNS Inn" -> "UNS Inn adalah hotel yang dimiliki dan dikelola oleh Universitas Sebelas Maret (UNS) Surakarta. Berikut adalah beberapa informasi tentang UNS Inn:\n" +
                    "\n" +
                    "Lokasi:\n" +
                    "\n" +
                    "UNS Inn terletak di dalam kompleks Universitas Sebelas Maret, yang memudahkan akses ke berbagai fasilitas dan gedung di kampus.\n" +
                    "Alamat lengkapnya adalah Jl. Ir. Sutami No.36 A, Jebres, Surakarta.\n" +
                    "Fasilitas:\n" +
                    "\n" +
                    "Kamar: UNS Inn menawarkan berbagai tipe kamar yang nyaman dan dilengkapi dengan fasilitas modern seperti AC, TV, Wi-Fi, dan kamar mandi dalam.\n" +
                    "Restoran: Terdapat restoran yang menyajikan berbagai pilihan makanan dan minuman untuk tamu.\n" +
                    "Ruang Pertemuan: Hotel ini memiliki ruang pertemuan yang bisa digunakan untuk berbagai acara seperti seminar, workshop, dan rapat.\n" +
                    "Layanan Kamar: Layanan kamar tersedia untuk memenuhi kebutuhan tamu selama menginap.\n" +
                    "Parkir: Area parkir yang luas tersedia bagi tamu yang membawa kendaraan pribadi.\n" +
                    "Keamanan: Sistem keamanan 24 jam untuk memastikan kenyamanan dan keselamatan tamu.\n" +
                    "Kegiatan:\n" +
                    "\n" +
                    "UNS Inn sering digunakan untuk mengakomodasi tamu universitas, seperti dosen tamu, pembicara seminar, dan peserta konferensi.\n" +
                    "Selain itu, hotel ini juga sering menjadi pilihan akomodasi bagi keluarga mahasiswa yang berkunjung ke kampus.\n" +
                    "Reservasi:\n" +
                    "\n" +
                    "Pemesanan kamar dapat dilakukan secara langsung melalui telepon, email, atau situs web resmi UNS Inn.\n" +
                    "Tersedia berbagai paket menginap yang dapat disesuaikan dengan kebutuhan tamu, baik untuk jangka pendek maupun jangka panjang.\n" +
                    "Aksesibilitas:\n" +
                    "\n" +
                    "UNS Inn mudah diakses dari berbagai titik di kota Surakarta, termasuk dari stasiun kereta api dan terminal bus.\n" +
                    "Letaknya yang strategis juga memudahkan tamu untuk mengunjungi berbagai tempat wisata dan pusat perbelanjaan di sekitar Surakarta.\n" +
                    "Lingkungan:\n" +
                    "\n" +
                    "Terletak di dalam kampus UNS yang hijau dan asri, UNS Inn menawarkan suasana yang tenang dan nyaman untuk beristirahat."
            "Tempat Ibadah" -> "UNS mempunyai kompleks tempat ibadah untuk umat Islam, Kristen, Hindu, Budha, dan Khonghucu. Kelima lokasi ibadah tersebut terletak di kompleks yang jaraknya berdekatan. Hal tersebut menunjukan bahwa UNS menjunjung tinggi nilai toleransi dalam kehidupan beragama."
            "Hotspot Area" -> "Universitas Sebelas Maret menyediakan akses mudah bagi civitasnya untuk terhubung ke internet di seluruh area kampus melalui hotspot. Akses ini tersedia untuk perangkat seperti PC, laptop, notebook, dan perangkat lain yang mendukung fitur WiFi (Wireless Fidelity), memungkinkan pengguna untuk terhubung ke internet tanpa menggunakan kabel. Jaringan WiFi mencakup seluruh area kampus, sehingga civitas universitas dapat terhubung secara nirkabel dari PC, laptop, notebook, atau gadget seperti handphone dalam radius jangkauan sinyal atau frekuensi yang ada.\n" +
                    "\n" +
                    "Dengan adanya fasilitas ini, semua civitas universitas dapat melakukan berbagai aktivitas online, termasuk menjelajahi internet, mengirim email, chatting, melakukan transaksi perbankan, mengunduh referensi kuliah, artikel, dan pustaka. Mereka dapat memanfaatkan waktu menunggu kuliah berikutnya, bersantai, atau bertemu rekan bisnis secara online, serta menggunakan fasilitas yang membutuhkan akses internet.Fasilitas ini memberikan kenyamanan dan fleksibilitas bagi civitas universitas dalam meningkatkan produktivitas. Mereka dapat mengakses internet yang dibutuhkan kapan saja dan di mana saja di seluruh area kampus. \n" +
                    "\n" +
                    "Akses WiFi yang mudah juga mendukung pembelajaran dan kolaborasi yang lebih baik antara mahasiswa, dosen, dan staf.Dengan menyediakan jaringan WiFi yang mencakup seluruh kampus, Universitas Sebelas Maret menunjukkan komitmennya dalam menyediakan infrastruktur yang mendukung penggunaan teknologi informasi dan komunikasi. Ini merupakan langkah positif dalam meningkatkan pengalaman belajar dan bekerja bagi civitas universitas."
            "Transportasi Kampus" -> "Bus Kampus. Universitas Sebelas Maret (UNS) Surakarta menyediakan fasilitas kendaraan berupa Bus Kampus UNS. Bus memberikan layanan pengantaran mengelilingi titik-titik halte yang tersedia di dalam lingkungan UNS. Sarana transportasi ini dapat digunakan oleh seluruh sivitas akademika UNS.\n" +
                    "\n" +
                    "Fasilitas bus kampus bersifat gratis atau tidak memungut biaya kepada para penumpangnya. Operasional Bus Kampus UNS berjalan selama hari kerja secara rutin, yakni sejak Senin hingga Jumat. Para penumpang dapat menuju halte-halte UNS terdekat untuk menunggu kedatangan bus ini."
            "UNS Press" -> "UNS PRESS. Penerbitan dan Pencetakan Universitas Sebelas Maret atau yang lebih dikenal dengan nama UPT. UNS Press merupakan unit pelaksanaan teknis yang menjalankan tugas sebagai lembaga penerbitan untuk memenuhi segala keperluan internal UNS dan Masyarakat. UPT. UNS Press ini didirikan dengan tujuan untuk menerbitkan buku, jurnal, majalah, dan produk penerbitan lainnya, terutama hasil karya ilmiah dari civitas akademika UNS maupun masyarakat luas. Baik itu yang berasal dari lingkungan perguruan tinggi maupun dari luar perguruan tinggi, yang bertalian dengan pendidikan, hasil simposium atau seminar, dan hasil penelitian. UPT. UNS Press berusaha untuk selalu menjaga mutu terbitan dan berkomitmen teguh untuk memposisikan diri sebagai penerbit mandiri, profesional, berkualitas, dengan biaya terjangkau.\n" +
                    "\n" +
                    "UPT. UNS Press berdiri pada tanggal 14 Agustus 1989 dengan SK Rektor No. 154/PT.40.D/89 tentang pembentukan Unit Pelaksana Teknis Penerbitan dan Pencetakan Universitas Sebelas Maret. Tugas Utama UPT. UNS Press adalah melakukan kegiatan di bidang penerbitan dan pencetakan yang bersifat teknis, baik dengan buku maupun non buku. Untuk menjawab tantangan perkembangan dunia digital pada masa kini, mulai tahun 2020 lalu UNS Press memperkuat variasi produk dengan merambah produksi e-book. Kemudian untuk mempermudah civitas akademika UNS dan masyarakat mendapatkan buku-buku hasil terbitan UNS Press, maka UNS Press membuka UNS Press Bookstore yang berlokasi di lantai dasar kantor UPT UNS Press. Untuk buku-buku dalam bentuk ebook, UNS Press membuka layanan melalui link https://ebookstore.uns.ac.id/. Dengan pengembangan ini, diharapkan kehadiran UPT UNS Press dapat menjadi sarana pengembangan literasi masyarakat dan dunia Pendidikan Tinggi.\n" +
                    "\n" +
                    "Visi\n" +
                    "UNS Press menjadi industri literasi berwawasan digital dan pusat produksi dan penerbitan buku yang andal, profesional, aktif, dan kreatif di tingkat nasional dan internasional.\n" +
                    "\n" +
                    "Misi\n" +
                    "Memberikan layanan jasa cetak dan penerbitan buku kepada civitas akademika UNS dan Masyarakat\n" +
                    "Memberikan layanan produksi buku digital untuk kemajuan literasi di tengah masyarakat\n" +
                    "Memberikan layanan kerja sama dengan civitas akademika UNS dan masyarakat yang profesional, tangkas, dan kreatif.\n" +
                    "Tujuan\n" +
                    "Mendorong tumbuh dan berkembangnya budaya membaca, menulis, dan menerbitkan buku untuk meningkatkan atmosfir ilmiah.\n" +
                    "Meningkatkan layanan pencetakan dan penerbitan buku, produksi buku digital, serta pelatihan di bidang penerbitan dan pencetakan dalam rangka penguatan bidang akademik.\n" +
                    "Menyebarluaskan buku dan karya ilmiah ke masyarakat luas untuk membangun dan mengembangkan keilmuan dan budaya akademik.\n" +
                    "Menjalin kerja sama dengan lembaga di dalam dan luar negeri dalam rangka meningkatkan kerja sama di bidang penulisan, penerbitan, pencetakan, perakitan, dan pemasaran.\n" +
                    "Meningkatkan sumber daya manusia dalam rangka menjadikan penerbitan dan pencetakan UNS yang andal dan profesional.\n" +
                    "Meningkatkan kualitas produk yang dihasil kan dengan memelihara dan modernisasi peralatan."
            else -> "Informasi tidak tersedia."
        }
    }
    companion object {
        const val EXTRA_FACILITY = "extra_facility"
    }
}