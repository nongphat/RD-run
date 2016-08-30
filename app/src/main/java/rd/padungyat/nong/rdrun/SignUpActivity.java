package rd.padungyat.nong.rdrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUpActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร ประกอบด้วย 1) access การเข้าถีง (public,private) 2)data type 3)name
    private EditText nameEditText, surnameEditText, userEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton avata1RadioButton, avata2RadioButton, avata3RadioButton, avata4RadioButton,
            avata5RadioButton;
    private String nameString,surnameString,userString, passwordString,avataString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind or Initial Widget คือการผูกความสัมพันธ์ระหว่างตัวแปร และ Widget (เช่น Text RadioBottom)
        //findViewById
        nameEditText = (EditText) findViewById(R.id.editText);
        surnameEditText = (EditText) findViewById(R.id.editText2);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);
        radioGroup = (RadioGroup) findViewById(R.id.ragAvata);
        avata1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        avata2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        avata3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        avata4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        avata5RadioButton = (RadioButton) findViewById(R.id.radioButton5);

    }//Main Method

    public void clickSignUpSign(View view) {

        //Get Value From Edit Text
        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space การตรวจสอบหาช่องว่าง checkSpace เป็นตัวแปร
        if (checkSpace()) {

            //True
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,R.drawable.nobita48, "มีช่องว่าง","กรุณากรอกทุกช่อง ครับผม");
        }

    }//clickSign

    private boolean checkSpace() {

        boolean result = false;
        // เครื่องหมาย || คือ เงื่อนไข or
        if (nameString.equals("") ||
                surnameString.equals("") ||
                userString.equals("") ||
                passwordString.equals("")) {
            result  = true;

        }
        return result;
    }
} //Main class
