package `in`.foodbychoice.fbcprototypefirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        SystemClock.sleep(3000)

//        val handler : Handler = Handler()
//        handler.postDelayed(Runnable {  }, 3000)

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        this.finish()
    }
}