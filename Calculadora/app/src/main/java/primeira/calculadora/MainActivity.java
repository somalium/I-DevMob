package primeira.calculadora;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private double operacao1;
    private double operacao2;

    private String operacao;


    EditText edtResult;
    Button btn9;
    Button btn8;
    Button btn7;
    Button btn6;
    Button btn5;
    Button btn4;
    Button btn3;
    Button btn2;
    Button btn1;
    Button btn0;
    Button btnDivisao;
    Button btnMultip;
    Button btnSub;
    Button btnSoma;
    Button btnPonto;
    Button btnIgual;
    Button btnLimpar;
    Button btnSair;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializador();
        clickdoBotão();




    }


    private void inicializador(){

        edtResult=(EditText)findViewById(R.id.edtVIsor);
        btn9    = (Button)findViewById(R.id.btn9);
        btn8    = (Button)findViewById(R.id.btn8);
        btn7    = (Button)findViewById(R.id.btn7);
        btn6    = (Button)findViewById(R.id.btn6);
        btn5    = (Button)findViewById(R.id.btn5);
        btn4    = (Button)findViewById(R.id.btn4);
        btn3    = (Button)findViewById(R.id.btn3);
        btn2    = (Button)findViewById(R.id.btn2);
        btn1    = (Button)findViewById(R.id.btn1);
        btn0    = (Button)findViewById(R.id.btn0);
        btnDivisao  =   (Button)findViewById(R.id.btnDivisao);
        btnMultip   =   (Button)findViewById(R.id.btnMultiplica);
        btnSub      =   (Button)findViewById(R.id.btnSub);
        btnSoma     =   (Button)findViewById(R.id.btnSoma);
        btnPonto    =   (Button)findViewById(R.id.btnPonto);
        btnIgual    =   (Button)findViewById(R.id.btnIgual);
        btnLimpar   =   (Button)findViewById(R.id.btnLimpar);
        btnSair     =   (Button)findViewById(R.id.btnSair);



    }



    private void clickdoBotão(){
        //Click dos botoes numericos
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tecladoNumerico(9);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tecladoNumerico(8);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tecladoNumerico(7);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tecladoNumerico(6);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tecladoNumerico(5);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tecladoNumerico(4);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tecladoNumerico(3);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tecladoNumerico(2);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tecladoNumerico(1);

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tecladoNumerico(0);

            }
        });


        //Click dos botoes das operaçoes
        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao!="/")
                {
                    operadores("/");
                }



            }
        });
        btnMultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(operacao!="*")
                {
                    operadores("*");
                }



            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(operacao!="-")
                {
                    operadores("-");
                }


            }
        });
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(operacao!="+")
                {
                    operadores("+");
                }


            }
        });


        //Click dos botoes de igual, ponto, limpar e sair
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                igual();

            }
        });
        btnPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ponto(".");

            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limparVisor();

            }
        });
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fecharAplicacao();

            }
        });

    }

    public void tecladoNumerico(int leNumero){

        if (edtResult.getText().toString().trim().equals("0.0")){


            limparVisor();
            edtResult.setText(edtResult.getText().toString().trim()+String.valueOf(leNumero));
        }else{
            edtResult.setText(edtResult.getText().toString().trim()+String.valueOf(leNumero));
        }
    }

    public void limparVisor(){
        edtResult.setText("");

    }

    public void ponto(String ponto){
        edtResult.setText(edtResult.getText().toString().trim()+ponto);

    }


    private void operadores(String operacao)
    {

        this.operacao=operacao;



        if(operacao == "/"){

            operacao1=Double.parseDouble(edtResult.getText().toString().trim());
            limparVisor();

        }
        if(operacao == "*"){

            operacao1=Double.parseDouble(edtResult.getText().toString().trim());
            limparVisor();

        }
        if(operacao == "-"){

            operacao1=Double.parseDouble(edtResult.getText().toString().trim());
            limparVisor();

        }
        if(operacao == "+"){

            operacao1=Double.parseDouble(edtResult.getText().toString().trim());
            limparVisor();

        }


    }


    private void igual()
    {
        if(!edtResult.getText().toString().trim().equals(""))
        {
            if (operacao=="/")
            {
                if(operacao1==0)
                {
                    operacao2=0;
                }else{
                    operacao2=operacao1/Double.parseDouble(edtResult.getText().toString().trim());
                }

            }else if (operacao=="*")
            {
                operacao2=operacao1*Double.parseDouble(edtResult.getText().toString().trim());
            }else if (operacao=="-")
            {
                operacao2=operacao1-Double.parseDouble(edtResult.getText().toString().trim());
            }else if (operacao=="+")
            {
                operacao2=operacao1+Double.parseDouble(edtResult.getText().toString().trim());
            }

        }else
        {
            operacao2=0;
        }

        edtResult.setText(String.valueOf(operacao2));


    }


    public void fecharAplicacao()
    {

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {


                MainActivity.this.finish();

            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();

            }
        });


        dialog.setTitle("Fechar");
        dialog.setMessage("Deseja realmente fechar a aplicação?");
        dialog.setIcon(android.R.drawable.ic_menu_close_clear_cancel);
        dialog.show();
    }



}
