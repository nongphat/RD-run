package rd.padungyat.nong.rdrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private ImageView imageView;
    private EditText userEditText, passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget พิมพ์ ImageView findViewById(R.id.xxxxx) กดปุ่ม ctrl+Enter (เป็นการ Cache Data)
        imageView = (ImageView) findViewById(R.id.imageView6);
        userEditText = (EditText) findViewById(R.id.editText5);
        passwordEditText = (EditText) findViewById(R.id.editText6);

        //Load Image from Server
        Picasso.with(this).load("http://swiftcodingthai.com/rd/image/rd_logo.png")
                .resize(150,150).into(imageView);


    } //Main Method นี่คือ Method ซึ่งจะเก็บ Statement ไว้ (ต.ย.นี้มีทั้งหมด 2 statement)

    public void clickSignInMain(View view) {

    }// clickSignIn

    //Get Event from Click Button
    public void clickSignUpMain(View view) {
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }
}
//Main Class นี่คือ Class หลัก
