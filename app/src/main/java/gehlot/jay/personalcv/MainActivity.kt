package gehlot.jay.personalcv

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistory)

        workHistory.setOnClickListener {

            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)

        }

        var callJay = findViewById<Button>(R.id.callJay)

        callJay.setOnClickListener {

            var phoneUri = Uri.parse("tel:07859815100")
            var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }

        var emailJay = findViewById<Button>(R.id.emailJay)

        emailJay.setOnClickListener {

            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setData(Uri.parse("mailto:"))
            emailIntent.setType("text/plain")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("gehlotj@gmail.com"))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice CV :-)")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "CV looks good! When can we speak further? I multiple App developer roles for you!")

            startActivity(emailIntent)
        }

    }
}
