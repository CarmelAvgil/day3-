package com.example.android.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddMovieMenually extends AppCompatActivity {
 private String title;
 private String description;
 private String image;
 private EditText editTextTitle= (EditText)findViewById(R.id.titleEditText);
 private EditText editTextDescription=(EditText)findViewById(R.id.descriptionEditText);
 private EditText editTextImage=(EditText)findViewById(R.id.imageLinkEditText) ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie_menually);

        Intent i = getIntent();
        int action = i.getIntExtra("action",0);
        if (action==1) {
            title = i.getStringExtra("MovieTitle");
            description = i.getStringExtra("MovieDescription");
            image = i.getStringExtra("MovieImage");
            setText(title,description,image);
        }

    }



    public void getText(){
    title= editTextTitle.getText().toString();
    description= editTextDescription.getText().toString();
    image= editTextImage.getText().toString();
}


    public void setText(String title,String description, String image){
        editTextTitle.setText(title.toString());
        editTextDescription.setText(description.toString());
        editTextImage.setText(image.toString());
   }




    public void cancelButton_onClick(View view) {
        finish();
    }

    public void showButton_onClick(View view) {
    }
}
