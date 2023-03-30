package com.example.activitylifecyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On Create", Toast.LENGTH_LONG).show();
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Restart", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnDeystroy", Toast.LENGTH_LONG).show();
    }

    // pada pertemuan hari ini yang saya bisa simpulkan kita bisa membuat proctected void yang dimana itu
    // secara berurutan wwlapun kita acak itu akan secara berururt
//    Activity Lifecycle di Android Studio adalah urutan kejadian atau peristiwa yang terjadi selama siklus hidup sebuah Activity (tampilan atau halaman) pada aplikasi Android.
//
//Siklus hidup Activity terdiri dari beberapa tahapan, yaitu:
//
//OnCreate(): tahap pertama yang dipanggil saat Activity dibuat. Pada tahap ini, biasanya dilakukan inisialisasi komponen-komponen dasar seperti layout, view, dan variabel-variabel yang dibutuhkan dalam Activity.
//
//OnStart(): tahap ini dipanggil setelah Activity dibuat dan siap untuk ditampilkan ke pengguna. Pada tahap ini, Activity masih tidak dapat diinteraksi oleh pengguna.
//
//OnResume(): tahap ini dipanggil ketika Activity sudah siap dan dapat diinteraksi oleh pengguna.
//
//OnPause(): tahap ini dipanggil ketika Activity kehilangan fokus atau sebagian tertutup oleh Activity lain. Pada tahap ini, biasanya dilakukan penyimpanan data yang masih diperlukan agar tidak hilang saat Activity ditutup.
//
//OnStop(): tahap ini dipanggil ketika Activity tidak lagi terlihat oleh pengguna. Pada tahap ini, biasanya dilakukan pelepasan sumber daya yang tidak diperlukan agar tidak membebani sistem.
//
//OnDestroy(): tahap ini dipanggil ketika Activity benar-benar ditutup dan dihapus dari memori. Pada tahap ini, biasanya dilakukan pelepasan sumber daya yang masih diperlukan.
//
//Selama siklus hidup Activity, sistem Android dapat memanggil metode-metode tambahan seperti OnRestart() dan OnSaveInstanceState() tergantung pada keadaan sistem saat itu. Mengetahui siklus hidup Activity sangat penting untuk mengembangkan aplikasi Android yang efisien dan stabil
}