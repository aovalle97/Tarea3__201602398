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
import java.util.*;


public class Tarea3 { 
    
    static Scanner cuenta =new Scanner(System.in); // se usa para que lea el dato a ingresar 
    static Scanner segundo =new Scanner(System.in);
    static Scanner od = new Scanner(System.in);
    static Scanner dat= new Scanner(System.in);
    static Scanner fl= new Scanner (System.in);
    static Scanner orden= new Scanner(System.in); 
    static int a = 0;
    static int b = 0; 
    static int c = 0;
    static int d = 0;
    static int f = 0;
    static int i = 0;
    static int g = 0;
    static int h = 0;
    static int l,p,q,r;
    static double k; 
    static String[] persona;
    static int[]dato;
    public static void main(String[] args) {

   while(a != 5){ 
       try{
          
             
        System.out.println("1. usuarios"); // imprime en pantalla un mensaje
        System.out.println("2. Contador de digitos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. calcular promedio");
        System.out.println("5. salir");

        System.out.println("Elija de opció/n deseada ");
        a = Integer.parseInt(cuenta.nextLine());
          
     
        switch(a){
            case 1:
                usuario();
                System.out.println("usuarios");
            break;
            case 2:
                digito();
                System.out.println("contador de digitos");
            break;
            case 3:
                ordenar();
                    System.out.println("tres numeros de mayor a menor");
            break;
            case 4:
                System.out.println("calcular promedios");
            break;
            case 5:
                System.out.println("salir");
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
        
    
    
    public static void usuario(){
         while(b != 4){ 
       try{
          
             
        System.out.println("1. ingresar usuario"); // imprime en pantalla un mensaje
        System.out.println("2. mostrar usuario ascendente");
        System.out.println("3. mostrar usuario descendente");
        System.out.println("4. Menu principal");
        

        System.out.println("Elija de opció/n deseada ");
        b = Integer.parseInt(segundo.nextLine());
          
     
        switch(b){
            case 1:
                System.out.println("usuarios");
                persona = new String[5];
                for (int i = 0;i < 5 ;i++){
                
                 System.out.println("Digite el nombre de usuario"+i);
                persona[i] = od.nextLine();
                
//                if (persona[1]==(persona[0]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[1] = od.nextLine();
//                }
//                else
//                if ((persona[2]== persona[0]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[2] = od.nextLine();
//                }
//                else
//                if ((persona[2]== persona[1]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[2] = od.nextLine();
//                }
//                  else
//                if ((persona[3]== persona[0]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[3] = od.nextLine();
//                }
//                 else
//                if ((persona[3]== persona[1]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[3] = od.nextLine();
//                }
//                else
//                if ((persona[3]== persona[2]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[3] = od.nextLine();
//                }
//                else
//                if ((persona[4]== persona[0]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[4] = od.nextLine();
//                }
//                else
//                if ((persona[4]== persona[1]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[4] = od.nextLine();
//                }
//                else
//                if ((persona[4]== persona[2]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[4] = od.nextLine();
//                }
//                else
//                if ((persona[4]== persona[3]))
//                {
//                System.out.println("Usuario ya existente ingrese un usuario diferente");
//                persona[4] = od.nextLine();
//                }
                }
                       
                
                        
                               
            break;
            case 2:
            for (int i = 0;i <5; i++){
            System.out.print(persona[i]+",");
             }
          break;
            case 3:
          for (int i = 4;i >=0; i--){
            System.out.print(persona[i]+",");
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
            System.out.println("Ingrese valor"); //Escribe en pantalla
            h = Integer.parseInt(fl.next());    
               
            break;
            case 2:
            if(h == 0) h++;
            System.out.println(Math.floor(Math.log10(h) + 1));
  
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
            case 1:
            System.out.println("ingrese primer numero");
            p = orden.nextInt();
            System.out.println("ingrese segundo numero");
            q = orden.nextInt();
            System.out.println("ingrese tercer numero");
            r = orden.nextInt();
            break;
            case 2:
            System.out.println("Mostrar ordenados");
           if (p >q && p>r && q >r){
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
          
    
     public static void promedio(){
         while(f != 4){ 
       try{
          
             
        System.out.println("1. ingresar usuario"); // imprime en pantalla un mensaje
        System.out.println("2. mostrar usuario ascendente");
        System.out.println("3. mostrar usuario descendente");
        System.out.println("4. Menu principal");
        

        System.out.println("Elija de opció/n deseada ");
        f = Integer.parseInt(segundo.nextLine());
          
     
        switch(f){
            case 1:
                System.out.println("usuarios");
            break;
            case 2:
                System.out.println("contador de digitos");
            break;
            case 3:
                    System.out.println("tres numeros de mayor a menor");
            break;
            case 4:
                System.out.println("calcular promedios");
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
