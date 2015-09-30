package br.ufrn.imd.bibliotecasufrn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {

    private EditText usuarioEditText;
    private EditText senhaEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuarioEditText = (EditText) findViewById(R.id.usuarioEditText);
        senhaEditText = (EditText) findViewById(R.id.senhaEditText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void login(View view) {
        boolean erro = false;
        if (usuarioEditText.getText().toString().trim().equals("")) {
            usuarioEditText.setError("Digite um login válido");
            erro = true;
        }
        if (senhaEditText.getText().toString().trim().equals("")) {
            senhaEditText.setError("Digite uma senha válida");
            erro = true;
        }

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);

        //passar os valores do login  e senha, verificar se estao corretos (comparar com om BD) e chamar a MainActivity
        //intent.putExtra("");
        startActivity(intent);

    }
}
