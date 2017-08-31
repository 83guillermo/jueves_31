import java.util.Scanner;

public class Ejercicio1_while {
	
	private static Scanner n;
	public static void eje1(){
		int numero=0;
		while(numero<10){
			numero++;
			System.out.println(numero);
			
		}
		
		
	}
	public static void eje2(){
		int numeros =11;
		while(numeros > 1){
			numeros--;
			System.out.println(numeros);
		}
				
		
	}
	public static void eje3(){
	
		Scanner s = new Scanner(System.in);
		System.out.println("por favor ingrese la clave :");
		String clave = s.nextLine(); 
		while(!clave.equals("utn750")){
			System.out.println("incorrecta, ingrese la clave :");
			clave = s.nextLine();
		
		}
		System.out.println("felicidades la clave es correcta"); 
	}
	
	
	
	public static void eje4(){
		
	    int numero_usuario ;
	
		
		Scanner n = new Scanner(System.in);
		
		
		System.out.println("por favor ingrese un numero del 0 al 9 : ");
	
		numero_usuario= Integer.parseInt(n.nextLine());
		
		while(numero_usuario<=0 || numero_usuario>=10) 
		{
			System.out.println("error al ingresae el numero no esta dentro de 0 al 9");
			numero_usuario= Integer.parseInt(n.nextLine());
			}
			System.out.println("es correcto !");
			
		}
	
		public static void eje5(){
			/* ejercicio hacer que el usuario ingrese el sexo 
			 * con m para masculino y f para femenino
			 */
			
		}
		 
	}
		
		
		
		
		
		
	
		


