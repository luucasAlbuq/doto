package randoop;

import junit.framework.*;

public class RandoopTest8 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test1");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test2");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    java.lang.String var13 = var5.getEspecialidade();
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var20 = var19.getNome();
    java.lang.String var21 = var19.getNumeroRegistro();
    int var22 = var19.getAvaliacaoPositiva();
    var19.setTipo("hi!, hi!\nhi!\n, ");
    int var25 = var19.getAvaliacaoPositiva();
    var19.addConvenio("hi!, hi!\nhi!\n, ");
    int var28 = var19.getAvaliacaoPositiva();
    boolean var33 = var19.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var19.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var19.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var19.setNome("hi!, \nhi!\n, ");
    boolean var40 = var5.equals((java.lang.Object)var19);
    var19.addConvenio("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test3");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var6 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, hi!"+ "'", var6.equals("hi!, hi!\nhi!\n, hi!"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test4");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    var20.setTipo("hi!, \nhi!\n, ");
    boolean var29 = var5.equals((java.lang.Object)var20);
    boolean var34 = var20.verificaParametros("hi!, \nhi!\n, ", "", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var20.setRegistro("hi!, hi!\n\n, ");
    var20.setNumeroRegistro("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test5");


    model.Usuario var2 = new model.Usuario(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", ", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test6");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var5.getNome();
    java.lang.String var9 = var5.getConvenio();
    java.lang.String var10 = var5.getNumeroRegistro();
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var9.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\n, "));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test7");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var5.getEspecialidade();
    var5.setTipo("hi!\n");
    java.lang.String var19 = var5.getEspecialidade();
    int var20 = var5.getAvaliacaoPositiva();
    var5.setNumeroRegistro("hi!, hi!\n\n, , \nhi!\n, ");
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("", "hi!", false);
    java.lang.String var33 = var32.getIdUsuario();
    var28.addAvaliacao(var32);
    int var35 = var28.getAvaliacaoNegativa();
    boolean var40 = var28.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var28.setNome("");
    model.Avaliacao var46 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    var28.addAvaliacao(var46);
    model.Avaliacao var51 = new model.Avaliacao("hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    var28.addAvaliacao(var51);
    java.lang.String var53 = var51.getCrm();
    boolean var54 = var51.isAvaliacao();
    java.lang.String var55 = var51.getIdUsuario();
    boolean var56 = var51.isAvaliacao();
    var5.addAvaliacao(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var55.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test8");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    var5.setTipo("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Avaliacao var25 = new model.Avaliacao("hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var26 = var25.isAvaliacao();
    var5.addAvaliacao(var25);
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var34 = var33.getNome();
    java.lang.String var35 = var33.getNumeroRegistro();
    int var36 = var33.getAvaliacaoPositiva();
    var33.setTipo("hi!, hi!\nhi!\n, ");
    int var39 = var33.getAvaliacaoPositiva();
    var33.addConvenio("hi!, hi!\nhi!\n, ");
    var33.setTipo("");
    int var44 = var33.getAvaliacaoPositiva();
    java.lang.String var45 = var33.getEspecialidade();
    var33.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var48 = var33.getEspecialidade();
    model.ProfissionalSaude var54 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var58 = new model.Avaliacao("", "hi!", false);
    java.lang.String var59 = var58.getIdUsuario();
    var54.addAvaliacao(var58);
    var54.setTipo("hi!, \nhi!\n, ");
    var54.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var54.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var70 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var54.addAvaliacao(var70);
    java.lang.String var72 = var70.getCrm();
    java.lang.String var73 = var70.getIdUsuario();
    var33.addAvaliacao(var70);
    var5.addAvaliacao(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var48.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var73.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test9");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var5.getConvenio();
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    int var24 = var17.getAvaliacaoNegativa();
    var17.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var17.setTipo("hi!, hi!\nhi!\n, ");
    java.lang.String var29 = var17.getEspecialidade();
    java.lang.String var30 = var17.getEspecialidade();
    int var31 = var17.getAvaliacaoPositiva();
    var17.setEspecialidade("hi!, hi!\n\nhi!, ");
    boolean var34 = var5.equals((java.lang.Object)var17);
    var5.setRegistro("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test10");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    boolean var7 = var2.equals((java.lang.Object)"hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test11");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    int var23 = var5.getAvaliacaoPositiva();
    int var24 = var5.getAvaliacaoNegativa();
    int var25 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test12");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test13");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    int var27 = var20.getAvaliacaoNegativa();
    var20.addConvenio("hi!");
    java.lang.String var30 = var20.getTipo();
    java.lang.String var31 = var20.getConvenio();
    boolean var32 = var5.equals((java.lang.Object)var20);
    boolean var37 = var5.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!", "");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var40 = var5.getEspecialidade();
    java.lang.String var41 = var5.getConvenio();
    boolean var46 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    java.lang.String var47 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test14");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var20 = var8.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test15");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    var5.setTipo("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");
    model.Endereco var30 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var31 = var30.getNumero();
    java.lang.String var32 = var30.toString();
    java.lang.String var33 = var30.getRua();
    var30.setNumero("hi!, \nhi!\n, ");
    java.lang.String var36 = var30.getSala();
    model.Endereco var43 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var43.setCidade("");
    java.lang.String var46 = var43.getSala();
    var43.setCidade("");
    var43.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var56 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var60 = new model.Avaliacao("", "hi!", false);
    java.lang.String var61 = var60.getIdUsuario();
    var56.addAvaliacao(var60);
    var56.setTipo("hi!, \nhi!\n, ");
    java.lang.String var65 = var56.getTipo();
    var56.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var56.addConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var70 = var43.equals((java.lang.Object)var56);
    java.lang.String var71 = var43.getEstado();
    var43.setBairro("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    boolean var74 = var30.equals((java.lang.Object)var43);
    boolean var75 = var5.equals((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var32.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!, \nhi!\n, "+ "'", var65.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test16");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    int var15 = var8.getAvaliacaoNegativa();
    var8.addConvenio("hi!");
    java.lang.String var18 = var8.getTipo();
    java.lang.String var19 = var8.getTipo();
    java.lang.String var20 = var8.getEspecialidade();
    boolean var21 = var2.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test17");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var18 = var5.getAvaliacaoPositiva();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var25.setCidade("");
    var25.setBairro("hi!");
    var25.setSala("hi!");
    java.lang.String var32 = var25.toString();
    java.lang.String var33 = var25.getEstado();
    java.lang.String var34 = var25.getNumero();
    boolean var35 = var5.equals((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test18");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\n, ");

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test19");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!\n\nhi!, ", ", hi!\n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ", "hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ");

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test20");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ");

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test21");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getBairro();
    java.lang.String var19 = var6.toString();
    var6.setRua("hi!, \nhi!\n, ");
    var6.setSala("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var24 = var6.getRua();
    java.lang.String var25 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var19.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, "+ "'", var24.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test22");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var18 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var22 = new model.Avaliacao("", "hi!", false);
    java.lang.String var23 = var22.getIdUsuario();
    var18.addAvaliacao(var22);
    java.lang.String var25 = var18.getNumeroRegistro();
    java.lang.String var26 = var18.getConvenio();
    boolean var27 = var2.equals((java.lang.Object)var26);
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test23");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var10 = var5.verificaParametros("hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!\n");
    java.lang.String var11 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test24");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var17 = var6.toString();
    var6.setSala("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var17.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test25");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test26");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var18 = var5.getEspecialidade();
    java.lang.String var19 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test27");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");
    var6.setBairro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test28");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.getRua();
    var6.setCidade(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var18 = var6.getNumero();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var23 = new model.Usuario("", "");
    java.lang.String var24 = var23.getNome();
    java.lang.String var25 = var23.getIdentificacao();
    var23.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    boolean var28 = var6.equals((java.lang.Object)"hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var29 = var6.getBairro();
    model.Usuario var32 = new model.Usuario("", "");
    java.lang.String var33 = var32.getIdentificacao();
    var32.setIdentificacao("hi!");
    java.lang.String var36 = var32.getNome();
    java.lang.String var37 = var32.getNome();
    boolean var38 = var6.equals((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test29");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test30");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.toString();
    var6.setCidade("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test31");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getIdentificacao();
    model.ProfissionalSaude var9 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var9.getNome();
    var9.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var18 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var19 = var18.getNome();
    java.lang.String var20 = var18.getNumeroRegistro();
    int var21 = var18.getAvaliacaoPositiva();
    var18.setTipo("hi!, hi!\nhi!\n, ");
    int var24 = var18.getAvaliacaoPositiva();
    var18.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var27 = var18.getConvenio();
    boolean var28 = var9.equals((java.lang.Object)var18);
    int var29 = var9.getAvaliacaoPositiva();
    java.lang.String var30 = var9.getEspecialidade();
    var9.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    int var33 = var9.getAvaliacaoNegativa();
    int var34 = var9.getAvaliacaoPositiva();
    boolean var35 = var2.equals((java.lang.Object)var34);
    var2.setNome("hi!, hi!\n, hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, \nhi!\n, "+ "'", var30.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test32");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test33");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getEstado();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var6.getRua();
    java.lang.String var12 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var8.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, "));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test34");


    model.Endereco var6 = new model.Endereco(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "");
    var6.setEstado("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var9 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test35");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    int var27 = var20.getAvaliacaoNegativa();
    var20.addConvenio("hi!");
    java.lang.String var30 = var20.getTipo();
    java.lang.String var31 = var20.getConvenio();
    boolean var32 = var5.equals((java.lang.Object)var20);
    var20.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var39 = var20.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var44 = var20.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test36");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, \nhi!\n, "+ "'", var8.equals("hi!, \nhi!\n, "));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test37");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setNumeroRegistro("hi!");
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    var19.addAvaliacao(var23);
    var19.setConvenio("hi!");
    java.lang.String var28 = var19.getTipo();
    var19.setTipo(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var36 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var40 = new model.Avaliacao("", "hi!", false);
    java.lang.String var41 = var40.getIdUsuario();
    var36.addAvaliacao(var40);
    var36.setNumeroRegistro("");
    var36.setConvenio("hi!");
    var36.setEspecialidade("hi!, \nhi!\n, ");
    java.lang.String var49 = var36.getConvenio();
    model.Avaliacao var53 = new model.Avaliacao("", "hi!", false);
    java.lang.String var54 = var53.getCrm();
    java.lang.String var55 = var53.getCrm();
    java.lang.String var56 = var53.getCrm();
    boolean var57 = var53.isAvaliacao();
    boolean var58 = var53.isAvaliacao();
    var36.addAvaliacao(var53);
    boolean var60 = var53.isAvaliacao();
    var19.addAvaliacao(var53);
    var5.addAvaliacao(var53);
    var5.setRegistro("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test38");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    int var6 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test39");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    model.Endereco var18 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var19 = var18.getNumero();
    java.lang.String var20 = var18.getCidade();
    java.lang.String var21 = var18.getSala();
    boolean var22 = var2.equals((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test40");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var20 = var19.getNumero();
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var28 = var27.getNumero();
    var27.setCidade("hi!");
    model.Endereco var37 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var39 = var37.equals((java.lang.Object)10L);
    java.lang.String var40 = var37.getNumero();
    boolean var41 = var27.equals((java.lang.Object)var40);
    var27.setBairro("");
    java.lang.String var44 = var27.getBairro();
    var27.setNumero("hi!, hi!\nhi!\n, ");
    boolean var47 = var19.equals((java.lang.Object)var27);
    var27.setBairro("");
    boolean var50 = var6.equals((java.lang.Object)var27);
    var27.setNumero("hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test41");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, \nhi!\n, , hi!\n\nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test42");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    boolean var20 = var5.verificaParametros("hi!, \nhi!\nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var25 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test43");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var24 = var5.getConvenio();
    var5.setRegistro("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var27 = var5.getEspecialidade();
    var5.setConvenio(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test44");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var7 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test45");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    var6.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\n, "));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test46");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ", "", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test47");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var3 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!"+ "'", var3.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test48");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var24 = var5.getTipo();
    java.lang.String var25 = var5.getNumeroRegistro();
    int var26 = var5.getAvaliacaoNegativa();
    java.lang.String var27 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test49");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setRua("hi!");
    java.lang.String var15 = var6.getRua();
    var6.setEstado("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var25 = var24.getNumero();
    var24.setCidade("hi!");
    model.Endereco var34 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var36 = var34.equals((java.lang.Object)10L);
    java.lang.String var37 = var34.getNumero();
    boolean var38 = var24.equals((java.lang.Object)var37);
    var24.setBairro("");
    java.lang.String var41 = var24.getNumero();
    java.lang.String var42 = var24.getBairro();
    var24.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var45 = var24.getCidade();
    boolean var46 = var6.equals((java.lang.Object)var24);
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var56 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var60 = new model.Avaliacao("", "hi!", false);
    java.lang.String var61 = var60.getIdUsuario();
    var56.addAvaliacao(var60);
    int var63 = var56.getAvaliacaoPositiva();
    var56.addConvenio("hi!, hi!\nhi!\nhi!, ");
    boolean var70 = var56.verificaParametros("hi!\n", "hi!, hi!\n\n, ", "", "");
    java.lang.String var71 = var56.getConvenio();
    var56.setEspecialidade("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var74 = var6.equals((java.lang.Object)var56);
    var56.setNumeroRegistro("hi!, hi!\n\nhi!, ");
    java.lang.String var77 = var56.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var71.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var77.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test50");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test51");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!");
    java.lang.String var9 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test52");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    java.lang.String var9 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , "));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test53");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var4.equals("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test54");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    var6.setCidade("hi!, \nhi!\n, hi!");
    java.lang.String var11 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test55");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoPositiva();
    int var16 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setNome("hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test56");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    int var24 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test57");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    java.lang.String var18 = var8.getConvenio();
    int var19 = var8.getAvaliacaoPositiva();
    java.lang.String var20 = var8.getNumeroRegistro();
    var8.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var8.addConvenio(", hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test58");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!");
    java.lang.String var18 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test59");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    var5.addAvaliacao(var39);
    int var43 = var5.getAvaliacaoNegativa();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var46 = var5.getTipo();
    int var47 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var46.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test60");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test61");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var20 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test62");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var5.getEspecialidade();
    java.lang.String var23 = var5.getEspecialidade();
    java.lang.String var24 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test63");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getConvenio();
    boolean var23 = var5.verificaParametros("hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.addConvenio(", \nhi!\n, hi!");
    java.lang.String var26 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test64");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getCidade();
    java.lang.String var11 = var6.getRua();
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    var17.setNumeroRegistro("");
    boolean var30 = var17.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var31 = var17.getAvaliacaoPositiva();
    var17.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var17.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    int var36 = var17.getAvaliacaoNegativa();
    boolean var37 = var6.equals((java.lang.Object)var17);
    model.Endereco var44 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var45 = var44.getNumero();
    var44.setRua("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var48 = var17.equals((java.lang.Object)"hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var52 = new model.Avaliacao("", "hi!", false);
    java.lang.String var53 = var52.getCrm();
    java.lang.String var54 = var52.getCrm();
    java.lang.String var55 = var52.getIdUsuario();
    var17.addAvaliacao(var52);
    java.lang.String var57 = var52.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var45.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test65");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var11 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var11.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test66");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getSala();
    var6.setNumero("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var21 = var6.getCidade();
    var6.setSala("hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test67");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.getRua();
    var6.setCidade(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var18 = var6.getNumero();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var23 = new model.Usuario("", "");
    java.lang.String var24 = var23.getNome();
    java.lang.String var25 = var23.getIdentificacao();
    var23.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    boolean var28 = var6.equals((java.lang.Object)"hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var29 = var6.getSala();
    java.lang.String var30 = var6.getCidade();
    model.ProfissionalSaude var36 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var40 = new model.Avaliacao("", "hi!", false);
    java.lang.String var41 = var40.getIdUsuario();
    var36.addAvaliacao(var40);
    var36.setTipo("hi!, \nhi!\n, ");
    var36.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var36.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var52 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var36.addAvaliacao(var52);
    boolean var58 = var36.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "", "hi!, hi!\nhi!\n, ");
    boolean var59 = var6.equals((java.lang.Object)"");
    var6.setBairro("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var30.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test68");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    model.Usuario var20 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var20.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var23 = var20.getNome();
    model.ProfissionalSaude var29 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var33 = new model.Avaliacao("", "hi!", false);
    java.lang.String var34 = var33.getIdUsuario();
    var29.addAvaliacao(var33);
    var29.setNumeroRegistro("");
    var29.setConvenio("hi!");
    java.lang.String var40 = var29.getTipo();
    model.Avaliacao var44 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var45 = var44.getCrm();
    java.lang.String var46 = var44.getCrm();
    var29.addAvaliacao(var44);
    boolean var48 = var20.equals((java.lang.Object)var29);
    var29.setTipo("hi!\n");
    var29.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    int var53 = var29.getAvaliacaoNegativa();
    var29.setNome("");
    java.lang.String var56 = var29.getConvenio();
    boolean var57 = var5.equals((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, \nhi!\n, "+ "'", var45.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, \nhi!\n, "+ "'", var46.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"+ "'", var56.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test69");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test70");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test71");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var5.getNome();
    java.lang.String var9 = var5.getConvenio();
    java.lang.String var10 = var5.getNumeroRegistro();
    java.lang.String var11 = var5.getEspecialidade();
    var5.addConvenio("hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var9.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, \nhi!\n, "+ "'", var11.equals("hi!, \nhi!\n, "));

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test72");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNumeroRegistro();
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Usuario var23 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var29 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var33 = new model.Avaliacao("", "hi!", false);
    java.lang.String var34 = var33.getIdUsuario();
    var29.addAvaliacao(var33);
    var29.setConvenio("hi!");
    boolean var38 = var23.equals((java.lang.Object)var29);
    var29.addConvenio("");
    model.Avaliacao var44 = new model.Avaliacao("", "hi!", false);
    java.lang.String var45 = var44.getIdUsuario();
    boolean var46 = var44.isAvaliacao();
    var29.addAvaliacao(var44);
    java.lang.String var48 = var44.getIdUsuario();
    var5.addAvaliacao(var44);
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test73");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getBairro();
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test74");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getCidade();
    java.lang.String var11 = var6.getBairro();
    java.lang.String var12 = var6.getBairro();
    var6.setNumero("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test75");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, \nhi!\n, , hi!\n\nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test76");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    int var27 = var20.getAvaliacaoNegativa();
    var20.addConvenio("hi!");
    java.lang.String var30 = var20.getTipo();
    java.lang.String var31 = var20.getConvenio();
    boolean var32 = var5.equals((java.lang.Object)var20);
    boolean var37 = var5.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!", "");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var40 = var5.getEspecialidade();
    java.lang.String var41 = var5.getConvenio();
    boolean var46 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    java.lang.String var47 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test77");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    model.Usuario var13 = new model.Usuario("hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var14 = var13.getNome();
    boolean var15 = var6.equals((java.lang.Object)var14);
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test78");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var7 = new model.Usuario("", "");
    java.lang.String var8 = var7.getIdentificacao();
    var7.setIdentificacao("hi!");
    java.lang.String var11 = var7.getNome();
    var7.setNome("hi!");
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    var19.addAvaliacao(var23);
    java.lang.String var26 = var23.getIdUsuario();
    boolean var27 = var7.equals((java.lang.Object)var23);
    boolean var28 = var23.isAvaliacao();
    boolean var29 = var2.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test79");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    boolean var24 = var5.verificaParametros("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    int var25 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var28 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n, , "+ "'", var28.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n, , "));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test80");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    java.lang.String var18 = var15.getCidade();
    var15.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var28 = var27.getNumero();
    var27.setNumero("hi!, hi!\nhi!\nhi!, ");
    var27.setNumero("hi!, hi!\nhi!\n, ");
    boolean var33 = var15.equals((java.lang.Object)"hi!, hi!\nhi!\n, ");
    var15.setRua("hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test81");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var10 = var6.getSala();
    var6.setRua("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    java.lang.String var13 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, , hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, , hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test82");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var4 = var3.isAvaliacao();
    boolean var5 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test83");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test84");


    model.Endereco var6 = new model.Endereco("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", ", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, , hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test85");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getConvenio();
    var5.setConvenio("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \n, \nhi!, hi!\n\nhi!, \n, ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test86");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("", "", "", "", "hi!", "");
    model.Usuario var18 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var28 = new model.Avaliacao("", "hi!", false);
    java.lang.String var29 = var28.getIdUsuario();
    var24.addAvaliacao(var28);
    var24.setConvenio("hi!");
    boolean var33 = var18.equals((java.lang.Object)var24);
    java.lang.String var34 = var24.getEspecialidade();
    java.lang.String var35 = var24.getTipo();
    boolean var36 = var15.equals((java.lang.Object)var24);
    var15.setSala("hi!, hi!\n\nhi!, ");
    boolean var39 = var2.equals((java.lang.Object)var15);
    model.Endereco var46 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var46.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var49 = var46.getSala();
    java.lang.String var50 = var46.getNumero();
    var46.setBairro("hi!");
    java.lang.String var53 = var46.getEstado();
    java.lang.String var54 = var46.getRua();
    boolean var55 = var2.equals((java.lang.Object)var54);
    var2.setNome("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var53.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var54.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test87");


    model.Usuario var2 = new model.Usuario(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n, , ");

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test88");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    var5.setRegistro("");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \n");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Usuario var24 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    var30.setConvenio("hi!");
    boolean var39 = var24.equals((java.lang.Object)var30);
    var30.addConvenio("");
    var30.addConvenio("hi!, \nhi!\n, ");
    var30.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var30.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var51 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!", false);
    boolean var52 = var51.isAvaliacao();
    boolean var53 = var51.isAvaliacao();
    var30.addAvaliacao(var51);
    java.lang.String var55 = var30.getTipo();
    boolean var56 = var5.equals((java.lang.Object)var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test89");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    var6.setSala("hi!, hi!\nhi!\nhi!, \n");
    var6.setEstado("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    var6.setSala("hi!, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test90");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!, hi!\n\nhi!, ");
    var2.setNome("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test91");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    var5.addAvaliacao(var39);
    int var43 = var5.getAvaliacaoNegativa();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var50 = var5.verificaParametros("hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setNome("hi!, hi!\n\n, ");
    model.Avaliacao var56 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    java.lang.String var57 = var56.getCrm();
    var5.addAvaliacao(var56);
    java.lang.String var59 = var56.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test92");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var5.setRegistro("");
    int var20 = var5.getAvaliacaoNegativa();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test93");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    model.Usuario var6 = new model.Usuario("", "");
    java.lang.String var7 = var6.getIdentificacao();
    var6.setIdentificacao("hi!");
    java.lang.String var10 = var6.getNome();
    var6.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var6.getIdentificacao();
    var6.setIdentificacao("hi!, \nhi!\n, ");
    boolean var16 = var2.equals((java.lang.Object)var6);
    var6.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setNome("hi!, \nhi!\n, hi!");
    model.Usuario var23 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var30 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var32 = var30.equals((java.lang.Object)10L);
    java.lang.String var33 = var30.getNumero();
    java.lang.String var34 = var30.getSala();
    boolean var35 = var23.equals((java.lang.Object)var30);
    java.lang.String var36 = var23.getIdentificacao();
    java.lang.String var37 = var23.getNome();
    boolean var38 = var6.equals((java.lang.Object)var23);
    var6.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var6.setNome("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var36.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!, \nhi!\n, "+ "'", var37.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test94");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, ", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var12 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var13 = var12.getNumero();
    var12.setCidade("hi!");
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var24 = var22.equals((java.lang.Object)10L);
    java.lang.String var25 = var22.getNumero();
    boolean var26 = var12.equals((java.lang.Object)var25);
    var12.setBairro("");
    var12.setRua("");
    var12.setBairro("hi!, hi!\nhi!\n, ");
    java.lang.String var33 = var12.getCidade();
    boolean var34 = var5.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test95");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setSala(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var13 = var6.getRua();
    var6.setEstado("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, "));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test96");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setSala("hi!, hi!\n\n, ");
    var6.setRua("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var15 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test97");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var6 = var5.getConvenio();
    java.lang.String var7 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test98");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!\n");
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test99");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getConvenio();
    var5.setRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Avaliacao var16 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", false);
    var5.addAvaliacao(var16);
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test100");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var24 = var5.getNome();
    var5.setNumeroRegistro("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test101");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", ", \nhi!\n, hi!");

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test102");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ");

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test103");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var15 = var5.getAvaliacaoNegativa();
    model.Avaliacao var19 = new model.Avaliacao("hi!", "", true);
    var5.addAvaliacao(var19);
    boolean var21 = var19.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test104");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    var6.setRua("");
    var6.setBairro("hi!, hi!\nhi!\n, ");
    java.lang.String var27 = var6.toString();
    var6.setEstado("hi!, \nhi!\n, hi!");
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var27.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test105");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getConvenio();
    var5.setConvenio("hi!");
    boolean var14 = var5.verificaParametros("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\n\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test106");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNumeroRegistro();
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var12.getNome();
    java.lang.String var14 = var12.getNumeroRegistro();
    int var15 = var12.getAvaliacaoPositiva();
    var12.setTipo("hi!, hi!\nhi!\n, ");
    int var18 = var12.getAvaliacaoPositiva();
    java.lang.String var19 = var12.getNome();
    model.Endereco var26 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var28 = var26.equals((java.lang.Object)10L);
    java.lang.String var29 = var26.getNumero();
    var26.setNumero("");
    var26.setSala("hi!");
    boolean var34 = var12.equals((java.lang.Object)"hi!");
    var12.setTipo("hi!, hi!\nhi!\n, ");
    boolean var41 = var12.verificaParametros("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var45 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    boolean var46 = var45.isAvaliacao();
    var12.addAvaliacao(var45);
    var5.addAvaliacao(var45);
    java.lang.String var49 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "+ "'", var6.equals("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var49.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test107");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    var8.addConvenio("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test108");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getTipo();
    java.lang.String var15 = var5.getNome();
    var5.setNome("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var18 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test109");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getTipo();
    java.lang.String var15 = var5.getNome();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var18 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test110");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    model.Avaliacao var19 = new model.Avaliacao("", "hi!", false);
    java.lang.String var20 = var19.getCrm();
    boolean var21 = var5.equals((java.lang.Object)var19);
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\n, hi!");
    java.lang.String var34 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "+ "'", var34.equals("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test111");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test112");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getEstado();
    var6.setBairro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var22 = var6.toString();
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test113");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    java.lang.String var18 = var2.getIdentificacao();
    boolean var20 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var28 = var27.getNumero();
    var27.setNumero("hi!, hi!\nhi!\nhi!, ");
    var27.setBairro("hi!, hi!\nhi!\n, ");
    java.lang.String var33 = var27.getRua();
    java.lang.String var34 = var27.getCidade();
    boolean var35 = var2.equals((java.lang.Object)var27);
    var27.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var38 = var27.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test114");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test115");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.toString();
    var6.setRua("hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getRua();
    java.lang.String var16 = var6.toString();
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    var6.setCidade(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var21 = var6.getBairro();
    var6.setEstado("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test116");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var5.getConvenio();
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var16 = var5.verificaParametros("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setConvenio("hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test117");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test118");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!\n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var7 = var6.getNumero();
    var6.setRua(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test119");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test120");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setEspecialidade("hi!\n");
    java.lang.String var24 = var5.getNome();
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var27 = var5.getEspecialidade();
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var37 = new model.Avaliacao("", "hi!", false);
    java.lang.String var38 = var37.getIdUsuario();
    var33.addAvaliacao(var37);
    java.lang.String var40 = var33.getTipo();
    java.lang.String var41 = var33.getTipo();
    var33.addConvenio("hi!, hi!\nhi!\n, ");
    var33.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var33.setTipo("hi!, hi!\n\n, ");
    java.lang.String var48 = var33.getNome();
    var33.setTipo("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    model.Avaliacao var54 = new model.Avaliacao("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", true);
    var33.addAvaliacao(var54);
    var5.addAvaliacao(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!\n"+ "'", var27.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test121");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test122");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test123");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test124");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var26 = var5.verificaParametros("", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    var5.setNome(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    int var29 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test125");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.getRua();
    var6.setEstado(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var6.setEstado(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var20 = var6.getCidade();
    java.lang.String var21 = var6.getBairro();
    model.Usuario var24 = new model.Usuario("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var24.setNome("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    boolean var27 = var6.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test126");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    model.Endereco var21 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var22 = var21.getNumero();
    var21.setCidade("hi!");
    java.lang.String var25 = var21.getRua();
    java.lang.String var26 = var21.getSala();
    boolean var27 = var6.equals((java.lang.Object)var26);
    java.lang.String var28 = var6.getNumero();
    model.Endereco var35 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var36 = var35.getNumero();
    java.lang.String var37 = var35.getCidade();
    java.lang.String var38 = var35.getSala();
    var35.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var35.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var43 = var6.equals((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test127");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    model.Usuario var15 = new model.Usuario("", "");
    java.lang.String var16 = var15.getIdentificacao();
    var15.setIdentificacao("hi!");
    var15.setIdentificacao("hi!");
    boolean var21 = var6.equals((java.lang.Object)"hi!");
    java.lang.String var22 = var6.getSala();
    var6.setNumero("");
    java.lang.String var25 = var6.getNumero();
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test128");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    boolean var7 = var2.equals((java.lang.Object)10.0d);
    java.lang.String var8 = var2.getNome();
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    java.lang.String var15 = var14.getEspecialidade();
    java.lang.String var16 = var14.getConvenio();
    model.Avaliacao var20 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var21 = var20.getIdUsuario();
    java.lang.String var22 = var20.getIdUsuario();
    java.lang.String var23 = var20.getCrm();
    boolean var24 = var20.isAvaliacao();
    var14.addAvaliacao(var20);
    boolean var26 = var2.equals((java.lang.Object)var14);
    java.lang.String var27 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, \nhi!\n, "+ "'", var21.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test129");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test130");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var10 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\n, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test131");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    int var27 = var20.getAvaliacaoNegativa();
    var20.addConvenio("hi!");
    java.lang.String var30 = var20.getTipo();
    java.lang.String var31 = var20.getConvenio();
    boolean var32 = var5.equals((java.lang.Object)var20);
    boolean var37 = var5.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!", "");
    java.lang.String var38 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test132");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var17 = var5.equals((java.lang.Object)1.0f);
    var5.setRegistro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var23 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var5.addAvaliacao(var23);
    var5.setNome("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    java.lang.String var27 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test133");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test134");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    var5.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var26 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Endereco var37 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var38 = var37.getBairro();
    var37.setBairro("hi!, \nhi!\n, ");
    boolean var41 = var5.equals((java.lang.Object)"hi!, \nhi!\n, ");
    model.Avaliacao var45 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", true);
    java.lang.String var46 = var45.getIdUsuario();
    java.lang.String var47 = var45.getIdUsuario();
    var5.addAvaliacao(var45);
    java.lang.String var49 = var45.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!\n"+ "'", var46.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!\n"+ "'", var47.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!\n"+ "'", var49.equals("hi!\n"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test135");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    model.Usuario var15 = new model.Usuario("", "");
    java.lang.String var16 = var15.getIdentificacao();
    var15.setIdentificacao("hi!");
    var15.setIdentificacao("hi!");
    boolean var21 = var6.equals((java.lang.Object)"hi!");
    java.lang.String var22 = var6.getSala();
    var6.setNumero("");
    java.lang.String var25 = var6.getNumero();
    var6.setNumero("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test136");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var6.toString();
    var6.setBairro("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test137");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getEstado();
    java.lang.String var18 = var6.getBairro();
    var6.setCidade("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test138");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var9.setCidade("");
    java.lang.String var12 = var9.getSala();
    var9.setCidade("");
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    var9.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    boolean var19 = var2.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var25 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var30 = var25.verificaParametros("hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!\n");
    boolean var35 = var25.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    boolean var36 = var2.equals((java.lang.Object)var25);
    var25.setConvenio("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var39 = var25.getNumeroRegistro();
    var25.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var39.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test139");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    java.lang.String var6 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var6.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test140");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    var23.setCidade("");
    var23.setBairro("");
    var23.setSala("hi!");
    java.lang.String var32 = var23.toString();
    java.lang.String var33 = var23.getEstado();
    boolean var34 = var6.equals((java.lang.Object)var33);
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\n\n, "+ "'", var32.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test141");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getNumeroRegistro();
    int var28 = var25.getAvaliacaoPositiva();
    var25.setTipo("hi!, hi!\nhi!\n, ");
    int var31 = var25.getAvaliacaoPositiva();
    var25.addConvenio("hi!, hi!\nhi!\n, ");
    int var34 = var25.getAvaliacaoPositiva();
    boolean var39 = var25.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var25.addConvenio("hi!");
    model.ProfissionalSaude var47 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var51 = new model.Avaliacao("", "hi!", false);
    java.lang.String var52 = var51.getIdUsuario();
    var47.addAvaliacao(var51);
    var47.setConvenio("hi!");
    java.lang.String var56 = var47.getTipo();
    model.ProfissionalSaude var62 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var66 = new model.Avaliacao("", "hi!", false);
    java.lang.String var67 = var66.getIdUsuario();
    var62.addAvaliacao(var66);
    var47.addAvaliacao(var66);
    var25.addAvaliacao(var66);
    var5.addAvaliacao(var66);
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.addConvenio("");
    java.lang.String var76 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    java.lang.String var79 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var76.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, "+ "'", var79.equals("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, "));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test142");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getBairro();
    java.lang.String var14 = var6.toString();
    var6.setBairro("hi!, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\n, "));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test143");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setEspecialidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test144");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    boolean var27 = var5.verificaParametros("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var32 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", ", \nhi!\n, hi!");
    java.lang.String var33 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var33.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test145");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var18 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", false);
    var5.addAvaliacao(var18);
    var5.setTipo("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test146");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, "));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test147");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    var23.setCidade("");
    var23.setBairro("");
    var23.setSala("hi!");
    java.lang.String var32 = var23.toString();
    java.lang.String var33 = var23.getEstado();
    boolean var34 = var6.equals((java.lang.Object)var33);
    java.lang.String var35 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\n\n, "+ "'", var32.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test148");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setEspecialidade("hi!\n");
    java.lang.String var24 = var5.getNome();
    boolean var29 = var5.verificaParametros("", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test149");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, , \nhi!\n, ", true);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test150");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\n\n, ");
    boolean var24 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test151");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test152");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test153");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    int var27 = var20.getAvaliacaoNegativa();
    var20.addConvenio("hi!");
    java.lang.String var30 = var20.getTipo();
    java.lang.String var31 = var20.getConvenio();
    boolean var32 = var5.equals((java.lang.Object)var20);
    var20.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var20.setConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var43 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var45 = var43.equals((java.lang.Object)10L);
    var43.setCidade("");
    var43.setBairro("");
    var43.setCidade("hi!");
    var43.setEstado("");
    java.lang.String var54 = var43.getSala();
    java.lang.String var55 = var43.getNumero();
    java.lang.String var56 = var43.getRua();
    java.lang.String var57 = var43.getEstado();
    boolean var58 = var20.equals((java.lang.Object)var43);
    var43.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test154");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setTipo(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test155");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \n");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test156");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    java.lang.String var23 = var5.getTipo();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var29 = new model.Avaliacao("hi!", "", true);
    java.lang.String var30 = var29.getIdUsuario();
    boolean var31 = var29.isAvaliacao();
    var5.addAvaliacao(var29);
    boolean var33 = var29.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test157");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ");

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test158");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setTipo("hi!, \nhi!\n, ");
    var5.addConvenio("hi!\n");
    java.lang.String var22 = var5.getNumeroRegistro();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var29 = var5.verificaParametros("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\n\nhi!, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test159");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("");
    java.lang.String var7 = var2.getNome();
    java.lang.String var8 = var2.getNome();
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var17.getNome();
    var17.setEspecialidade("hi!, \nhi!\n, ");
    var17.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var23 = var17.getTipo();
    var17.setNumeroRegistro("hi!");
    var17.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var34 = var33.getNome();
    var33.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var42 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var43 = var42.getNome();
    java.lang.String var44 = var42.getNumeroRegistro();
    int var45 = var42.getAvaliacaoPositiva();
    var42.setTipo("hi!, hi!\nhi!\n, ");
    int var48 = var42.getAvaliacaoPositiva();
    var42.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var51 = var42.getConvenio();
    boolean var52 = var33.equals((java.lang.Object)var42);
    var42.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var55 = var42.getEspecialidade();
    java.lang.String var56 = var42.getNome();
    var42.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var64 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var65 = var64.getNome();
    java.lang.String var66 = var64.getNumeroRegistro();
    int var67 = var64.getAvaliacaoPositiva();
    var64.setTipo("hi!, hi!\nhi!\n, ");
    int var70 = var64.getAvaliacaoPositiva();
    var64.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var73 = var64.getNome();
    var64.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var64.setNome("hi!, hi!\n\n, ");
    model.Avaliacao var81 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var82 = var81.isAvaliacao();
    var64.addAvaliacao(var81);
    var42.addAvaliacao(var81);
    java.lang.String var85 = var81.getCrm();
    java.lang.String var86 = var81.getCrm();
    boolean var87 = var81.isAvaliacao();
    var17.addAvaliacao(var81);
    boolean var89 = var2.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var51.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!, \nhi!\n, "+ "'", var85.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!, \nhi!\n, "+ "'", var86.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test160");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test161");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoNegativa();
    int var17 = var5.getAvaliacaoPositiva();
    java.lang.String var18 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test162");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getNome();
    boolean var25 = var8.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var26 = var8.getConvenio();
    java.lang.String var27 = var8.getEspecialidade();
    boolean var32 = var8.verificaParametros(", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var33 = var8.getEspecialidade();
    var8.addConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!\n"+ "'", var26.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test163");


    model.Usuario var2 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    var2.setIdentificacao(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var11 = var2.getIdentificacao();
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    java.lang.String var24 = var17.getTipo();
    java.lang.String var25 = var17.getTipo();
    boolean var30 = var17.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var35 = var17.verificaParametros("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var36 = var2.equals((java.lang.Object)"hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test164");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var11 = var6.getBairro();
    java.lang.String var12 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var11.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var12.equals("hi!, hi!\n\nhi!, "));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test165");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getSala();
    java.lang.String var10 = var6.getSala();
    var6.setEstado("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    java.lang.String var13 = var6.toString();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, "+ "'", var13.equals("hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, "));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test166");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    java.lang.String var18 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var21 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test167");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    boolean var27 = var5.verificaParametros("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var32 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", ", \nhi!\n, hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test168");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoPositiva();
    var5.setNome(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test169");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var16 = new model.Avaliacao("", "hi!", false);
    java.lang.String var17 = var16.getIdUsuario();
    var12.addAvaliacao(var16);
    int var19 = var12.getAvaliacaoPositiva();
    var12.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var27 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var31 = new model.Avaliacao("", "hi!", false);
    java.lang.String var32 = var31.getIdUsuario();
    var27.addAvaliacao(var31);
    int var34 = var27.getAvaliacaoNegativa();
    var27.addConvenio("hi!");
    java.lang.String var37 = var27.getTipo();
    java.lang.String var38 = var27.getConvenio();
    boolean var39 = var12.equals((java.lang.Object)var27);
    var27.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var27.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var44 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var45 = var2.getNome();
    java.lang.String var46 = var2.getIdentificacao();
    java.lang.String var47 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var5.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var6.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var38.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var45.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, \nhi!\n, "+ "'", var46.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var47.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test170");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    var5.setRegistro("");
    int var18 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test171");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    java.lang.String var15 = var5.getTipo();
    java.lang.String var16 = var5.getEspecialidade();
    java.lang.String var17 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\n, "));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test172");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var5.setRegistro("");
    java.lang.String var20 = var5.getEspecialidade();
    int var21 = var5.getAvaliacaoNegativa();
    var5.setConvenio("");
    var5.setEspecialidade("hi!, hi!\nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test173");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    var5.setRegistro("");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \n");
    var5.setTipo("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var22 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test174");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var12 = var6.getRua();
    java.lang.String var13 = var6.getCidade();
    java.lang.String var14 = var6.toString();
    java.lang.String var15 = var6.getNumero();
    java.lang.String var16 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "+ "'", var14.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test175");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\n\n, ");
    java.lang.String var14 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, "));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test176");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var5.getEspecialidade();
    model.Avaliacao var20 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var21 = var20.getCrm();
    var5.addAvaliacao(var20);
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    int var37 = var30.getAvaliacaoNegativa();
    boolean var42 = var30.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var30.setRegistro("");
    int var45 = var30.getAvaliacaoPositiva();
    boolean var46 = var5.equals((java.lang.Object)var45);
    java.lang.String var47 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test177");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    var6.setSala("hi!, hi!\nhi!\nhi!, \n");
    var6.setEstado("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var23 = var22.getNome();
    java.lang.String var24 = var22.getNumeroRegistro();
    int var25 = var22.getAvaliacaoPositiva();
    var22.setTipo("hi!, hi!\nhi!\n, ");
    int var28 = var22.getAvaliacaoPositiva();
    java.lang.String var29 = var22.getNome();
    model.Endereco var36 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var38 = var36.equals((java.lang.Object)10L);
    java.lang.String var39 = var36.getNumero();
    var36.setNumero("");
    var36.setSala("hi!");
    boolean var44 = var22.equals((java.lang.Object)"hi!");
    var22.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var52 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var56 = new model.Avaliacao("", "hi!", false);
    java.lang.String var57 = var56.getIdUsuario();
    var52.addAvaliacao(var56);
    var22.addAvaliacao(var56);
    java.lang.String var60 = var22.getNumeroRegistro();
    var22.addConvenio("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    model.Usuario var65 = new model.Usuario("", "");
    java.lang.String var66 = var65.getIdentificacao();
    var65.setIdentificacao("hi!");
    java.lang.String var69 = var65.getNome();
    var65.setNome("hi!");
    model.ProfissionalSaude var77 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var81 = new model.Avaliacao("", "hi!", false);
    java.lang.String var82 = var81.getIdUsuario();
    var77.addAvaliacao(var81);
    java.lang.String var84 = var81.getIdUsuario();
    boolean var85 = var65.equals((java.lang.Object)var81);
    boolean var86 = var81.isAvaliacao();
    var22.addAvaliacao(var81);
    boolean var88 = var81.isAvaliacao();
    java.lang.String var89 = var81.getIdUsuario();
    boolean var90 = var6.equals((java.lang.Object)var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var60.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!"+ "'", var82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!"+ "'", var84.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi!"+ "'", var89.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test178");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getSala();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test179");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!");
    model.ProfissionalSaude var10 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var11 = var10.getNome();
    java.lang.String var12 = var10.getNumeroRegistro();
    int var13 = var10.getAvaliacaoPositiva();
    var10.setTipo("hi!, hi!\nhi!\n, ");
    int var16 = var10.getAvaliacaoPositiva();
    java.lang.String var17 = var10.getTipo();
    var10.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var22 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    boolean var23 = var10.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var10.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var26 = var2.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test180");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setRegistro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test181");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var32 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var38 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var42 = new model.Avaliacao("", "hi!", false);
    java.lang.String var43 = var42.getIdUsuario();
    var38.addAvaliacao(var42);
    var38.setConvenio("hi!");
    var38.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var52 = new model.Avaliacao("", "hi!", false);
    java.lang.String var53 = var52.getCrm();
    java.lang.String var54 = var52.getCrm();
    boolean var55 = var52.isAvaliacao();
    java.lang.String var56 = var52.getCrm();
    java.lang.String var57 = var52.getCrm();
    var38.addAvaliacao(var52);
    java.lang.String var59 = var52.getCrm();
    var5.addAvaliacao(var52);
    var5.addConvenio("hi!\n");
    model.Avaliacao var66 = new model.Avaliacao("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    boolean var67 = var66.isAvaliacao();
    var5.addAvaliacao(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test182");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    var6.setSala("hi!, hi!\n\nhi!, ");
    java.lang.String var19 = var6.getNumero();
    java.lang.String var20 = var6.getEstado();
    java.lang.String var21 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test183");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", true);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test184");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.getNumero();
    java.lang.String var12 = var6.getEstado();
    model.ProfissionalSaude var18 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var19 = var18.getNome();
    var18.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var27 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var28 = var27.getNome();
    java.lang.String var29 = var27.getNumeroRegistro();
    int var30 = var27.getAvaliacaoPositiva();
    var27.setTipo("hi!, hi!\nhi!\n, ");
    int var33 = var27.getAvaliacaoPositiva();
    var27.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var36 = var27.getConvenio();
    boolean var37 = var18.equals((java.lang.Object)var27);
    var18.addConvenio("hi!");
    var18.addConvenio("hi!, hi!\nhi!\nhi!, ");
    var18.setNome("hi!, hi!\n\n, ");
    int var44 = var18.getAvaliacaoPositiva();
    var18.setRegistro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var47 = var6.equals((java.lang.Object)", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var36.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test185");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    int var23 = var5.getAvaliacaoPositiva();
    java.lang.String var24 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test186");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setRua("hi!");
    java.lang.String var15 = var6.getSala();
    java.lang.String var16 = var6.toString();
    java.lang.String var17 = var6.getSala();
    var6.setCidade("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test187");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.toString();
    var6.setRua("hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getRua();
    java.lang.String var16 = var6.toString();
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var26 = var25.getNumero();
    var25.setCidade("hi!");
    java.lang.String var29 = var25.getCidade();
    var25.setBairro("hi!, hi!\n\nhi!, ");
    java.lang.String var32 = var25.getBairro();
    var25.setNumero("hi!");
    boolean var35 = var6.equals((java.lang.Object)var25);
    var25.setCidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var25.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var32.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test188");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getIdUsuario();
    boolean var8 = var3.isAvaliacao();
    boolean var9 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test189");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    java.lang.String var4 = var2.getNome();
    model.Endereco var11 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    boolean var12 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test190");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    var5.addConvenio("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\n, ");
    boolean var23 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var26 = var5.getAvaliacaoPositiva();
    java.lang.String var27 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\n, "));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test191");


    model.Avaliacao var3 = new model.Avaliacao("hi!\n", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ", true);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test192");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getNome();
    model.ProfissionalSaude var11 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var15 = new model.Avaliacao("", "hi!", false);
    java.lang.String var16 = var15.getIdUsuario();
    var11.addAvaliacao(var15);
    var11.setNumeroRegistro("");
    var11.setConvenio("hi!");
    java.lang.String var22 = var11.getTipo();
    model.Avaliacao var26 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var27 = var26.getCrm();
    java.lang.String var28 = var26.getCrm();
    var11.addAvaliacao(var26);
    boolean var30 = var2.equals((java.lang.Object)var11);
    var11.setTipo("hi!\n");
    var11.setTipo("hi!, \nhi!\n, ");
    java.lang.String var35 = var11.getNome();
    model.Avaliacao var39 = new model.Avaliacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", true);
    boolean var40 = var39.isAvaliacao();
    var11.addAvaliacao(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, \nhi!\n, "+ "'", var27.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, \nhi!\n, "+ "'", var28.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test193");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var32 = var5.getNumeroRegistro();
    java.lang.String var33 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var33.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test194");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.addConvenio("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test195");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var13 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var14 = var13.getNumero();
    model.Endereco var21 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var22 = var21.getNumero();
    var21.setCidade("hi!");
    model.Endereco var31 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var33 = var31.equals((java.lang.Object)10L);
    java.lang.String var34 = var31.getNumero();
    boolean var35 = var21.equals((java.lang.Object)var34);
    var21.setBairro("");
    java.lang.String var38 = var21.getBairro();
    var21.setNumero("hi!, hi!\nhi!\n, ");
    boolean var41 = var13.equals((java.lang.Object)var21);
    model.ProfissionalSaude var47 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var51 = new model.Avaliacao("", "hi!", false);
    java.lang.String var52 = var51.getIdUsuario();
    var47.addAvaliacao(var51);
    int var54 = var47.getAvaliacaoPositiva();
    java.lang.String var55 = var47.getEspecialidade();
    model.ProfissionalSaude var61 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var62 = var61.getNome();
    java.lang.String var63 = var61.getNumeroRegistro();
    int var64 = var61.getAvaliacaoPositiva();
    var61.setTipo("hi!, hi!\nhi!\n, ");
    int var67 = var61.getAvaliacaoPositiva();
    var61.addConvenio("hi!, hi!\nhi!\n, ");
    int var70 = var61.getAvaliacaoPositiva();
    boolean var75 = var61.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var61.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var61.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var61.setNome("hi!, \nhi!\n, ");
    boolean var82 = var47.equals((java.lang.Object)var61);
    boolean var83 = var13.equals((java.lang.Object)var47);
    java.lang.String var84 = var13.toString();
    java.lang.String var85 = var13.getSala();
    boolean var86 = var6.equals((java.lang.Object)var13);
    java.lang.String var87 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var84.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var87.equals("hi!, hi!\nhi!\n, "));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test196");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getRua();
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var13.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test197");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, ");

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test198");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    java.lang.String var15 = var5.getConvenio();
    var5.setRegistro("hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    var5.setTipo("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test199");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    model.Endereco var12 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var14 = var12.equals((java.lang.Object)10L);
    java.lang.String var15 = var12.getNumero();
    java.lang.String var16 = var12.getBairro();
    boolean var17 = var2.equals((java.lang.Object)var12);
    java.lang.String var18 = var12.getNumero();
    java.lang.String var19 = var12.getBairro();
    var12.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var12.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var24 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \nhi!\n, "+ "'", var24.equals("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \nhi!\n, "));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test200");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    int var18 = var5.getAvaliacaoPositiva();
    java.lang.String var19 = var5.getNome();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test201");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, \nhi!\n, ");
    java.lang.String var26 = var5.getNumeroRegistro();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setConvenio(", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test202");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    java.lang.String var30 = var5.getEspecialidade();
    java.lang.String var31 = var5.getNome();
    java.lang.String var32 = var5.getTipo();
    java.lang.String var33 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\n, "));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test203");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getNome();
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, "));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test204");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    int var14 = var5.getAvaliacaoNegativa();
    java.lang.String var15 = var5.getNumeroRegistro();
    boolean var20 = var5.verificaParametros("hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var21 = var5.getNome();
    java.lang.String var22 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test205");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("hi!", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var5.setNome("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test206");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    model.Avaliacao var19 = new model.Avaliacao("", "hi!", false);
    java.lang.String var20 = var19.getCrm();
    boolean var21 = var5.equals((java.lang.Object)var19);
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\n, hi!");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    java.lang.String var36 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, "+ "'", var36.equals("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, "));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test207");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test208");


    model.Usuario var2 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var5.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test209");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test210");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test211");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getCidade();
    java.lang.String var11 = var6.getRua();
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    var17.setNumeroRegistro("");
    boolean var30 = var17.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var31 = var17.getAvaliacaoPositiva();
    var17.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var17.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    int var36 = var17.getAvaliacaoNegativa();
    boolean var37 = var6.equals((java.lang.Object)var17);
    var6.setBairro(", hi!\n\nhi!, ");
    java.lang.String var40 = var6.getNumero();
    java.lang.String var41 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test212");


    model.Endereco var6 = new model.Endereco(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test213");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getNumero();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setEstado("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var27 = var6.getRua();
    var6.setNumero("hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test214");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var10 = var5.verificaParametros("hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!\n");
    int var11 = var5.getAvaliacaoNegativa();
    java.lang.String var12 = var5.getNome();
    model.Usuario var15 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var15.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var15.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var20 = var15.getNome();
    var15.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var15.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Endereco var31 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var31.setRua("hi!, hi!\nhi!\nhi!, ");
    var31.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var36 = var31.getCidade();
    boolean var37 = var15.equals((java.lang.Object)var31);
    boolean var38 = var5.equals((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var12.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test215");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var2.setNome("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var10 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var11 = var10.getNome();
    java.lang.String var12 = var10.getNumeroRegistro();
    int var13 = var10.getAvaliacaoPositiva();
    var10.setTipo("hi!, hi!\nhi!\n, ");
    int var16 = var10.getAvaliacaoPositiva();
    var10.addConvenio("hi!, hi!\nhi!\n, ");
    var10.setNumeroRegistro("hi!, \nhi!\n, ");
    int var21 = var10.getAvaliacaoPositiva();
    var10.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    model.Avaliacao var27 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var10.addAvaliacao(var27);
    java.lang.String var29 = var27.getCrm();
    boolean var30 = var2.equals((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var29.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test216");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getNumeroRegistro();
    var5.setEspecialidade("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test217");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var7 = var2.getNome();
    var2.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    var17.setTipo("hi!, \nhi!\n, ");
    var17.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var28 = var17.getAvaliacaoNegativa();
    java.lang.String var29 = var17.getTipo();
    var17.setEspecialidade("hi!, \nhi!\n, ");
    var17.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var34 = var2.equals((java.lang.Object)var17);
    model.Endereco var41 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var42 = var41.getNumero();
    var41.setCidade("hi!");
    java.lang.String var45 = var41.getBairro();
    var41.setEstado("hi!, \nhi!\n, ");
    var41.setRua("");
    var41.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var58 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var60 = var58.equals((java.lang.Object)10L);
    var58.setCidade("");
    var58.setBairro("");
    java.lang.String var65 = var58.getNumero();
    boolean var66 = var41.equals((java.lang.Object)var58);
    java.lang.String var67 = var58.getEstado();
    boolean var68 = var2.equals((java.lang.Object)var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, \nhi!\n, "+ "'", var29.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test218");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getConvenio();
    boolean var23 = var5.verificaParametros("hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    model.Avaliacao var27 = new model.Avaliacao("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\n\nhi!, ", true);
    var5.addAvaliacao(var27);
    boolean var29 = var27.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test219");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, "));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test220");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!\n\nhi!, ");
    model.Usuario var19 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var19.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var22 = var19.getIdentificacao();
    boolean var24 = var19.equals((java.lang.Object)"hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    boolean var25 = var6.equals((java.lang.Object)var19);
    model.ProfissionalSaude var31 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getIdUsuario();
    var31.addAvaliacao(var35);
    var31.setTipo("hi!, \nhi!\n, ");
    var31.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var42 = var31.getAvaliacaoNegativa();
    java.lang.String var43 = var31.getTipo();
    java.lang.String var44 = var31.getNumeroRegistro();
    int var45 = var31.getAvaliacaoNegativa();
    var31.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var48 = var31.getTipo();
    var31.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    boolean var51 = var19.equals((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!, \nhi!\n, "+ "'", var43.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!, \nhi!\n, "+ "'", var48.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test221");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    model.Avaliacao var18 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var5.addAvaliacao(var18);
    java.lang.String var20 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test222");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getSala();
    java.lang.String var15 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test223");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test224");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test225");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    var6.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var12 = var6.getBairro();
    var6.setNumero("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test226");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    java.lang.String var12 = var5.getEspecialidade();
    model.Avaliacao var16 = new model.Avaliacao("", "hi!", false);
    java.lang.String var17 = var16.getCrm();
    java.lang.String var18 = var16.getCrm();
    java.lang.String var19 = var16.getCrm();
    boolean var20 = var16.isAvaliacao();
    boolean var21 = var16.isAvaliacao();
    var5.addAvaliacao(var16);
    model.Avaliacao var26 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    boolean var27 = var26.isAvaliacao();
    var5.addAvaliacao(var26);
    java.lang.String var29 = var26.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var29.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test227");


    model.Endereco var6 = new model.Endereco("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test228");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test229");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setBairro("hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test230");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var2.getNome();
    java.lang.String var7 = var2.getIdentificacao();
    var2.setNome(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    var2.setIdentificacao(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, "));

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test231");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var6.setCidade("hi!, hi!\n\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var18 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    java.lang.String var19 = var18.getCrm();
    boolean var20 = var6.equals((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test232");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var18 = var5.getNome();
    var5.addConvenio("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test233");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    java.lang.String var12 = var5.getEspecialidade();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var20 = var5.verificaParametros("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var21 = var5.getConvenio();
    int var22 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test234");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNome();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var17 = var5.getConvenio();
    java.lang.String var18 = var5.getNome();
    int var19 = var5.getAvaliacaoPositiva();
    java.lang.String var20 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test235");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test236");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var23 = var5.verificaParametros("", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, ");
    var5.setRegistro("");
    java.lang.String var26 = var5.getNome();
    java.lang.String var27 = var5.getNumeroRegistro();
    var5.setEspecialidade("hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test237");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    var6.setEstado("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var19 = var6.toString();
    java.lang.String var20 = var6.getEstado();
    var6.setSala("hi!, hi!\n\nhi!, ");
    java.lang.String var23 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, "+ "'", var19.equals("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, "+ "'", var20.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, "+ "'", var23.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, "));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test238");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    var8.addConvenio("hi!, \nhi!\n, ");
    var8.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var8.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var26 = var8.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test239");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getEstado();
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var16 = var6.getRua();
    java.lang.String var17 = var6.getCidade();
    java.lang.String var18 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\n, "+ "'", var18.equals("hi!, hi!, \nhi!\n, \nhi!\n, "));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test240");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    java.lang.String var17 = var5.getEspecialidade();
    java.lang.String var18 = var5.getEspecialidade();
    int var19 = var5.getAvaliacaoPositiva();
    java.lang.String var20 = var5.getNumeroRegistro();
    var5.addConvenio("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test241");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getConvenio();
    model.Avaliacao var17 = new model.Avaliacao("", "hi!", false);
    java.lang.String var18 = var17.getCrm();
    java.lang.String var19 = var17.getCrm();
    java.lang.String var20 = var17.getCrm();
    boolean var21 = var17.isAvaliacao();
    java.lang.String var22 = var17.getIdUsuario();
    var5.addAvaliacao(var17);
    java.lang.String var24 = var17.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test242");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ");

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test243");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\n\n, ");
    java.lang.String var20 = var5.getNome();
    var5.setTipo("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    model.Avaliacao var26 = new model.Avaliacao("", "hi!", false);
    java.lang.String var27 = var26.getCrm();
    java.lang.String var28 = var26.getCrm();
    java.lang.String var29 = var26.getIdUsuario();
    boolean var30 = var26.isAvaliacao();
    var5.addAvaliacao(var26);
    java.lang.String var32 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test244");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var6.getEstado();
    java.lang.String var16 = var6.getSala();
    java.lang.String var17 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var17.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test245");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    java.lang.String var28 = var5.getTipo();
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Usuario var33 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var39 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var43 = new model.Avaliacao("", "hi!", false);
    java.lang.String var44 = var43.getIdUsuario();
    var39.addAvaliacao(var43);
    var39.setConvenio("hi!");
    boolean var48 = var33.equals((java.lang.Object)var39);
    var39.addConvenio("");
    java.lang.String var51 = var39.getNome();
    model.Avaliacao var55 = new model.Avaliacao("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    var39.addAvaliacao(var55);
    java.lang.String var57 = var55.getCrm();
    var5.addAvaliacao(var55);
    model.Avaliacao var62 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var5.addAvaliacao(var62);
    boolean var64 = var62.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test246");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test247");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    model.Usuario var17 = new model.Usuario("hi!", "");
    java.lang.String var18 = var17.getNome();
    boolean var19 = var6.equals((java.lang.Object)var18);
    java.lang.String var20 = var6.getNumero();
    java.lang.String var21 = var6.getEstado();
    java.lang.String var22 = var6.getNumero();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    model.Usuario var27 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var37 = new model.Avaliacao("", "hi!", false);
    java.lang.String var38 = var37.getIdUsuario();
    var33.addAvaliacao(var37);
    var33.setConvenio("hi!");
    boolean var42 = var27.equals((java.lang.Object)var33);
    java.lang.String var43 = var27.getIdentificacao();
    java.lang.String var44 = var27.getNome();
    var27.setNome("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var27.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var49 = var27.getIdentificacao();
    var27.setIdentificacao(", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var52 = var6.equals((java.lang.Object)var27);
    java.lang.String var53 = var27.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!, \nhi!\n, "+ "'", var44.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var53.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test248");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var5.setNome("");
    model.Avaliacao var23 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    var5.addAvaliacao(var23);
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ");
    java.lang.String var27 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test249");


    model.Endereco var6 = new model.Endereco("hi!", "", "hi!", "", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var6.setBairro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var11 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test250");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test251");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", false);
    boolean var4 = var3.isAvaliacao();
    boolean var5 = var3.isAvaliacao();
    java.lang.String var6 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test252");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!");
    java.lang.String var11 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test253");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ");

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test254");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getBairro();
    java.lang.String var19 = var6.toString();
    var6.setRua("hi!, \nhi!\n, ");
    model.ProfissionalSaude var27 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var31 = new model.Avaliacao("", "hi!", false);
    java.lang.String var32 = var31.getIdUsuario();
    var27.addAvaliacao(var31);
    var27.setNumeroRegistro("");
    var27.setConvenio("hi!");
    java.lang.String var38 = var27.getTipo();
    model.Avaliacao var42 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var43 = var42.getCrm();
    java.lang.String var44 = var42.getCrm();
    var27.addAvaliacao(var42);
    boolean var46 = var6.equals((java.lang.Object)var27);
    java.lang.String var47 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var19.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!, \nhi!\n, "+ "'", var43.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!, \nhi!\n, "+ "'", var44.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test255");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var9 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test256");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var32 = var5.getNumeroRegistro();
    var5.setTipo("hi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test257");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getConvenio();
    var5.setRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Avaliacao var16 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", false);
    var5.addAvaliacao(var16);
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    model.Avaliacao var25 = new model.Avaliacao("hi!, hi!\n\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", true);
    java.lang.String var26 = var25.getCrm();
    var5.addAvaliacao(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\n\n, "+ "'", var26.equals("hi!, hi!\n\n, "));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test258");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", false);
    boolean var4 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test259");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    java.lang.String var18 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("");
    var5.setEspecialidade("");
    java.lang.String var23 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test260");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", true);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test261");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getEstado();
    model.Usuario var16 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var23 = var22.getNome();
    java.lang.String var24 = var22.getNumeroRegistro();
    int var25 = var22.getAvaliacaoPositiva();
    var22.setTipo("hi!, hi!\nhi!\n, ");
    int var28 = var22.getAvaliacaoPositiva();
    var22.addConvenio("hi!, hi!\nhi!\n, ");
    int var31 = var22.getAvaliacaoPositiva();
    boolean var36 = var22.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var22.addConvenio("hi!");
    var22.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var41 = var22.getTipo();
    java.lang.String var42 = var22.getNumeroRegistro();
    boolean var43 = var16.equals((java.lang.Object)var22);
    boolean var44 = var6.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test262");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \nhi!\n, ", true);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test263");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    var6.setRua(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var10 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var10.equals(", hi!\n\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test264");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    int var23 = var5.getAvaliacaoPositiva();
    int var24 = var5.getAvaliacaoNegativa();
    java.lang.String var25 = var5.getConvenio();
    var5.setConvenio("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test265");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test266");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    var5.addConvenio("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\n, ");
    boolean var23 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, \nhi!\n, hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var36 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var36.setCidade("");
    java.lang.String var39 = var36.getSala();
    var36.setCidade("");
    java.lang.String var42 = var36.toString();
    var36.setRua("hi!, \nhi!\n, ");
    java.lang.String var45 = var36.getRua();
    var36.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    boolean var48 = var5.equals((java.lang.Object)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var42.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, \nhi!\n, "+ "'", var45.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test267");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    int var28 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test268");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getConvenio();
    var5.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var24 = new model.Endereco("hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var24.setSala("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var27 = var24.getEstado();
    boolean var28 = var5.equals((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test269");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test270");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setNome("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test271");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var17 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test272");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    int var18 = var5.getAvaliacaoPositiva();
    java.lang.String var19 = var5.getTipo();
    java.lang.String var20 = var5.getNumeroRegistro();
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var28 = var27.getNumero();
    java.lang.String var29 = var27.getCidade();
    java.lang.String var30 = var27.getSala();
    var27.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var27.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var35 = var5.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test273");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", ", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test274");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    model.Endereco var17 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var17.setRua("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var6.equals((java.lang.Object)var17);
    java.lang.String var21 = var17.getEstado();
    var17.setSala("hi!\n");
    var17.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var26 = var17.getNumero();
    java.lang.String var27 = var17.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test275");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setRegistro("");
    var5.setTipo(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var26 = var5.getTipo();
    int var27 = var5.getAvaliacaoPositiva();
    model.Endereco var34 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var35 = var34.getNumero();
    var34.setEstado("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var38 = var5.equals((java.lang.Object)"hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    int var39 = var5.getAvaliacaoPositiva();
    java.lang.String var40 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var26.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var35.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var40.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test276");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    boolean var13 = var5.equals((java.lang.Object)1.0d);
    int var14 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test277");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var24 = var5.getTipo();
    java.lang.String var25 = var5.getNumeroRegistro();
    java.lang.String var26 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"+ "'", var26.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test278");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    model.Usuario var9 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var15 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var15.getNome();
    var15.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var9.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var9.setNome("");
    var9.setIdentificacao("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    boolean var24 = var2.equals((java.lang.Object)"hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test279");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!");
    model.ProfissionalSaude var27 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var31 = new model.Avaliacao("", "hi!", false);
    java.lang.String var32 = var31.getIdUsuario();
    var27.addAvaliacao(var31);
    var27.setConvenio("hi!");
    java.lang.String var36 = var27.getTipo();
    model.ProfissionalSaude var42 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var46 = new model.Avaliacao("", "hi!", false);
    java.lang.String var47 = var46.getIdUsuario();
    var42.addAvaliacao(var46);
    var27.addAvaliacao(var46);
    var5.addAvaliacao(var46);
    boolean var51 = var46.isAvaliacao();
    java.lang.String var52 = var46.getCrm();
    java.lang.String var53 = var46.getIdUsuario();
    java.lang.String var54 = var46.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test280");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test281");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getEstado();
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var8.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, "));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test282");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var26 = new model.Avaliacao("", "hi!", false);
    java.lang.String var27 = var26.getIdUsuario();
    var22.addAvaliacao(var26);
    int var29 = var22.getAvaliacaoPositiva();
    java.lang.String var30 = var22.getEspecialidade();
    boolean var31 = var5.equals((java.lang.Object)var22);
    model.Avaliacao var35 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", true);
    boolean var36 = var35.isAvaliacao();
    var5.addAvaliacao(var35);
    int var38 = var5.getAvaliacaoNegativa();
    java.lang.String var39 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test283");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.getRua();
    var6.setCidade(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var18 = var6.getSala();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var26 = var25.getSala();
    java.lang.String var27 = var25.getSala();
    java.lang.String var28 = var25.getCidade();
    var25.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var25.setRua(", \nhi!\n, hi!");
    boolean var33 = var6.equals((java.lang.Object)", \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test284");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.getBairro();
    var6.setRua(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, "));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test285");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoPositiva();
    int var16 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    model.Avaliacao var22 = new model.Avaliacao("", "hi!", false);
    java.lang.String var23 = var22.getCrm();
    java.lang.String var24 = var22.getIdUsuario();
    boolean var25 = var22.isAvaliacao();
    java.lang.String var26 = var22.getCrm();
    java.lang.String var27 = var22.getCrm();
    boolean var28 = var22.isAvaliacao();
    boolean var29 = var22.isAvaliacao();
    var5.addAvaliacao(var22);
    java.lang.String var31 = var22.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test286");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, , hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test287");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\n, ");

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test288");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    boolean var4 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test289");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setBairro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setBairro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var6.setCidade("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test290");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    model.Avaliacao var19 = new model.Avaliacao("", "hi!", false);
    java.lang.String var20 = var19.getCrm();
    boolean var21 = var5.equals((java.lang.Object)var19);
    java.lang.String var22 = var5.getNome();
    java.lang.String var23 = var5.getConvenio();
    model.ProfissionalSaude var29 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var30 = var29.getNome();
    java.lang.String var31 = var29.getNumeroRegistro();
    int var32 = var29.getAvaliacaoPositiva();
    var29.setTipo("hi!, hi!\nhi!\n, ");
    int var35 = var29.getAvaliacaoPositiva();
    java.lang.String var36 = var29.getNome();
    model.Endereco var43 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var45 = var43.equals((java.lang.Object)10L);
    java.lang.String var46 = var43.getNumero();
    var43.setNumero("");
    var43.setSala("hi!");
    boolean var51 = var29.equals((java.lang.Object)"hi!");
    var29.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var58 = var29.verificaParametros("", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!");
    var29.setConvenio("hi!");
    var29.setEspecialidade(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.Usuario var65 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var71 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var75 = new model.Avaliacao("", "hi!", false);
    java.lang.String var76 = var75.getIdUsuario();
    var71.addAvaliacao(var75);
    var71.setConvenio("hi!");
    boolean var80 = var65.equals((java.lang.Object)var71);
    var71.addConvenio("");
    model.Avaliacao var86 = new model.Avaliacao("", "hi!", false);
    java.lang.String var87 = var86.getIdUsuario();
    boolean var88 = var86.isAvaliacao();
    var71.addAvaliacao(var86);
    java.lang.String var90 = var86.getCrm();
    var29.addAvaliacao(var86);
    var5.addAvaliacao(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!"+ "'", var87.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + ""+ "'", var90.equals(""));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test291");


    model.Usuario var2 = new model.Usuario("", "");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var10 = var9.getNumero();
    var9.setNumero("hi!, hi!\nhi!\nhi!, ");
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var15 = var2.equals((java.lang.Object)var9);
    java.lang.String var16 = var9.toString();
    java.lang.String var17 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var16.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var17.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test292");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!");
    model.Usuario var10 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var20 = new model.Avaliacao("", "hi!", false);
    java.lang.String var21 = var20.getIdUsuario();
    var16.addAvaliacao(var20);
    var16.setConvenio("hi!");
    boolean var25 = var10.equals((java.lang.Object)var16);
    java.lang.String var26 = var10.getIdentificacao();
    boolean var28 = var10.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var29 = var5.equals((java.lang.Object)var10);
    var5.setEspecialidade("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test293");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var12 = var5.verificaParametros(", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", "", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test294");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    java.lang.String var21 = var6.getBairro();
    java.lang.String var22 = var6.getEstado();
    var6.setRua("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    java.lang.String var25 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test295");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    model.Endereco var10 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var10.setRua("hi!, hi!\n\nhi!, ");
    boolean var13 = var2.equals((java.lang.Object)var10);
    var10.setCidade("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test296");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    var8.addConvenio("hi!, \nhi!\n, ");
    var8.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var8.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var26 = var8.getAvaliacaoNegativa();
    java.lang.String var27 = var8.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test297");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\n\nhi!, ");
    java.lang.String var32 = var5.getNome();
    model.ProfissionalSaude var38 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var42 = new model.Avaliacao("", "hi!", false);
    java.lang.String var43 = var42.getIdUsuario();
    var38.addAvaliacao(var42);
    java.lang.String var45 = var38.getTipo();
    int var46 = var38.getAvaliacaoPositiva();
    var38.setTipo("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var49 = var38.getEspecialidade();
    model.Avaliacao var53 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var54 = var53.getCrm();
    var38.addAvaliacao(var53);
    var5.addAvaliacao(var53);
    boolean var61 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test298");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test299");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getBairro();
    java.lang.String var8 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test300");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var17 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test301");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var29 = new model.Avaliacao("", "hi!", false);
    java.lang.String var30 = var29.getIdUsuario();
    var25.addAvaliacao(var29);
    int var32 = var25.getAvaliacaoNegativa();
    boolean var37 = var25.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var25.setNome("");
    model.Avaliacao var43 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    var25.addAvaliacao(var43);
    model.Avaliacao var48 = new model.Avaliacao("hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    var25.addAvaliacao(var48);
    java.lang.String var50 = var48.getCrm();
    boolean var51 = var48.isAvaliacao();
    java.lang.String var52 = var48.getIdUsuario();
    boolean var53 = var48.isAvaliacao();
    var5.addAvaliacao(var48);
    java.lang.String var55 = var48.getIdUsuario();
    java.lang.String var56 = var48.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var52.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var55.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var56.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test302");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var16 = var5.getConvenio();
    java.lang.String var17 = var5.getNumeroRegistro();
    java.lang.String var18 = var5.getConvenio();
    var5.addConvenio(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var5.setConvenio("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNome(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test303");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\n\nhi!, ");
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test304");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    boolean var23 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var28 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test305");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var17 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    boolean var18 = var5.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var21 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test306");


    model.Usuario var2 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test307");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    var19.addAvaliacao(var23);
    var19.setTipo("hi!, \nhi!\n, ");
    java.lang.String var28 = var19.getTipo();
    var19.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var19.addConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var33 = var6.equals((java.lang.Object)var19);
    var19.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, \nhi!\n, "+ "'", var28.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test308");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var5.getConvenio();
    var5.setConvenio("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test309");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setEspecialidade("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    int var18 = var5.getAvaliacaoPositiva();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test310");


    model.Avaliacao var3 = new model.Avaliacao("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", true);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test311");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var17.addConvenio("hi!, hi!\nhi!\nhi!, \n");
    boolean var20 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test312");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var18 = var5.getNome();
    var5.setConvenio("hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test313");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var11 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test314");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\n\n, ");
    java.lang.String var20 = var5.getNome();
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var23 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test315");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "");
    var6.setEstado("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var9 = var6.getCidade();
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var9.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test316");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");
    var6.setBairro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var19 = var6.getRua();
    var6.setBairro("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var22 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var19.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var22.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test317");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    java.lang.String var12 = var5.getConvenio();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test318");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", true);
    boolean var4 = var3.isAvaliacao();
    boolean var5 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test319");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    model.Usuario var12 = new model.Usuario("", "");
    java.lang.String var13 = var12.getIdentificacao();
    var12.setIdentificacao("hi!");
    var12.setIdentificacao("hi!");
    var12.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var20 = var12.getNome();
    model.ProfissionalSaude var26 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getIdUsuario();
    var26.addAvaliacao(var30);
    var26.setNumeroRegistro("");
    var26.setConvenio("hi!");
    var26.setEspecialidade("hi!, \nhi!\n, ");
    boolean var39 = var12.equals((java.lang.Object)var26);
    model.ProfissionalSaude var45 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var49 = new model.Avaliacao("", "hi!", false);
    java.lang.String var50 = var49.getIdUsuario();
    var45.addAvaliacao(var49);
    java.lang.String var52 = var45.getNumeroRegistro();
    var45.setNumeroRegistro("hi!, \nhi!\n, ");
    var45.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var57 = var12.equals((java.lang.Object)var45);
    var45.setTipo("hi!, \nhi!\n, hi!");
    int var60 = var45.getAvaliacaoNegativa();
    model.ProfissionalSaude var66 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var67 = var66.getNome();
    var66.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var75 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var76 = var75.getNome();
    java.lang.String var77 = var75.getNumeroRegistro();
    int var78 = var75.getAvaliacaoPositiva();
    var75.setTipo("hi!, hi!\nhi!\n, ");
    int var81 = var75.getAvaliacaoPositiva();
    var75.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var84 = var75.getConvenio();
    boolean var85 = var66.equals((java.lang.Object)var75);
    int var86 = var66.getAvaliacaoPositiva();
    java.lang.String var87 = var66.getEspecialidade();
    int var88 = var66.getAvaliacaoNegativa();
    boolean var89 = var45.equals((java.lang.Object)var66);
    boolean var90 = var6.equals((java.lang.Object)var89);
    java.lang.String var91 = var6.getRua();
    var6.setBairro(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!"+ "'", var77.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var84.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!, \nhi!\n, "+ "'", var87.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "hi!"+ "'", var91.equals("hi!"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test320");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    var6.setRua("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var10 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test321");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getNome();
    model.Avaliacao var24 = new model.Avaliacao("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    var8.addAvaliacao(var24);
    int var26 = var8.getAvaliacaoPositiva();
    var8.setRegistro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    int var29 = var8.getAvaliacaoNegativa();
    int var30 = var8.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test322");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var2.setIdentificacao("hi!, hi!\n\nhi!, ");

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test323");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getSala();
    java.lang.String var10 = var6.getCidade();
    var6.setCidade("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test324");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\n\nhi!, ");
    java.lang.String var23 = var5.getNumeroRegistro();
    java.lang.String var24 = var5.getNumeroRegistro();
    java.lang.String var25 = var5.getEspecialidade();
    java.lang.String var26 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var23.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var24.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test325");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var7 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\n, hi!\n\nhi!, hi!, \nhi!\n, \n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\n, hi!\n\nhi!, hi!, \nhi!\n, \n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test326");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var23 = var22.getNumero();
    var22.setCidade("hi!");
    java.lang.String var26 = var22.getRua();
    java.lang.String var27 = var22.getSala();
    java.lang.String var28 = var22.getRua();
    java.lang.String var29 = var22.toString();
    boolean var30 = var5.equals((java.lang.Object)var22);
    java.lang.String var31 = var5.getNumeroRegistro();
    var5.setNome("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var29.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test327");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoPositiva();
    var5.setTipo("");
    var5.setRegistro("hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test328");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    var5.addAvaliacao(var39);
    java.lang.String var43 = var5.getNumeroRegistro();
    java.lang.String var44 = var5.getNome();
    var5.setNumeroRegistro("");
    var5.setNome("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    model.Avaliacao var52 = new model.Avaliacao("hi!", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", true);
    var5.addAvaliacao(var52);
    java.lang.String var54 = var52.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var43.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var54.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test329");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var9.setCidade("");
    java.lang.String var12 = var9.getSala();
    var9.setCidade("");
    java.lang.String var15 = var9.getRua();
    boolean var16 = var2.equals((java.lang.Object)var15);
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var19 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var19.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test330");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    int var26 = var5.getAvaliacaoNegativa();
    java.lang.String var27 = var5.getConvenio();
    java.lang.String var28 = var5.getConvenio();
    var5.setTipo("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var31 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var28.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test331");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getNome();
    int var15 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test332");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var24 = var5.getTipo();
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    int var37 = var30.getAvaliacaoPositiva();
    var30.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var40 = var30.getAvaliacaoNegativa();
    model.Avaliacao var44 = new model.Avaliacao("hi!", "", true);
    var30.addAvaliacao(var44);
    var5.addAvaliacao(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test333");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.toString();
    var6.setCidade(", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!, hi!\nhi!\n, \nhi!\n, "+ "'", var12.equals("hi!, hi!, hi!\nhi!\n, \nhi!\n, "));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test334");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getBairro();
    var6.setSala("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test335");


    model.Avaliacao var3 = new model.Avaliacao(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test336");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var2.getNome();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test337");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n, , ");

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test338");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoPositiva();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    java.lang.String var18 = var5.getEspecialidade();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!"+ "'", var18.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test339");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoPositiva();
    java.lang.String var17 = var5.getEspecialidade();
    java.lang.String var18 = var5.getTipo();
    var5.setEspecialidade("");
    java.lang.String var21 = var5.getEspecialidade();
    var5.setRegistro("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var24 = var5.getConvenio();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test340");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var29 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var30 = var29.getNome();
    var29.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var38 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var39 = var38.getNome();
    java.lang.String var40 = var38.getNumeroRegistro();
    int var41 = var38.getAvaliacaoPositiva();
    var38.setTipo("hi!, hi!\nhi!\n, ");
    int var44 = var38.getAvaliacaoPositiva();
    var38.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var47 = var38.getConvenio();
    boolean var48 = var29.equals((java.lang.Object)var38);
    var29.addConvenio("hi!");
    var29.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var53 = var29.getAvaliacaoNegativa();
    boolean var54 = var5.equals((java.lang.Object)var29);
    model.ProfissionalSaude var60 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var64 = new model.Avaliacao("", "hi!", false);
    java.lang.String var65 = var64.getIdUsuario();
    var60.addAvaliacao(var64);
    var60.setTipo("hi!, \nhi!\n, ");
    var60.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var75 = var60.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var60.setRegistro("hi!, hi!\n\nhi!, ");
    java.lang.String var78 = var60.getNumeroRegistro();
    boolean var79 = var5.equals((java.lang.Object)var78);
    var5.setConvenio("hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var47.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var78.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test341");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test342");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    var5.addAvaliacao(var39);
    int var43 = var5.getAvaliacaoNegativa();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var46 = var5.getEspecialidade();
    model.Avaliacao var50 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", false);
    boolean var51 = var50.isAvaliacao();
    java.lang.String var52 = var50.getIdUsuario();
    var5.addAvaliacao(var50);
    var5.setTipo("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    int var56 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var46.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!, \nhi!\n, "+ "'", var52.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test343");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    java.lang.String var16 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var26 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var26.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var26.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var31 = var5.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test344");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", true);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var4.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test345");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    java.lang.String var13 = var6.getBairro();
    var6.setNumero("hi!");
    var6.setRua("");
    var6.setBairro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var13.equals("hi!, hi!\n\nhi!, "));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test346");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNome();
    var5.setNome("hi!, \nhi!\n, ");
    model.Usuario var17 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    var23.setConvenio("hi!");
    boolean var32 = var17.equals((java.lang.Object)var23);
    var23.addConvenio("");
    var23.addConvenio("hi!, \nhi!\n, ");
    model.Avaliacao var40 = new model.Avaliacao(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    boolean var41 = var23.equals((java.lang.Object)var40);
    java.lang.String var42 = var40.getIdUsuario();
    var5.addAvaliacao(var40);
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var46 = var5.getAvaliacaoNegativa();
    model.ProfissionalSaude var52 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var53 = var52.getNome();
    java.lang.String var54 = var52.getNumeroRegistro();
    int var55 = var52.getAvaliacaoPositiva();
    var52.setTipo("hi!, hi!\nhi!\n, ");
    int var58 = var52.getAvaliacaoPositiva();
    var52.addConvenio("hi!, hi!\nhi!\n, ");
    var52.setNumeroRegistro("hi!, \nhi!\n, ");
    int var63 = var52.getAvaliacaoPositiva();
    var52.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    model.Avaliacao var69 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var52.addAvaliacao(var69);
    boolean var71 = var5.equals((java.lang.Object)var52);
    java.lang.String var72 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var42.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!, \nhi!\n, "+ "'", var72.equals("hi!, \nhi!\n, "));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test347");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var26 = var5.getNumeroRegistro();
    java.lang.String var27 = var5.getNumeroRegistro();
    java.lang.String var28 = var5.getConvenio();
    int var29 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var26.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var27.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test348");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\n\n, ");
    var2.setNome("hi!, hi!\n\n, ");
    var2.setNome("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var2.getNome();
    java.lang.String var10 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\n\n, "+ "'", var10.equals("hi!, hi!\n\n, "));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test349");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    java.lang.String var11 = var6.getEstado();
    model.Endereco var18 = new model.Endereco("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    boolean var19 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    java.lang.String var20 = var6.getEstado();
    var6.setNumero("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test350");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", true);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, "+ "'", var4.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, "));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test351");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test352");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getRua();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test353");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    java.lang.String var15 = var6.toString();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var6.getBairro();
    java.lang.String var23 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test354");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var11 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var11.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test355");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", ", \nhi!\n, hi!", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test356");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getNumeroRegistro();
    int var28 = var25.getAvaliacaoPositiva();
    var25.setTipo("hi!, hi!\nhi!\n, ");
    int var31 = var25.getAvaliacaoPositiva();
    var25.addConvenio("hi!, hi!\nhi!\n, ");
    int var34 = var25.getAvaliacaoPositiva();
    boolean var39 = var25.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var25.addConvenio("hi!");
    model.ProfissionalSaude var47 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var51 = new model.Avaliacao("", "hi!", false);
    java.lang.String var52 = var51.getIdUsuario();
    var47.addAvaliacao(var51);
    var47.setConvenio("hi!");
    java.lang.String var56 = var47.getTipo();
    model.ProfissionalSaude var62 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var66 = new model.Avaliacao("", "hi!", false);
    java.lang.String var67 = var66.getIdUsuario();
    var62.addAvaliacao(var66);
    var47.addAvaliacao(var66);
    var25.addAvaliacao(var66);
    var5.addAvaliacao(var66);
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.addConvenio("");
    java.lang.String var76 = var5.getConvenio();
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var83 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var76.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test357");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var23 = var5.verificaParametros("", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, ");
    var5.setRegistro("");
    java.lang.String var26 = var5.getNome();
    var5.setEspecialidade("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test358");


    model.Avaliacao var3 = new model.Avaliacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var4.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var5.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test359");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\n, ");
    var6.setCidade("");
    java.lang.String var16 = var6.getBairro();
    java.lang.String var17 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test360");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var14.getNome();
    java.lang.String var16 = var14.getNumeroRegistro();
    int var17 = var14.getAvaliacaoPositiva();
    var14.setTipo("hi!, hi!\nhi!\n, ");
    int var20 = var14.getAvaliacaoPositiva();
    var14.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var23 = var14.getConvenio();
    boolean var24 = var5.equals((java.lang.Object)var14);
    var14.setRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var14.setRegistro("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test361");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    model.ProfissionalSaude var15 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var15.getNome();
    var15.setEspecialidade("hi!, \nhi!\n, ");
    var15.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var15.setNome("hi!, hi!\nhi!\nhi!, ");
    var15.setNome("hi!, \nhi!\n, ");
    boolean var25 = var6.equals((java.lang.Object)var15);
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test362");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getTipo();
    var8.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var23 = var8.getNumeroRegistro();
    model.Avaliacao var27 = new model.Avaliacao("hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", true);
    var8.addAvaliacao(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test363");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var2.getNome();
    java.lang.String var7 = var2.getNome();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var2.setIdentificacao("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, "));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test364");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test365");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    int var27 = var20.getAvaliacaoNegativa();
    var20.addConvenio("hi!");
    java.lang.String var30 = var20.getTipo();
    java.lang.String var31 = var20.getConvenio();
    boolean var32 = var5.equals((java.lang.Object)var20);
    boolean var37 = var5.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!", "");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var40 = var5.getEspecialidade();
    java.lang.String var41 = var5.getConvenio();
    java.lang.String var42 = var5.getTipo();
    java.lang.String var43 = var5.getEspecialidade();
    model.Endereco var50 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var50.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var53 = var5.equals((java.lang.Object)var50);
    var50.setSala("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test366");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\n, , \nhi!\n, ", "hi!, \nhi!\n, hi!");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\n\n, , \nhi!\n, "+ "'", var3.equals("hi!, hi!\n\n, , \nhi!\n, "));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test367");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    var8.addConvenio("hi!, \nhi!\n, ");
    var8.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var8.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var26 = var8.getAvaliacaoNegativa();
    var8.setNome("hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test368");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    var15.setRua("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var20 = var15.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, \nhi!\n, "+ "'", var20.equals("hi!, \nhi!\n, "));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test369");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    int var18 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var28 = new model.Avaliacao("", "hi!", false);
    java.lang.String var29 = var28.getIdUsuario();
    var24.addAvaliacao(var28);
    var24.setNumeroRegistro("");
    java.lang.String var33 = var24.getNome();
    var24.setEspecialidade("hi!");
    boolean var36 = var5.equals((java.lang.Object)var24);
    java.lang.String var37 = var5.getEspecialidade();
    var5.addConvenio("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var37.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test370");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test371");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    var6.setEstado("hi!");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var17 = var6.getBairro();
    java.lang.String var18 = var6.getNumero();
    var6.setSala("hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test372");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    java.lang.String var23 = var5.getTipo();
    java.lang.String var24 = var5.getEspecialidade();
    int var25 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test373");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", true);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, "+ "'", var4.equals("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, "));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test374");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    java.lang.String var18 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!\n");
    boolean var29 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    var5.setTipo("hi!, \nhi!\n, hi!");
    int var32 = var5.getAvaliacaoPositiva();
    model.Usuario var35 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var35.setIdentificacao("hi!, \nhi!\n, ");
    var35.setNome("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var40 = var35.getNome();
    java.lang.String var41 = var35.getNome();
    var35.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    boolean var44 = var5.equals((java.lang.Object)"hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var40.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test375");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!\n", "hi!, hi!\n\n, ", "", "");
    java.lang.String var20 = var5.getConvenio();
    var5.setEspecialidade("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var25 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test376");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var32 = var5.getNumeroRegistro();
    var5.addConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var39 = var5.verificaParametros("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, , hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test377");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test378");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var10 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\n, "));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test379");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getSala();
    var6.setSala("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!\n"+ "'", var9.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test380");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var14.getNome();
    java.lang.String var16 = var14.getNumeroRegistro();
    int var17 = var14.getAvaliacaoPositiva();
    var14.setTipo("hi!, hi!\nhi!\n, ");
    int var20 = var14.getAvaliacaoPositiva();
    var14.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var23 = var14.getConvenio();
    boolean var24 = var5.equals((java.lang.Object)var14);
    boolean var29 = var14.verificaParametros("hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var14.setEspecialidade("hi!, hi!\n\nhi!, ");
    java.lang.String var32 = var14.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var32.equals("hi!, hi!\n\nhi!, "));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test381");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var2.getNome();
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var20 = new model.Avaliacao("", "hi!", false);
    java.lang.String var21 = var20.getIdUsuario();
    var16.addAvaliacao(var20);
    var16.setNumeroRegistro("");
    var16.setConvenio("hi!");
    var16.setEspecialidade("hi!, \nhi!\n, ");
    boolean var29 = var2.equals((java.lang.Object)var16);
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    java.lang.String var42 = var35.getNumeroRegistro();
    var35.setNumeroRegistro("hi!, \nhi!\n, ");
    var35.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var47 = var2.equals((java.lang.Object)var35);
    var35.setTipo("hi!, \nhi!\n, hi!");
    int var50 = var35.getAvaliacaoNegativa();
    model.ProfissionalSaude var56 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var57 = var56.getNome();
    var56.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var65 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var66 = var65.getNome();
    java.lang.String var67 = var65.getNumeroRegistro();
    int var68 = var65.getAvaliacaoPositiva();
    var65.setTipo("hi!, hi!\nhi!\n, ");
    int var71 = var65.getAvaliacaoPositiva();
    var65.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var74 = var65.getConvenio();
    boolean var75 = var56.equals((java.lang.Object)var65);
    int var76 = var56.getAvaliacaoPositiva();
    java.lang.String var77 = var56.getEspecialidade();
    int var78 = var56.getAvaliacaoNegativa();
    boolean var79 = var35.equals((java.lang.Object)var56);
    var35.setRegistro(", hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var74.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!, \nhi!\n, "+ "'", var77.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test382");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \n, \nhi!, hi!\n\nhi!, \n, ", "hi!, hi!, \nhi!\n, \nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test383");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test384");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, hi!");
    var2.setIdentificacao(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test385");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    boolean var13 = var5.equals((java.lang.Object)1.0d);
    var5.setNome("");
    boolean var20 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test386");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getBairro();
    var6.setSala("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var14 = var6.getEstado();
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test387");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var23 = var22.getNome();
    var22.setEspecialidade("hi!, \nhi!\n, ");
    var22.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var28 = var22.getTipo();
    var22.setEspecialidade("");
    int var31 = var22.getAvaliacaoNegativa();
    java.lang.String var32 = var22.getNumeroRegistro();
    boolean var37 = var22.verificaParametros("hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var43 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var47 = new model.Avaliacao("", "hi!", false);
    java.lang.String var48 = var47.getIdUsuario();
    var43.addAvaliacao(var47);
    var43.setConvenio("hi!");
    var43.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var57 = new model.Avaliacao("", "hi!", false);
    java.lang.String var58 = var57.getCrm();
    java.lang.String var59 = var57.getCrm();
    boolean var60 = var57.isAvaliacao();
    java.lang.String var61 = var57.getCrm();
    java.lang.String var62 = var57.getCrm();
    var43.addAvaliacao(var57);
    java.lang.String var64 = var57.getIdUsuario();
    java.lang.String var65 = var57.getCrm();
    var22.addAvaliacao(var57);
    var5.addAvaliacao(var57);
    boolean var68 = var57.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test388");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    model.Endereco var14 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ");
    boolean var15 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var25 = var24.getNumero();
    var24.setCidade("hi!");
    java.lang.String var28 = var24.getBairro();
    var24.setEstado("hi!, \nhi!\n, ");
    var24.setRua("");
    var24.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var41 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var43 = var41.equals((java.lang.Object)10L);
    var41.setCidade("");
    var41.setBairro("");
    java.lang.String var48 = var41.getNumero();
    boolean var49 = var24.equals((java.lang.Object)var41);
    var24.setCidade("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var52 = var24.getNumero();
    boolean var53 = var2.equals((java.lang.Object)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var52.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test389");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getSala();
    java.lang.String var19 = var6.toString();
    var6.setSala("hi!, hi!\n\nhi!, ");
    model.Endereco var28 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var28.setNumero("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var37 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var37.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var40 = var37.getRua();
    var37.setSala("hi!, hi!\nhi!\nhi!, ");
    var37.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var45 = var28.equals((java.lang.Object)var37);
    var37.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var37.setBairro("hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var50 = var6.equals((java.lang.Object)var37);
    java.lang.String var51 = var6.getRua();
    var6.setBairro("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var19.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var40.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test390");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test391");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var10 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var14 = new model.Avaliacao("", "hi!", false);
    java.lang.String var15 = var14.getIdUsuario();
    var10.addAvaliacao(var14);
    java.lang.String var17 = var10.getNome();
    var10.setNome("hi!, \nhi!\n, ");
    model.Usuario var22 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("", "hi!", false);
    java.lang.String var33 = var32.getIdUsuario();
    var28.addAvaliacao(var32);
    var28.setConvenio("hi!");
    boolean var37 = var22.equals((java.lang.Object)var28);
    var28.addConvenio("");
    var28.addConvenio("hi!, \nhi!\n, ");
    model.Avaliacao var45 = new model.Avaliacao(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    boolean var46 = var28.equals((java.lang.Object)var45);
    java.lang.String var47 = var45.getIdUsuario();
    var10.addAvaliacao(var45);
    java.lang.String var49 = var45.getCrm();
    boolean var50 = var2.equals((java.lang.Object)var49);
    java.lang.String var51 = var2.getNome();
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, ");
    java.lang.String var56 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var47.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var49.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var51.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, "+ "'", var56.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, "));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test392");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Usuario var9 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var10 = var9.getNome();
    model.Endereco var17 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var19 = var17.equals((java.lang.Object)10L);
    java.lang.String var20 = var17.getNumero();
    var17.setNumero("");
    java.lang.String var23 = var17.getSala();
    var17.setNumero("hi!");
    java.lang.String var26 = var17.getBairro();
    var17.setSala("hi!");
    java.lang.String var29 = var17.getRua();
    boolean var30 = var9.equals((java.lang.Object)var17);
    boolean var31 = var6.equals((java.lang.Object)var17);
    var6.setRua("hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test393");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var32 = var5.getAvaliacaoNegativa();
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test394");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    java.lang.String var8 = var6.getEstado();
    var6.setNumero("hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test395");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var12 = var6.getEstado();
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test396");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var15 = var5.verificaParametros(", \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    int var16 = var5.getAvaliacaoPositiva();
    boolean var21 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test397");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getNome();
    boolean var25 = var8.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var8.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var28 = var8.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test398");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var26 = var5.getNumeroRegistro();
    java.lang.String var27 = var5.getNumeroRegistro();
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var26.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var27.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test399");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.getNumero();
    java.lang.String var24 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var27 = var6.getBairro();
    java.lang.String var28 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test400");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNome();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test401");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var8 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test402");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getNumero();
    var6.setSala("hi!, hi!\n\n, ");
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var16.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var19 = var16.getNome();
    model.Avaliacao var23 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", false);
    boolean var24 = var23.isAvaliacao();
    var16.addAvaliacao(var23);
    var16.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    boolean var28 = var6.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var19.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test403");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n, hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n, \nhi!, hi!\n\nhi!, \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test404");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var7 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test405");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var2.getNome();
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var20 = new model.Avaliacao("", "hi!", false);
    java.lang.String var21 = var20.getIdUsuario();
    var16.addAvaliacao(var20);
    var16.setNumeroRegistro("");
    var16.setConvenio("hi!");
    var16.setEspecialidade("hi!, \nhi!\n, ");
    boolean var29 = var2.equals((java.lang.Object)var16);
    var2.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var34 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var39 = var2.getIdentificacao();
    model.ProfissionalSaude var45 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var45.setConvenio("hi!");
    var45.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var50 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var34.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var39.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test406");


    model.Avaliacao var3 = new model.Avaliacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", true);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test407");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    int var30 = var23.getAvaliacaoPositiva();
    java.lang.String var31 = var23.getEspecialidade();
    model.ProfissionalSaude var37 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var38 = var37.getNome();
    java.lang.String var39 = var37.getNumeroRegistro();
    int var40 = var37.getAvaliacaoPositiva();
    var37.setTipo("hi!, hi!\nhi!\n, ");
    int var43 = var37.getAvaliacaoPositiva();
    var37.addConvenio("hi!, hi!\nhi!\n, ");
    int var46 = var37.getAvaliacaoPositiva();
    boolean var51 = var37.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var37.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var37.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var37.setNome("hi!, \nhi!\n, ");
    boolean var58 = var23.equals((java.lang.Object)var37);
    boolean var59 = var5.equals((java.lang.Object)var37);
    boolean var64 = var37.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test408");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoPositiva();
    java.lang.String var17 = var5.getEspecialidade();
    java.lang.String var18 = var5.getTipo();
    var5.setEspecialidade("");
    java.lang.String var21 = var5.getEspecialidade();
    var5.setRegistro("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var24 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var27 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test409");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", false);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test410");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    java.lang.String var18 = var2.getIdentificacao();
    boolean var20 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    model.Usuario var27 = new model.Usuario("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var28 = var2.equals((java.lang.Object)var27);
    java.lang.String var29 = var27.getIdentificacao();
    java.lang.String var30 = var27.getNome();
    var27.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var29.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var30.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test411");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test412");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getBairro();
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var24.setCidade("");
    var24.setBairro("hi!");
    java.lang.String var29 = var24.getEstado();
    java.lang.String var30 = var24.getCidade();
    var24.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var24.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var24.setEstado("hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");
    boolean var37 = var6.equals((java.lang.Object)"hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test413");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    var19.addAvaliacao(var23);
    var19.setTipo("hi!, \nhi!\n, ");
    java.lang.String var28 = var19.getTipo();
    var19.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var19.addConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var33 = var6.equals((java.lang.Object)var19);
    model.Endereco var40 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var41 = var40.getRua();
    var40.setEstado("hi!");
    java.lang.String var44 = var40.getCidade();
    var40.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var47 = var40.getRua();
    boolean var48 = var19.equals((java.lang.Object)var40);
    java.lang.String var49 = var40.toString();
    java.lang.String var50 = var40.toString();
    var40.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var53 = var40.getNumero();
    java.lang.String var54 = var40.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, \nhi!\n, "+ "'", var28.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, hi!\nhi!\n, hi!"+ "'", var49.equals("hi!, hi!\nhi!\n, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!, hi!\nhi!\n, hi!"+ "'", var50.equals("hi!, hi!\nhi!\n, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, hi!"+ "'", var54.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, hi!"));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test414");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var11 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test415");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getNome();
    int var15 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test416");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoPositiva();
    int var16 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setNome("hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var21 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var21.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test417");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    java.lang.String var7 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test418");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    var19.setSala("hi!");
    boolean var27 = var5.equals((java.lang.Object)"hi!");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var34 = var5.verificaParametros("", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!");
    var5.setConvenio("hi!");
    var5.setEspecialidade(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.Usuario var41 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var47 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var51 = new model.Avaliacao("", "hi!", false);
    java.lang.String var52 = var51.getIdUsuario();
    var47.addAvaliacao(var51);
    var47.setConvenio("hi!");
    boolean var56 = var41.equals((java.lang.Object)var47);
    var47.addConvenio("");
    model.Avaliacao var62 = new model.Avaliacao("", "hi!", false);
    java.lang.String var63 = var62.getIdUsuario();
    boolean var64 = var62.isAvaliacao();
    var47.addAvaliacao(var62);
    java.lang.String var66 = var62.getCrm();
    var5.addAvaliacao(var62);
    java.lang.String var68 = var62.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test419");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    model.ProfissionalSaude var11 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var12 = var11.getNome();
    java.lang.String var13 = var11.getNumeroRegistro();
    int var14 = var11.getAvaliacaoPositiva();
    var11.setTipo("hi!, hi!\nhi!\n, ");
    int var17 = var11.getAvaliacaoPositiva();
    java.lang.String var18 = var11.getNome();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var27 = var25.equals((java.lang.Object)10L);
    java.lang.String var28 = var25.getNumero();
    var25.setNumero("");
    var25.setSala("hi!");
    boolean var33 = var11.equals((java.lang.Object)"hi!");
    var11.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var41 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var45 = new model.Avaliacao("", "hi!", false);
    java.lang.String var46 = var45.getIdUsuario();
    var41.addAvaliacao(var45);
    var11.addAvaliacao(var45);
    java.lang.String var49 = var11.getNumeroRegistro();
    java.lang.String var50 = var11.getEspecialidade();
    boolean var51 = var2.equals((java.lang.Object)var11);
    var11.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var49.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test420");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    var6.setEstado("hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test421");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test422");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    int var6 = var5.getAvaliacaoNegativa();
    java.lang.String var7 = var5.getNumeroRegistro();
    var5.setNome("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var7.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test423");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ");
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!\n");
    var12.setNome("hi!, hi!\nhi!\nhi!, ");
    boolean var15 = var6.equals((java.lang.Object)var12);
    var6.setBairro("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test424");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var20 = var5.getNome();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \n");
    var5.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test425");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\n\nhi!, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test426");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    int var20 = var5.getAvaliacaoPositiva();
    java.lang.String var21 = var5.getTipo();
    model.Avaliacao var25 = new model.Avaliacao("", "hi!", false);
    java.lang.String var26 = var25.getCrm();
    java.lang.String var27 = var25.getIdUsuario();
    var5.addAvaliacao(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, \nhi!\n, "+ "'", var21.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test427");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    int var16 = var5.getAvaliacaoPositiva();
    java.lang.String var17 = var5.getEspecialidade();
    java.lang.String var18 = var5.getTipo();
    var5.setEspecialidade("");
    java.lang.String var21 = var5.getEspecialidade();
    java.lang.String var22 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test428");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    java.lang.String var18 = var5.getNumeroRegistro();
    int var19 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var22 = var5.getTipo();
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var25 = var5.getTipo();
    model.Usuario var28 = new model.Usuario("", "");
    model.Endereco var35 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var36 = var35.getNumero();
    var35.setNumero("hi!, hi!\nhi!\nhi!, ");
    var35.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var41 = var28.equals((java.lang.Object)var35);
    var35.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var35.setRua("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var35.setSala("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    var35.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var50 = var35.getRua();
    java.lang.String var51 = var35.getEstado();
    var35.setSala("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var35.setCidade("hi!");
    boolean var56 = var5.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, \nhi!\n, "+ "'", var25.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var50.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var51.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test429");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.getRua();
    var6.setCidade(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var18 = var6.getNumero();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var23 = new model.Usuario("", "");
    java.lang.String var24 = var23.getNome();
    java.lang.String var25 = var23.getIdentificacao();
    var23.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    boolean var28 = var6.equals((java.lang.Object)"hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var29 = var6.getBairro();
    java.lang.String var30 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test430");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var6 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var16 = var15.getNumero();
    var15.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var19 = var15.getRua();
    var15.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var22 = var15.getNumero();
    var15.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var25 = var15.getCidade();
    java.lang.String var26 = var15.getEstado();
    boolean var27 = var5.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var22.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test431");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    java.lang.String var7 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var12 = var2.getNome();
    model.Usuario var15 = new model.Usuario("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var16 = var15.getNome();
    var15.setNome("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    boolean var19 = var2.equals((java.lang.Object)var15);
    java.lang.String var20 = var15.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, \nhi!\n, "+ "'", var20.equals("hi!, \nhi!\n, "));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test432");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    java.lang.String var18 = var5.getNumeroRegistro();
    int var19 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var22 = var5.getTipo();
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var25 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test433");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setNome("");
    java.lang.String var8 = var5.getNumeroRegistro();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var8.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test434");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    model.Endereco var14 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var15 = var14.getNumero();
    var14.setCidade("hi!");
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var26 = var24.equals((java.lang.Object)10L);
    java.lang.String var27 = var24.getNumero();
    boolean var28 = var14.equals((java.lang.Object)var27);
    var14.setBairro("");
    java.lang.String var31 = var14.getBairro();
    var14.setNumero("hi!, hi!\nhi!\n, ");
    boolean var34 = var6.equals((java.lang.Object)var14);
    var14.setBairro("");
    java.lang.String var37 = var14.getBairro();
    java.lang.String var38 = var14.getEstado();
    java.lang.String var39 = var14.getSala();
    java.lang.String var40 = var14.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test435");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, \nhi!\nhi!, ");

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test436");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getCrm();
    java.lang.String var7 = var3.getCrm();
    java.lang.String var8 = var3.getIdUsuario();
    java.lang.String var9 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test437");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    int var20 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.addConvenio("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var27 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test438");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    model.Usuario var15 = new model.Usuario("", "");
    java.lang.String var16 = var15.getIdentificacao();
    var15.setIdentificacao("hi!");
    var15.setIdentificacao("hi!");
    boolean var21 = var6.equals((java.lang.Object)"hi!");
    java.lang.String var22 = var6.getSala();
    java.lang.String var23 = var6.getEstado();
    java.lang.String var24 = var6.getBairro();
    var6.setCidade("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var27 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test439");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var26 = new model.Avaliacao("", "hi!", false);
    java.lang.String var27 = var26.getIdUsuario();
    var22.addAvaliacao(var26);
    int var29 = var22.getAvaliacaoPositiva();
    java.lang.String var30 = var22.getEspecialidade();
    boolean var31 = var5.equals((java.lang.Object)var22);
    model.Avaliacao var35 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", true);
    boolean var36 = var35.isAvaliacao();
    var5.addAvaliacao(var35);
    int var38 = var5.getAvaliacaoNegativa();
    boolean var43 = var5.verificaParametros("hi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \n, \nhi!, hi!\n\nhi!, \n, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test440");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    var19.addAvaliacao(var23);
    java.lang.String var26 = var19.getConvenio();
    boolean var27 = var5.equals((java.lang.Object)var19);
    java.lang.String var28 = var5.getTipo();
    model.ProfissionalSaude var34 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var35 = var34.getNome();
    java.lang.String var36 = var34.getNumeroRegistro();
    int var37 = var34.getAvaliacaoPositiva();
    model.Endereco var44 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var44.setCidade("");
    java.lang.String var47 = var44.getSala();
    java.lang.String var48 = var44.getCidade();
    boolean var49 = var34.equals((java.lang.Object)var44);
    java.lang.String var50 = var34.getEspecialidade();
    java.lang.String var51 = var34.getNome();
    boolean var52 = var5.equals((java.lang.Object)var51);
    java.lang.String var53 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test441");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    var6.setNumero("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getNumero();
    model.Endereco var20 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var21 = var20.getSala();
    var20.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var20.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    boolean var26 = var6.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, \nhi!\n, "+ "'", var21.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test442");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var14.getNome();
    java.lang.String var16 = var14.getNumeroRegistro();
    int var17 = var14.getAvaliacaoPositiva();
    var14.setTipo("hi!, hi!\nhi!\n, ");
    int var20 = var14.getAvaliacaoPositiva();
    var14.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var23 = var14.getConvenio();
    boolean var24 = var5.equals((java.lang.Object)var14);
    int var25 = var5.getAvaliacaoPositiva();
    var5.addConvenio(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var30 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test443");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("hi!");
    java.lang.String var15 = var6.getBairro();
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var22.setCidade("");
    var22.setBairro("hi!");
    var22.setSala("hi!");
    java.lang.String var29 = var22.toString();
    boolean var30 = var6.equals((java.lang.Object)var29);
    java.lang.String var31 = var6.getCidade();
    java.lang.String var32 = var6.getSala();
    var6.setEstado("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var6.setBairro("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    model.Usuario var39 = new model.Usuario("", "");
    model.Endereco var46 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var47 = var46.getNumero();
    var46.setNumero("hi!, hi!\nhi!\nhi!, ");
    var46.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var52 = var39.equals((java.lang.Object)var46);
    var46.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var55 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var29.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test444");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    java.lang.String var6 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test445");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("");
    java.lang.String var12 = var2.getNome();
    model.Endereco var19 = new model.Endereco("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    var19.setSala("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    boolean var22 = var2.equals((java.lang.Object)"hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test446");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var5.setNome("");
    model.Avaliacao var23 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    var5.addAvaliacao(var23);
    model.Avaliacao var28 = new model.Avaliacao("hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    var5.addAvaliacao(var28);
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    boolean var36 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Avaliacao var40 = new model.Avaliacao("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", false);
    boolean var41 = var5.equals((java.lang.Object)false);
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test447");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    model.Usuario var26 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var26.setIdentificacao("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var33 = var32.isAvaliacao();
    java.lang.String var34 = var32.getCrm();
    java.lang.String var35 = var32.getCrm();
    boolean var36 = var26.equals((java.lang.Object)var32);
    var5.addAvaliacao(var32);
    int var38 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test448");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var5.setNome("");
    model.Avaliacao var23 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    var5.addAvaliacao(var23);
    model.Avaliacao var28 = new model.Avaliacao("hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    var5.addAvaliacao(var28);
    model.Avaliacao var33 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", true);
    var5.addAvaliacao(var33);
    boolean var35 = var33.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test449");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var18 = var5.getNome();
    java.lang.String var19 = var5.getNome();
    var5.setEspecialidade("hi!, hi!, \nhi!\n, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test450");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ", false);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test451");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getNumeroRegistro();
    int var28 = var25.getAvaliacaoPositiva();
    var25.setTipo("hi!, hi!\nhi!\n, ");
    int var31 = var25.getAvaliacaoPositiva();
    var25.addConvenio("hi!, hi!\nhi!\n, ");
    int var34 = var25.getAvaliacaoPositiva();
    boolean var39 = var25.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var25.addConvenio("hi!");
    model.ProfissionalSaude var47 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var51 = new model.Avaliacao("", "hi!", false);
    java.lang.String var52 = var51.getIdUsuario();
    var47.addAvaliacao(var51);
    var47.setConvenio("hi!");
    java.lang.String var56 = var47.getTipo();
    model.ProfissionalSaude var62 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var66 = new model.Avaliacao("", "hi!", false);
    java.lang.String var67 = var66.getIdUsuario();
    var62.addAvaliacao(var66);
    var47.addAvaliacao(var66);
    var25.addAvaliacao(var66);
    var5.addAvaliacao(var66);
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.addConvenio("");
    java.lang.String var76 = var5.getConvenio();
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var83 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var86 = var5.getTipo();
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var76.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!"+ "'", var86.equals("hi!"));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test452");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getSala();
    java.lang.String var10 = var6.getSala();
    var6.setEstado("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    var6.setBairro("hi!, hi!\n, hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test453");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getConvenio();
    var5.setRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Avaliacao var16 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", false);
    var5.addAvaliacao(var16);
    model.Endereco var24 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var25 = var24.getEstado();
    model.ProfissionalSaude var31 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getIdUsuario();
    var31.addAvaliacao(var35);
    int var38 = var31.getAvaliacaoNegativa();
    var31.addConvenio("hi!");
    java.lang.String var41 = var31.getTipo();
    java.lang.String var42 = var31.getTipo();
    boolean var43 = var24.equals((java.lang.Object)var42);
    model.Endereco var50 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var50.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var53 = var24.equals((java.lang.Object)var50);
    boolean var54 = var5.equals((java.lang.Object)var24);
    model.Avaliacao var58 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    java.lang.String var59 = var58.getIdUsuario();
    var5.addAvaliacao(var58);
    java.lang.String var61 = var58.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var59.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var61.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test454");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ", "hi!");
    java.lang.String var21 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test455");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var19 = var5.getAvaliacaoPositiva();
    java.lang.String var20 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\n, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test456");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\n, hi!\n\nhi!, hi!, \nhi!\n, \n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", true);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test457");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var5.setNome("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test458");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!\n");
    java.lang.String var18 = var5.getNumeroRegistro();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var21 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test459");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var6 = var5.getTipo();
    java.lang.String var7 = var5.getNome();
    var5.addConvenio("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var10 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var13 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\n, "+ "'", var7.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var10.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test460");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var10 = var5.verificaParametros("hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!\n");
    int var11 = var5.getAvaliacaoNegativa();
    java.lang.String var12 = var5.getNome();
    java.lang.String var13 = var5.getConvenio();
    boolean var18 = var5.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ");
    int var19 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var12.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test461");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    int var14 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test462");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getConvenio();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var10 = var5.getAvaliacaoNegativa();
    java.lang.String var11 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test463");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getNome();
    var8.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var8.setEspecialidade("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var25 = var8.getEspecialidade();
    model.ProfissionalSaude var31 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getIdUsuario();
    var31.addAvaliacao(var35);
    var31.setNumeroRegistro("");
    boolean var44 = var31.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var45 = var31.getAvaliacaoPositiva();
    var31.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var31.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    var31.setTipo("hi!");
    boolean var52 = var8.equals((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test464");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getNome();
    boolean var25 = var8.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var8.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var8.setTipo(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test465");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var16 = var15.getNumero();
    var15.setCidade("hi!");
    java.lang.String var19 = var15.getCidade();
    var15.setBairro("hi!, hi!\n\nhi!, ");
    java.lang.String var22 = var15.getBairro();
    var15.setNumero("hi!");
    java.lang.String var25 = var15.toString();
    boolean var26 = var2.equals((java.lang.Object)var25);
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var22.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var25.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test466");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test467");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    java.lang.String var7 = var6.getBairro();
    var6.setEstado("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, "));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test468");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", false);
    boolean var4 = var3.isAvaliacao();
    boolean var5 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test469");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var14.getNome();
    java.lang.String var16 = var14.getNumeroRegistro();
    int var17 = var14.getAvaliacaoPositiva();
    var14.setTipo("hi!, hi!\nhi!\n, ");
    int var20 = var14.getAvaliacaoPositiva();
    var14.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var23 = var14.getConvenio();
    boolean var24 = var5.equals((java.lang.Object)var14);
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test470");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    model.Avaliacao var19 = new model.Avaliacao("", "hi!", false);
    java.lang.String var20 = var19.getCrm();
    boolean var21 = var5.equals((java.lang.Object)var19);
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    int var30 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test471");


    model.Usuario var2 = new model.Usuario(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\n\n, , \nhi!\n, ");

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test472");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    model.Usuario var15 = new model.Usuario("", "");
    java.lang.String var16 = var15.getIdentificacao();
    var15.setIdentificacao("hi!");
    var15.setIdentificacao("hi!");
    boolean var21 = var6.equals((java.lang.Object)"hi!");
    java.lang.String var22 = var6.getSala();
    java.lang.String var23 = var6.getNumero();
    java.lang.String var24 = var6.getSala();
    var6.setBairro("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var27 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test473");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getCidade();
    java.lang.String var11 = var6.getRua();
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    var17.setNumeroRegistro("");
    boolean var30 = var17.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var31 = var17.getAvaliacaoPositiva();
    var17.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var17.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    int var36 = var17.getAvaliacaoNegativa();
    boolean var37 = var6.equals((java.lang.Object)var17);
    model.Endereco var44 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var45 = var44.getNumero();
    var44.setRua("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var48 = var17.equals((java.lang.Object)"hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var52 = new model.Avaliacao("", "hi!", false);
    java.lang.String var53 = var52.getCrm();
    java.lang.String var54 = var52.getCrm();
    java.lang.String var55 = var52.getIdUsuario();
    var17.addAvaliacao(var52);
    var17.setEspecialidade("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    int var59 = var17.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var45.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test474");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    java.lang.String var17 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\n, "));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test475");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    boolean var4 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test476");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getConvenio();
    int var16 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var19 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test477");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var6.setCidade("hi!, hi!\n\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var6.getRua();
    java.lang.String var16 = var6.getNumero();
    java.lang.String var17 = var6.getNumero();
    java.lang.String var18 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var15.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "+ "'", var18.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test478");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ", "hi!, hi!\nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test479");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var26 = var5.verificaParametros("", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    var5.setNome(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var29 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var34 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var29.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var34.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test480");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getNome();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    java.lang.String var26 = var23.getNumero();
    var23.setNumero("");
    java.lang.String var29 = var23.getSala();
    var23.setNumero("hi!");
    java.lang.String var32 = var23.getBairro();
    model.Endereco var39 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var39.setCidade("");
    var39.setBairro("hi!");
    var39.setSala("hi!");
    java.lang.String var46 = var39.toString();
    boolean var47 = var23.equals((java.lang.Object)var46);
    boolean var48 = var5.equals((java.lang.Object)var23);
    java.lang.String var49 = var23.getSala();
    var23.setBairro("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var46.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test481");


    model.Usuario var2 = new model.Usuario("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    model.Avaliacao var7 = new model.Avaliacao("hi!, hi!\nhi!\n, hi!", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", true);
    boolean var8 = var2.equals((java.lang.Object)", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\n\n, "+ "'", var3.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test482");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.toString();
    java.lang.String var11 = var6.toString();
    var6.setEstado("hi!, hi!\nhi!\nhi!, ");
    var6.setSala("hi!");
    java.lang.String var16 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test483");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var9 = var6.getCidade();
    java.lang.String var10 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test484");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\n, \nhi!\n, ", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test485");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    model.Endereco var10 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var12 = var10.equals((java.lang.Object)10L);
    java.lang.String var13 = var10.getNumero();
    var10.setNumero("");
    java.lang.String var16 = var10.getSala();
    var10.setNumero("hi!");
    java.lang.String var19 = var10.getBairro();
    var10.setSala("hi!");
    java.lang.String var22 = var10.getRua();
    boolean var23 = var2.equals((java.lang.Object)var10);
    java.lang.String var24 = var2.getIdentificacao();
    java.lang.String var25 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, \nhi!\n, "+ "'", var25.equals("hi!, \nhi!\n, "));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test486");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test487");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    int var23 = var5.getAvaliacaoPositiva();
    model.Avaliacao var27 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", true);
    var5.addAvaliacao(var27);
    boolean var29 = var27.isAvaliacao();
    boolean var30 = var27.isAvaliacao();
    java.lang.String var31 = var27.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "+ "'", var31.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "));

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test488");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test489");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("hi!", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setNumeroRegistro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setRegistro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var24 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test490");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var20 = var5.getEspecialidade();
    var5.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var20.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test491");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var9 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, "));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test492");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!");
    var5.setNome("hi!\n");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    java.lang.String var26 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!\n"+ "'", var26.equals("hi!\n"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test493");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test494");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    java.lang.String var27 = var20.getTipo();
    int var28 = var20.getAvaliacaoPositiva();
    var20.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var31 = var5.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var32 = var5.getTipo();
    java.lang.String var33 = var5.getNumeroRegistro();
    java.lang.String var34 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var34.equals("hi!, hi!\nhi!\n, "));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test495");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, \nhi!\n, ");
    java.lang.String var15 = var5.getNome();
    int var16 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test496");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getIdUsuario();
    java.lang.String var8 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test497");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var11 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var15 = new model.Avaliacao("", "hi!", false);
    java.lang.String var16 = var15.getIdUsuario();
    var11.addAvaliacao(var15);
    var11.setNumeroRegistro("");
    var11.setConvenio("hi!, hi!\nhi!\nhi!, ");
    int var22 = var11.getAvaliacaoNegativa();
    boolean var23 = var2.equals((java.lang.Object)var22);
    var2.setNome("hi!, hi!\nhi!\n, ");
    var2.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var28 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var28.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test498");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test499");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test500");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var11 = var6.getRua();
    var6.setEstado("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

}
