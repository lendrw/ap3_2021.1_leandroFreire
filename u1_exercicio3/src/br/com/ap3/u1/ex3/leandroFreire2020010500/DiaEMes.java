package br.com.ap3.u1.ex3.leandroFreire2020010500;

import java.util.Date;
import java.util.Calendar;

public class DiaEMes {
	
	 public static void main(String[] args) {
	    	Date data = new Date();
	    	Calendar cal = Calendar.getInstance();
	    	cal.setTime(data);
	    	int dia = cal.get(Calendar.DAY_OF_MONTH);
	    	int mes = cal.get(Calendar.MONTH);
	    	
			for(int i = 0; i < 10000; i++)
			System.out.println("Hoje é dia " +dia+ " de mês " +(mes+1));
			
		}

}
