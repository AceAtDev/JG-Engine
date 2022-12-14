package Game.Main;

import Game.Tools;

final class Title {
   
   public static void draw(){
      System.out.println("░█████╗░██╗░░░██╗██████╗░██╗░█████╗░");
      System.out.println("██╔══██╗██║░░░██║██╔══██╗██║██╔══██╗");
      System.out.println("██║░░╚═╝██║░░░██║██████╦╝██║██║░░╚═╝");
      System.out.println("██║░░██╗██║░░░██║██╔══██╗██║██║░░██╗");
      System.out.println("╚█████╔╝╚██████╔╝██████╦╝██║╚█████╔╝");
      System.out.println("░╚════╝░░╚═════╝░╚═════╝░╚═╝░╚════╝░");
      System.out.println("");
      System.out.println("    ██████╗░░█████╗░░█████╗░███╗░░░███╗░██████╗");
      System.out.println("    ██╔══██╗██╔══██╗██╔══██╗████╗░████║██╔════╝");
      System.out.println("    ██████╔╝██║░░██║██║░░██║██╔████╔██║╚█████╗░");
      System.out.println("    ██╔══██╗██║░░██║██║░░██║██║╚██╔╝██║░╚═══██╗");
      System.out.println("    ██║░░██║╚█████╔╝╚█████╔╝██║░╚═╝░██║██████╔╝");
      System.out.println("    ╚═╝░░╚═╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚═════╝░");

      Tools.AskString("Press ENTER to play!");
   }

}
