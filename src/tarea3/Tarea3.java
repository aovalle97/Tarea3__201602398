/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author usuario
 */
import java.util.*; // en esta seccion de indica las librerias que se desean utilizar dependiendo de las funciones a lo largo del programa 


public class Tarea3 { 
    
    static Scanner cuenta =new Scanner(System.in); // se usa para que lea el dato a ingresar 
    static Scanner segundo =new Scanner(System.in);
    static Scanner od = new Scanner(System.in);
    static Scanner dat= new Scanner(System.in);
    static Scanner fl= new Scanner (System.in);
    static Scanner orden= new Scanner(System.in); //se esta utilizando en varias secciones del codigo para que se identifique el ingreso de datos mediante el teclado 
static Scanner fn= new Scanner(System.in);
static Scanner fg = new Scanner (System.in);   
    static int contador = 0, a = 0, b = 0, c = 0, d = 0, f = 0, i = 0, g = 0, h = 0;//se utiliza la palabra reservada static para que pueda ser utilizada en las diferentes secciones de codigo
    static int l,p,q,r;
    static double k; // se identifican que los datos ingresados pueden ser decimales 
    static String[] persona; // el string es para que el user ingrese letras
    static int[]dato; 
 
      
        
        static int ag,bg,cg,dg,eg,fm ; // se esta utilizando esta cantidad de variables para el llenado de la matriz, identificando que el ingreso de datos debe de ser numerico
        static int a1, a2,a3,a4;
        static int b1, b2, b3,b4;
        static int c1, c2,c3,c4;
        static int d1, d2, d3,d4;
        static int e1, e2,e3,e4;
       static int f1, f2, f3,f4;
   
        
        
    
    
    
    public static void main(String[] args) {

   while(a != 5){ // se inicia un ciclo el cual termina cuando se ingresan valores diferentes de 5 
       try{ // sis e ingresan cosas diferentes a numeros, inicia de nuevo desde este punto                                                                                               
          
             
        System.out.println("1. usuarios"); // imprime en pantalla un mensaje
        System.out.println("2. Contador de digitos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. calcular promedio");
        System.out.println("5. salir");

        System.out.println("Elija de opció/n deseada ");
        a = Integer.parseInt(cuenta.nextLine());// asigna la informacion ingresada mediante teclado dentro de una variable
          
     
        switch(a){ // inicia un switch para desplegar un menu 
            case 1://si se ingrea 1 utiliza lo programado dentro del metodo ussuario
                usuario();
                System.out.println("\n");// un espacio en blanco 
            break;
            case 2:// si digita 2, utuiliza el metodo digito 
                digito();
                System.out.println("\n");
            break;
            case 3:// si se ingresa un 3 utuiliza lo programado en ordenar 
                ordenar();
                    System.out.println("\n");
            break;
            case 4:// si se elige 4 despliega opciones de la matriz
                promedio();
                    System.out.println("\n");

                break;
            case 5: // si se elige el 5 utiliza la opcion salir 
                System.out.println("salir");
            break;
            default:// si se ignresa algo diferente mostrara un mensaje  oara que eliga el correcto 
           
                System.out.println("ingrese numero adecuado");
                        break;
     }
        
        } catch(Exception e){// segunda parte del try, es la expepcion que se le indica
				System.out.println("ingrese un dato valido");
			}
		}

	}
        
    
    
    public static void usuario(){
         while(b != 4){ 
       try{
          
             
        System.out.println("1. ingresar usuario"); // imprime en pantalla un mensaje
        System.out.println("2. mostrar usuario descendente");
        System.out.println("3. mostrar usuario ascendente");
        System.out.println("4. Menu principal");
        

        System.out.println("Elija de opció/n deseada ");
        b = Integer.parseInt(segundo.nextLine());
          
     
        switch(b){
          
            
            case 1:
                
                persona = new String[5];//se identifica que el vector para el campo usuario es de 5 
                
             
                for (int i = 0;i < 5 ;i++){
               System.out.println("Digite el nombre de usuario"+i);
                           
               persona[i] = od.nextLine();// indica que mediante el contador, va cambiando la var donde se va ingresando  el user 

//                if (persona[0].equals(persona[1]))
//                        {
//                   System.out.println("dato repetido ");
//                        }
//
//                
//                if (persona[1]==(persona[0]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[1] = od.nextLine();
//                contador=contador+1;
//                }
//                else
//                if ((persona[2]== persona[0]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[2] = od.nextLine();
//                contador=contador+1;
//                }
//                else
//                if ((persona[2]== persona[1]))
//                {
//                contador=contador+1;
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[2] = od.nextLine();
//                                }
//                  else
//                if ((persona[3]== persona[0]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[3] = od.nextLine();
//                contador=contador+1;
//                }
//                 else
//                if ((persona[3]== persona[1]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[3] = od.nextLine();
//               contador=contador+1;
//                }
//                else
//                if ((persona[3]== persona[2]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[3] = od.nextLine();
//                contador=contador+1;
//                }
//                else
//                if ((persona[4]== persona[0]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[4] = od.nextLine();
//                contador=contador+1;
//                }
//                else
//                if ((persona[4]== persona[1]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[4] = od.nextLine();
//                contador=contador+1;
//                }
//                else
//                if ((persona[4]== persona[2]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[4] = od.nextLine();
//                contador=contador+1;
//                }
//                else
//                if ((persona[4]== persona[3]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[4] = od.nextLine();
//                contador=contador+1;
//                }
                }
             
                
                        
                               
            break;
            case 2:
            for (int i = 0;i <5; i++){// hace que se muestren los ususarios segun ingresaron
            System.out.println(persona[i]+",");
           
             }
          break;
            case 3: 
          for (int i = 4;i >=0; i--){// mostrara los datos a la forma inversa de como ingresaron 
            System.out.println(persona[i]+",");
             }
             break;
            case 4:
                System.out.println("Menu principal");
            break;
            default:
           
                System.out.println("ingrese numero adecuado");
                        break;
     }
        
        } catch(Exception e){
				System.out.println("ingrese un dato valido");
			}
		}

    }
        
   public static void digito(){
         while(c != 4){ 
       try{
          
             
        System.out.println("1. ingrear numero"); // imprime en pantalla un mensaje
        System.out.println("2. mostrar numero de digitos");
        System.out.println("4. Menu principal");
        

        System.out.println("Elija de opció/n deseada ");
        c = Integer.parseInt(segundo.nextLine());
          
     
        switch(c){
            case 1:
                try{
           do{
            System.out.println("Ingrese valor"); //Escribe en pantalla
            h = Integer.parseInt(fl.next());   //guarda el numero que se ingresa 
           }while(h<0||h>100000);// repetira la accion mientras no se cumpla el rando de datos
           } catch(Exception e){
				System.out.println("ingrese un dato valido");
           }

//            if (h>100000){
//                System.out.println("ingrese una dato menor a 100000");
//            h = Integer.parseInt(fl.next());       
//            }
//            else if (h<0)
//            {System.out.println("ingrese un dato mayor que 0");
//            h = Integer.parseInt(fl.next());    
//            }
            break;
            case 2:
            if(h == 0) h++; //valua que si el dato es 0 cuenta como 1 digito
            System.out.println("el numero de digitos es :" + Math.floor(Math.log10(h) + 1));// el dato se convierte a un decimal pero antes el dato ingresado se opera dentro de 10 
  
            break;
            case 4:
                System.out.println("menu");
            break;
            default:
           
                System.out.println("ingrese numero adecuado");
                        break;
     }
        
        } catch(Exception e){
				System.out.println("ingrese un dato valido");
			}
		}
   
   }
       
 public static void ordenar(){
               
     while(d != 4){ 
       try{
          
             
        System.out.println("1. Ingresar numeros"); // imprime en pantalla un mensaje
        System.out.println("2.  Mostrar ordenados");
        System.out.println("4. Menu principal");
        
        System.out.println("Elija de opció/n deseada ");
        d = Integer.parseInt(segundo.nextLine());
          
     
        switch(d){
           
            case 1://ingresa cada digito uno por uno y lo asigna a una variable 
           try{
  
            System.out.println("ingrese primer numero");
            p =Integer.parseInt(orden.next());
            System.out.println("ingrese segundo numero");
            q = Integer.parseInt(orden.next());
            System.out.println("ingrese tercer numero");
            r = Integer.parseInt(orden.next());
            } catch(Exception e){
				System.out.println("ingrese solo numeros ");
			}           
            break;
            case 2:
            System.out.println("Mostrar ordenados");
           if (p >q && p>r && q >r){  // con una serie de ifs se va valuando para que se ordenen los datos 
               System.out.println(p+","+q+","+r);
           }else 
               if(p>q && p>r && r>q){
               System.out.println(p+","+r+","+q);
               }
            else 
               if(q>p && q>r && p>r){
               System.out.println(q+","+p+","+r);
               }   
           else 
               if(q>p && q>r && r>p){
               System.out.println(q+","+r+","+p);
               }   
            else 
               if(r>p && r>q && p>q){
               System.out.println(r+","+p+","+q);
               }   
            else 
               if(r>p && r>q && q>p){
               System.out.println(r+","+q+","+p);
               }   
                     
           break;
            case 4:
                System.out.println("menu");
            break;
            default:
           
                System.out.println("ingrese numero adecuado");
                        break;
     }
        
        } catch(Exception e){
				System.out.println("ingrese un dato valido");
			}
		}

    }
          
    
     public static void promedio(){// para este codigo se tomo parte del codigo proporcionado en el classroom 
             int matriz [] [] = new int [6][6];// se declara la matriz su nombre como el ta;ano que tendra 
          int fila; // se declaran 2 variables 
        int columna;
         
         while(f != 4){ 
      try{
          
             
        System.out.println("1. ingresar usuario y despliegue de notas"); // imprime en pantalla un mensaje
        
        System.out.println("4. Menu principal");
        

        System.out.println("Elija de opció/n deseada ");
        f = Integer.parseInt(segundo.nextLine());
          
     
        switch(f){
            case 1:
              
                                  // se pide que se ingresen los usuarios como tambien las notas de los alumnos 
        System.out.println("ingrese el id del primer alumno");
        ag = Integer.parseInt(fn.nextLine());
        System.out.println("ingrese primera nota ");
        a1 = fg.nextInt();
        System.out.println("ingrese segunda nota ");
        a2 = fg.nextInt();
        System.out.println("ingrese tercera nota ");
        a3 = fg.nextInt();
        System.out.println("ingrese cuarta nota ");
        a4 = fg.nextInt();


        System.out.println("ingrese el id del segundo alumno");
        bg = fn.nextInt();
        System.out.println("ingrese primera nota ");
        b1 = fg.nextInt();
        System.out.println("ingrese segunda nota ");
        b2 = fg.nextInt();
        System.out.println("ingrese tercera nota ");
        b3 = fg.nextInt();
        System.out.println("ingrese cuarta nota ");
        b4 = fg.nextInt();
        
        
        System.out.println("ingrese el id del tercer alumno");
        cg = fn.nextInt();
        System.out.println("ingrese primera nota ");
        c1 = fg.nextInt();
        System.out.println("ingrese segunda nota ");
        c2 = fg.nextInt();
        System.out.println("ingrese tercera nota ");
        c3 = fg.nextInt();
        System.out.println("ingrese cuarta nota ");
        c4 = fg.nextInt();    
       
        System.out.println("ingrese el id del cuarto alumno");
        dg = fn.nextInt();
        System.out.println("ingrese primera nota ");
        d1 = fg.nextInt();
        System.out.println("ingrese segunda nota ");
        d2 = fg.nextInt();
        System.out.println("ingrese tercera nota ");
        d3 = fg.nextInt();
        System.out.println("ingrese cuarta nota ");
        d4 = fg.nextInt();
        
        
        System.out.println("ingrese el id del quinto alumno");
        eg = fn.nextInt();
        System.out.println("ingrese primera nota ");
        e1 = fg.nextInt();
        System.out.println("ingrese segunda nota ");
        e2 = fg.nextInt();
        System.out.println("ingrese tercera nota ");
        e3 = fg.nextInt();
        System.out.println("ingrese cuarta nota ");
        e4 = fg.nextInt();
        
        
        System.out.println("ingrese el id del sexto alumno");
        fm = fn.nextInt();
        System.out.println("ingrese primera nota ");
        f1 = fg.nextInt();
        System.out.println("ingrese segunda nota ");
        f2 = fg.nextInt();
        System.out.println("ingrese tercera nota ");
        f3 = fg.nextInt();
        System.out.println("ingrese cuarta nota ");
        f4 = fg.nextInt();
        
                            
          // se declaran las variables alumn n para que se ordenen los datos anteriormente ingresados, ademas se operan para que realicen el promedio de notas 
         
        int alumno1[] ={ag,a1,a2,a3,a4,((a1+a2+a3+a4)/4) };
        
        int alumno2[] ={bg,b1,b2,b3,b4,((b1+b2+b3+b4)/4) };

        int alumno3[] ={cg,c1,c2,c3,c4,((c1+c2+c3+c4)/4) };

       int alumno4[] ={dg,d1,d2,d3,d4,((d1+d2+d3+d4)/4) };

        int alumno5[] ={eg,e1,e2,e3,e4,((e1+e2+e3+e4)/4) };

        int alumno6[] ={fm,f1,f2,f3,f4,((f1+f2+f3+f4)/4) };
       
        // inicia un ciclo for, donde ira incrementado tanto las filas como columnas al estar 2 for anidados, esto es pra que vaya cmabinado la posicion dela matris para 
        // que se vayan ordenando los datos ingreados 
         for(fila = 0; fila<matriz.length; fila++){
            for(columna = 0; columna<matriz.length; columna++){
                if(fila==0){// se valuan condiciones if para que asi se les vaya ingresando cada una de las variables alumno n para orden de la matriz 
                matriz[fila][columna]=alumno1[columna];
                } else if(fila==1){
                matriz[fila][columna]=alumno2[columna];
                }else if(fila==2){
                matriz[fila][columna]=alumno3[columna];
                }else if(fila ==3){
                matriz[fila][columna]=alumno4[columna];
                }else if(fila ==4){
                matriz[fila][columna]=alumno5[columna];
                }else if(fila ==5){
                matriz[fila][columna]=alumno6[columna];
                }                                             
                }
            }
                
         for(fila = 0; fila<matriz.length; fila++){
             
            for(columna = 0; columna<matriz.length; columna++){
                System.out.print("\t"+matriz[fila][columna]+" ");
          // con esto unicamente es par imprimir todos los datos dentr4o de pantalla                                    
   
            }
         System.out.println("");    
        }

            case 4:
           
                System.out.println(" menu");
            break;
            default:
           
                System.out.println("ingrese numero adecuado");
                        break;
     }
        
        } catch(Exception e){
				System.out.println("ingrese un dato valido");
			}
		}

    }
     
    
   
    
    
        }
