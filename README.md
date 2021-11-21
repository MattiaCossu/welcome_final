Fase 1 - disegnare l'interfaccia delle due activity, assegnando nomi significativi ai controlli grafici

Dal layout create inserisco tre bottoni e un editText ed effettuo i vari ancoraggi sulla prima activity (activity_main); 
Creao una seconda activity (activity_main2) ed inserisco un viewtext e una immagine sempre dal'iditor visuale;
Assegno nomi significativi a ogni widget;


Fase 2 - realizzare il comportamento del bottone Reset, Test
Reset:
All'interno della main activity principale creo due oggetti: un EditText (edt) e un Button (btn_clear);
All'interno del costruttore "ancoro" i due oggetti ai widget recuperandoli tramite l'id:

        edt = findViewById(R.id.editTextTextPersonName);
        btn_clear = findViewById(R.id.button_resert);

imposto una funzione listner al bottone di reset:

	btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.getText().clear();
            }
        });

Test:
Ho inserito un capo di testo che al trigger del tasto test cambierà con il nome inserito dall'utente;
ho creato un listener per il tasto di test:

  	btn_test.setOnClickListener(new View.OnClickListener() {
            	@Override
            	public void onClick(View v) {
            	    	TextView tv = (TextView) findViewById(R.id.name);
                	tv.setText(edt.getText());
            	}
        });
