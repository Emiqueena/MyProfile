package com.example.android.myprofile;


        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openEmail(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","yiungemiqueena@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

    public void openLinkedin(View view){
        String url = "http://www.Linkedin.com/emem";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void openTwitter(View view){
        String url = "http://www.twitter.com/ememjonah2";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void openFacebook(View view){
        String url = "http://www.facebook.com/ememjonah";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}




