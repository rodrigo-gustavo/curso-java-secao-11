import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ManipulandoData {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();// Instanciando Calendar
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);// adiciona dia, hora, minuto dentre outros métodos ao calendário
		d = cal.getTime(); // atualizando a variavel "d" com a nova data

		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		int second = cal.get(Calendar.SECOND);

		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		System.out.println("Second: " + second);
		System.out.println();
		System.out.print("Digite uma data qualquer (dd/MM/yyyy): ");
		String date = sc.nextLine();
		int d_day = Integer.parseInt(date.substring(0, 2));
		int d_month = Integer.parseInt(date.substring(3, 5));
		int d_year = Integer.parseInt(date.substring(6));

		System.out.println();
		System.out.println("O dia digitado foi: " + d_day);
		System.out.println("O mês digitado foi: " + d_month);
		System.out.println("O ano digitado foi: " + d_year);

		sc.close();

	}

}
