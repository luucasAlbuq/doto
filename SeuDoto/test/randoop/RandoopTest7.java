package randoop;

import junit.framework.*;

public class RandoopTest7 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test1");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var6 = var5.getTipo();
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var16 = new model.Avaliacao("", "hi!", false);
    java.lang.String var17 = var16.getIdUsuario();
    var12.addAvaliacao(var16);
    int var19 = var12.getAvaliacaoPositiva();
    var12.addConvenio("hi!, hi!\nhi!\nhi!, ");
    boolean var22 = var5.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var6.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test2");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    var5.addAvaliacao(var24);
    java.lang.String var28 = var24.getCrm();
    java.lang.String var29 = var24.getCrm();
    java.lang.String var30 = var24.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test3");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", "hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", ", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test4");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ");

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test5");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test6");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    int var14 = var5.getAvaliacaoNegativa();
    int var15 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var15 == 0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test7");


    model.Usuario var2 = new model.Usuario("hi!", "hi!");
    java.lang.String var3 = var2.getNome();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test8");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var20 = var5.getAvaliacaoPositiva();
    java.lang.String var21 = var5.getConvenio();
    java.lang.String var22 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test9");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    var5.setRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test10");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ");

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test11");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getEstado();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var16 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var17 = var6.equals((java.lang.Object)"hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var8.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test12");


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
    java.lang.String var35 = var6.getNumero();
    var6.setBairro("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!");
    var6.setRua("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
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
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test13");


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
    var6.setBairro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
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

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test14");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    var6.setRua("");
    java.lang.String var25 = var6.getBairro();
    model.ProfissionalSaude var31 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getIdUsuario();
    var31.addAvaliacao(var35);
    var31.setNumeroRegistro("");
    java.lang.String var40 = var31.getConvenio();
    model.Avaliacao var44 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var31.addAvaliacao(var44);
    var31.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var48 = var6.equals((java.lang.Object)var31);
    model.Usuario var51 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var51.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var54 = var51.getNome();
    boolean var55 = var6.equals((java.lang.Object)var51);
    var6.setRua("hi!, hi!\nhi!\n, hi!");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var40.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var54.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test15");


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
    var12.setEstado(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
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

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test16");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!"+ "'", var15.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test17");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    int var14 = var5.getAvaliacaoNegativa();
    java.lang.String var15 = var5.getNumeroRegistro();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var24 = var23.getNome();
    java.lang.String var25 = var23.getNumeroRegistro();
    int var26 = var23.getAvaliacaoPositiva();
    var23.setTipo("hi!, hi!\nhi!\n, ");
    int var29 = var23.getAvaliacaoPositiva();
    var23.addConvenio("hi!, hi!\nhi!\n, ");
    int var32 = var23.getAvaliacaoPositiva();
    boolean var37 = var23.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var23.addConvenio("hi!");
    model.ProfissionalSaude var45 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var49 = new model.Avaliacao("", "hi!", false);
    java.lang.String var50 = var49.getIdUsuario();
    var45.addAvaliacao(var49);
    var45.setConvenio("hi!");
    java.lang.String var54 = var45.getTipo();
    model.ProfissionalSaude var60 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var64 = new model.Avaliacao("", "hi!", false);
    java.lang.String var65 = var64.getIdUsuario();
    var60.addAvaliacao(var64);
    var45.addAvaliacao(var64);
    var23.addAvaliacao(var64);
    boolean var69 = var64.isAvaliacao();
    var5.addAvaliacao(var64);
    java.lang.String var71 = var5.getNumeroRegistro();
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var71.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test18");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\n\n, ");
    var2.setNome("hi!, hi!\n\n, ");
    var2.setNome("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test19");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var18 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var18.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test20");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var15.setCidade("");
    java.lang.String var18 = var15.getSala();
    java.lang.String var19 = var15.getCidade();
    boolean var20 = var5.equals((java.lang.Object)var15);
    java.lang.String var21 = var5.getEspecialidade();
    int var22 = var5.getAvaliacaoPositiva();
    java.lang.String var23 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test21");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getEstado();
    java.lang.String var18 = var6.getBairro();
    java.lang.String var19 = var6.getEstado();
    var6.setRua("hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, "));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test23");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    var6.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, "));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test24");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getRua();
    var6.setCidade("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var9.equals("hi!, \nhi!\n, hi!"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test25");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    var2.setIdentificacao("hi!, hi!\n\nhi!, ");
    var2.setNome("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test26");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var6.setRua("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var17 = var16.getNome();
    java.lang.String var18 = var16.getNumeroRegistro();
    boolean var23 = var16.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, \nhi!\n, hi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var24 = var16.getEspecialidade();
    var16.setTipo("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    boolean var27 = var6.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test27");


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
    int var31 = var5.getAvaliacaoNegativa();
    boolean var36 = var5.verificaParametros("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    int var37 = var5.getAvaliacaoPositiva();
    
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
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test28");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test29");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    var5.setEspecialidade("");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test30");


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
    var5.setEspecialidade("hi!, \nhi!\n, ");
    java.lang.String var28 = var5.getEspecialidade();
    int var29 = var5.getAvaliacaoPositiva();
    model.Avaliacao var33 = new model.Avaliacao("", "hi!", false);
    java.lang.String var34 = var33.getCrm();
    java.lang.String var35 = var33.getCrm();
    java.lang.String var36 = var33.getCrm();
    var5.addAvaliacao(var33);
    int var38 = var5.getAvaliacaoNegativa();
    
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
    assertTrue("'" + var28 + "' != '" + "hi!, \nhi!\n, "+ "'", var28.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test31");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var14 = var5.getEspecialidade();
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setNome(", hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test32");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!\n");
    java.lang.String var18 = var5.getNumeroRegistro();
    int var19 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test33");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getBairro();
    var6.setEstado("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var21 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var21.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test34");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    boolean var13 = var5.equals((java.lang.Object)1.0d);
    var5.setNome("");
    java.lang.String var16 = var5.getTipo();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\n, "));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test35");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    int var14 = var5.getAvaliacaoNegativa();
    java.lang.String var15 = var5.getNumeroRegistro();
    model.ProfissionalSaude var21 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var25 = new model.Avaliacao("", "hi!", false);
    java.lang.String var26 = var25.getIdUsuario();
    var21.addAvaliacao(var25);
    var21.setTipo("hi!, \nhi!\n, ");
    var21.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var21.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var21.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    var21.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var38 = var21.getNumeroRegistro();
    boolean var39 = var5.equals((java.lang.Object)var38);
    int var40 = var5.getAvaliacaoPositiva();
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
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
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test36");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\n\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var6 = var5.getConvenio();
    java.lang.String var7 = var5.getConvenio();
    var5.setEspecialidade("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test37");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!\n");
    var5.addConvenio("hi!, hi!\n\n, , \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test38");


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
    var5.setEspecialidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var22 = var5.getAvaliacaoNegativa();
    var5.setTipo(", \nhi!\n, hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test39");


    model.Endereco var6 = new model.Endereco("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, \nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setEstado("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test40");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    boolean var7 = var2.equals((java.lang.Object)"hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    model.ProfissionalSaude var13 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var17 = new model.Avaliacao("", "hi!", false);
    java.lang.String var18 = var17.getIdUsuario();
    var13.addAvaliacao(var17);
    var13.setNumeroRegistro("");
    java.lang.String var22 = var13.getConvenio();
    model.Avaliacao var26 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var13.addAvaliacao(var26);
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var34 = var33.getNome();
    java.lang.String var35 = var33.getNumeroRegistro();
    int var36 = var33.getAvaliacaoPositiva();
    var33.setTipo("hi!, hi!\nhi!\n, ");
    int var39 = var33.getAvaliacaoPositiva();
    var33.addConvenio("hi!, hi!\nhi!\n, ");
    int var42 = var33.getAvaliacaoPositiva();
    boolean var47 = var33.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var33.addConvenio("hi!");
    model.ProfissionalSaude var55 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var59 = new model.Avaliacao("", "hi!", false);
    java.lang.String var60 = var59.getIdUsuario();
    var55.addAvaliacao(var59);
    var55.setConvenio("hi!");
    java.lang.String var64 = var55.getTipo();
    model.ProfissionalSaude var70 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var74 = new model.Avaliacao("", "hi!", false);
    java.lang.String var75 = var74.getIdUsuario();
    var70.addAvaliacao(var74);
    var55.addAvaliacao(var74);
    var33.addAvaliacao(var74);
    var13.addAvaliacao(var74);
    boolean var80 = var2.equals((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var22.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test41");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var6.getNumero();
    java.lang.String var14 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test42");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test43");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    var2.setIdentificacao("hi!, hi!\n\nhi!, ");
    model.ProfissionalSaude var15 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var15.getNome();
    java.lang.String var17 = var15.getNumeroRegistro();
    int var18 = var15.getAvaliacaoPositiva();
    var15.setTipo("hi!, hi!\nhi!\n, ");
    int var21 = var15.getAvaliacaoPositiva();
    var15.addConvenio("hi!, hi!\nhi!\n, ");
    var15.setTipo("");
    int var26 = var15.getAvaliacaoPositiva();
    java.lang.String var27 = var15.getEspecialidade();
    java.lang.String var28 = var15.getTipo();
    var15.setEspecialidade("");
    java.lang.String var31 = var15.getEspecialidade();
    boolean var32 = var2.equals((java.lang.Object)var31);
    java.lang.String var33 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test44");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, ", "");
    model.Endereco var9 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var10 = var9.getCidade();
    boolean var11 = var2.equals((java.lang.Object)var9);
    var9.setRua("hi!, \nhi!\n, ");
    var9.setRua("hi!, hi!\nhi!\nhi!, \nhi!");
    model.ProfissionalSaude var21 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var22 = var21.getNome();
    java.lang.String var23 = var21.getNumeroRegistro();
    java.lang.String var24 = var21.getTipo();
    java.lang.String var25 = var21.getTipo();
    var21.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var21.addConvenio("hi!, hi!\n\n, ");
    var21.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    int var32 = var21.getAvaliacaoNegativa();
    boolean var33 = var9.equals((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test45");


    model.Usuario var2 = new model.Usuario("", "hi!, hi!\nhi!\nhi!, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var9.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var9.getSala();
    var9.setCidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var15 = var2.equals((java.lang.Object)var9);
    java.lang.String var16 = var9.getEstado();
    java.lang.String var17 = var9.toString();
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    var23.setNumeroRegistro("");
    var23.setConvenio("hi!");
    boolean var38 = var23.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ", "hi!");
    boolean var39 = var9.equals((java.lang.Object)"hi!");
    java.lang.String var40 = var9.getCidade();
    java.lang.String var41 = var9.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var40.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\nhi!\n, "));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test46");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    var6.setSala("hi!");
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test47");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setConvenio("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test48");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.getNumero();
    java.lang.String var24 = var6.getEstado();
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    int var37 = var30.getAvaliacaoPositiva();
    var30.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var45 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var49 = new model.Avaliacao("", "hi!", false);
    java.lang.String var50 = var49.getIdUsuario();
    var45.addAvaliacao(var49);
    int var52 = var45.getAvaliacaoNegativa();
    var45.addConvenio("hi!");
    java.lang.String var55 = var45.getTipo();
    java.lang.String var56 = var45.getConvenio();
    boolean var57 = var30.equals((java.lang.Object)var45);
    boolean var62 = var30.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!", "");
    var30.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var65 = var30.getEspecialidade();
    boolean var66 = var6.equals((java.lang.Object)var65);
    java.lang.String var67 = var6.getEstado();
    
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
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var56.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test49");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, \n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test50");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", "hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test51");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test52");


    model.Usuario var2 = new model.Usuario("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    var2.setNome("hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, ");

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test53");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getConvenio();
    java.lang.String var16 = var5.getConvenio();
    boolean var21 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test54");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getNumero();
    var6.setSala("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test55");


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
    var6.setEstado("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var19.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test56");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    model.Usuario var13 = new model.Usuario("hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var14 = var13.getNome();
    boolean var15 = var6.equals((java.lang.Object)var14);
    var6.setSala("hi!");
    var6.setSala("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test57");


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
    java.lang.String var23 = var20.getIdUsuario();
    
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
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test58");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ");
    int var6 = var5.getAvaliacaoPositiva();
    int var7 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, hi!\nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test59");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var18 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var19 = var18.getNome();
    java.lang.String var20 = var18.getNumeroRegistro();
    int var21 = var18.getAvaliacaoPositiva();
    var18.setTipo("hi!, hi!\nhi!\n, ");
    int var24 = var18.getAvaliacaoPositiva();
    var18.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var27 = var18.getNumeroRegistro();
    java.lang.String var28 = var18.getTipo();
    java.lang.String var29 = var18.getEspecialidade();
    boolean var30 = var6.equals((java.lang.Object)var29);
    java.lang.String var31 = var6.getSala();
    java.lang.String var32 = var6.toString();
    var6.setNumero("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    java.lang.String var35 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
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
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test60");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("");
    int var22 = var5.getAvaliacaoNegativa();
    int var23 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test61");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setEspecialidade("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    int var13 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test62");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getSala();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var16 = var6.getNumero();
    java.lang.String var17 = var6.getBairro();
    java.lang.String var18 = var6.getNumero();
    java.lang.String var19 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test63");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getEstado();
    boolean var22 = var6.equals((java.lang.Object)var21);
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var25 = var6.getEstado();
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test64");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.getEstado();
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, "));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test65");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setSala("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var14 = var6.getEstado();
    java.lang.String var15 = var6.getSala();
    var6.setSala("hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test66");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    var5.setRegistro("hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getTipo();
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var25 = var24.getNome();
    java.lang.String var26 = var24.getNumeroRegistro();
    int var27 = var24.getAvaliacaoPositiva();
    var24.setTipo("hi!, hi!\nhi!\n, ");
    int var30 = var24.getAvaliacaoPositiva();
    var24.addConvenio("hi!, hi!\nhi!\n, ");
    var24.setNumeroRegistro("hi!, \nhi!\n, ");
    model.Avaliacao var38 = new model.Avaliacao("", "hi!", false);
    java.lang.String var39 = var38.getCrm();
    boolean var40 = var24.equals((java.lang.Object)var38);
    var5.addAvaliacao(var38);
    boolean var42 = var38.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test67");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test68");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test69");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test70");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test71");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    model.Usuario var17 = new model.Usuario("", "");
    java.lang.String var18 = var17.getIdentificacao();
    java.lang.String var19 = var17.getNome();
    boolean var20 = var2.equals((java.lang.Object)var17);
    var2.setNome("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test72");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setRua("hi!");
    java.lang.String var15 = var6.getEstado();
    java.lang.String var16 = var6.toString();
    java.lang.String var17 = var6.getCidade();
    java.lang.String var18 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test73");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var10 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var10.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test74");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test75");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.getBairro();
    var6.setNumero("hi!, hi!\nhi!\n, ");
    java.lang.String var26 = var6.getRua();
    var6.setEstado(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\n, ");
    java.lang.String var31 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test76");


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
    var5.addConvenio("hi!");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\n\n, ");
    int var31 = var5.getAvaliacaoPositiva();
    var5.setRegistro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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
    assertTrue(var31 == 0);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test77");


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
    var5.addConvenio("hi!");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var29 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var32 = var5.getNome();
    
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
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test78");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!");
    java.lang.String var6 = var5.getEspecialidade();
    java.lang.String var7 = var5.getEspecialidade();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test79");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getNome();
    var8.setEspecialidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var8.setRegistro("");
    int var25 = var8.getAvaliacaoNegativa();
    java.lang.String var26 = var8.getTipo();
    var8.setTipo("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test80");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var6.setCidade("hi!, hi!\n\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var6.getRua();
    java.lang.String var16 = var6.getNumero();
    java.lang.String var17 = var6.getNumero();
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    var23.setTipo("hi!, \nhi!\n, ");
    var23.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var38 = var23.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var23.setNome("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    boolean var41 = var6.equals((java.lang.Object)var23);
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var15.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test81");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!\n\nhi!, ");

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test82");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test83");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test84");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var10 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var14 = new model.Avaliacao("", "hi!", false);
    java.lang.String var15 = var14.getIdUsuario();
    var10.addAvaliacao(var14);
    int var17 = var10.getAvaliacaoPositiva();
    var10.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    var10.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var10.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var24 = var2.equals((java.lang.Object)var10);
    int var25 = var10.getAvaliacaoPositiva();
    var10.addConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test85");


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
    java.lang.String var24 = var6.getBairro();
    java.lang.String var25 = var6.getNumero();
    java.lang.String var26 = var6.getNumero();
    java.lang.String var27 = var6.getRua();
    
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
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test86");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    model.Endereco var18 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var19 = var18.getNumero();
    var18.setCidade("hi!");
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var30 = var28.equals((java.lang.Object)10L);
    java.lang.String var31 = var28.getNumero();
    boolean var32 = var18.equals((java.lang.Object)var31);
    var18.setBairro("");
    java.lang.String var35 = var18.getNumero();
    java.lang.String var36 = var18.getBairro();
    java.lang.String var37 = var18.getEstado();
    java.lang.String var38 = var18.getBairro();
    boolean var39 = var5.equals((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test87");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var6.setNumero("hi!");
    model.Usuario var16 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var17 = var16.getIdentificacao();
    boolean var18 = var6.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test88");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    java.lang.String var7 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test89");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    var6.setBairro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test90");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    java.lang.String var16 = var5.getNumeroRegistro();
    model.Endereco var23 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var24 = var23.getEstado();
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    int var37 = var30.getAvaliacaoNegativa();
    var30.addConvenio("hi!");
    java.lang.String var40 = var30.getTipo();
    java.lang.String var41 = var30.getTipo();
    boolean var42 = var23.equals((java.lang.Object)var41);
    model.Endereco var49 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var49.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var52 = var23.equals((java.lang.Object)var49);
    boolean var53 = var5.equals((java.lang.Object)var52);
    var5.addConvenio("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test91");


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
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test92");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    java.lang.String var16 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var19 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test93");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    java.lang.String var10 = var5.getTipo();
    var5.addConvenio("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    java.lang.String var23 = var19.getSala();
    java.lang.String var24 = var19.getEstado();
    var19.setRua("hi!, hi!\nhi!\n, ");
    java.lang.String var27 = var19.getSala();
    boolean var28 = var5.equals((java.lang.Object)var19);
    java.lang.String var29 = var19.getEstado();
    java.lang.String var30 = var19.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test94");


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
    var5.setEspecialidade("hi!");
    java.lang.String var30 = var5.getNome();
    model.Endereco var37 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var37.setCidade("");
    java.lang.String var40 = var37.getSala();
    var37.setCidade("");
    java.lang.String var43 = var37.getRua();
    var37.setRua("hi!");
    java.lang.String var46 = var37.getRua();
    java.lang.String var47 = var37.getCidade();
    boolean var48 = var5.equals((java.lang.Object)var37);
    
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
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test95");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.getCidade();
    java.lang.String var9 = var6.getSala();
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test96");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    java.lang.String var15 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var18 = var2.getNome();
    model.Usuario var21 = new model.Usuario("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    boolean var22 = var2.equals((java.lang.Object)"hi!");
    java.lang.String var23 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, \nhi!\n, "+ "'", var18.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test97");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test98");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    var6.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test99");


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
    var17.setNumeroRegistro("");
    java.lang.String var26 = var17.getConvenio();
    model.Avaliacao var30 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var17.addAvaliacao(var30);
    var17.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var38 = var17.verificaParametros("", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    var17.setNome(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var41 = var17.getNome();
    var17.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var17.setNome("hi!, hi!\nhi!\n, ");
    boolean var46 = var2.equals((java.lang.Object)var17);
    java.lang.String var47 = var17.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var41.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var47.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test100");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    var6.setEstado("hi!");
    java.lang.String var15 = var6.getBairro();
    java.lang.String var16 = var6.getCidade();
    var6.setBairro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test101");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("hi!");
    java.lang.String var15 = var6.getBairro();
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var23 = var22.getNumero();
    var22.setCidade("hi!");
    model.Endereco var32 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var34 = var32.equals((java.lang.Object)10L);
    java.lang.String var35 = var32.getNumero();
    boolean var36 = var22.equals((java.lang.Object)var35);
    java.lang.String var37 = var22.getRua();
    boolean var38 = var6.equals((java.lang.Object)var22);
    var22.setCidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test102");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    var5.setEspecialidade("");
    java.lang.String var17 = var5.getEspecialidade();
    model.Usuario var20 = new model.Usuario("hi!", "");
    java.lang.String var21 = var20.getIdentificacao();
    boolean var22 = var5.equals((java.lang.Object)var21);
    boolean var27 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test103");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var5.equals("hi!, hi!\n\nhi!, "));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test104");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var2.getNome();
    var2.setIdentificacao("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test105");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, ");

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test106");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var21 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test107");


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
    java.lang.String var30 = var28.getCrm();
    java.lang.String var31 = var28.getIdUsuario();
    boolean var32 = var28.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var31.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test108");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test109");


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
    var8.setRegistro("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test110");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test111");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    var15.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test112");


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
    java.lang.String var33 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    model.Avaliacao var39 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    boolean var40 = var39.isAvaliacao();
    boolean var41 = var39.isAvaliacao();
    var5.addAvaliacao(var39);
    
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
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test113");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    model.Endereco var17 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var18 = var17.getNumero();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var26 = var25.getNumero();
    var25.setCidade("hi!");
    model.Endereco var35 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var37 = var35.equals((java.lang.Object)10L);
    java.lang.String var38 = var35.getNumero();
    boolean var39 = var25.equals((java.lang.Object)var38);
    var25.setBairro("");
    java.lang.String var42 = var25.getBairro();
    var25.setNumero("hi!, hi!\nhi!\n, ");
    boolean var45 = var17.equals((java.lang.Object)var25);
    var25.setBairro("");
    boolean var48 = var6.equals((java.lang.Object)var25);
    var25.setSala("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var57 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var59 = var57.equals((java.lang.Object)10L);
    var57.setCidade("hi!, \nhi!\n, ");
    java.lang.String var62 = var57.getEstado();
    boolean var63 = var25.equals((java.lang.Object)var62);
    var25.setCidade("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test114");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", false);
    boolean var4 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test115");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var12 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test116");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setConvenio(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test117");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ");
    int var20 = var5.getAvaliacaoPositiva();
    java.lang.String var21 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test118");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var6 = var5.getAvaliacaoNegativa();
    int var7 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!");
    int var10 = var5.getAvaliacaoPositiva();
    model.Endereco var17 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var18 = var17.getNumero();
    var17.setCidade("hi!");
    java.lang.String var21 = var17.getCidade();
    java.lang.String var22 = var17.getRua();
    java.lang.String var23 = var17.toString();
    boolean var24 = var5.equals((java.lang.Object)var23);
    boolean var29 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    int var42 = var35.getAvaliacaoPositiva();
    var35.addConvenio("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var45 = var35.getNumeroRegistro();
    var35.setConvenio("hi!, hi!\n\n, , \nhi!\n, ");
    model.ProfissionalSaude var53 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var57 = new model.Avaliacao("", "hi!", false);
    java.lang.String var58 = var57.getIdUsuario();
    var53.addAvaliacao(var57);
    int var60 = var53.getAvaliacaoPositiva();
    var53.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    var53.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var53.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Avaliacao var70 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", true);
    java.lang.String var71 = var70.getCrm();
    java.lang.String var72 = var70.getIdUsuario();
    java.lang.String var73 = var70.getCrm();
    var53.addAvaliacao(var70);
    boolean var75 = var35.equals((java.lang.Object)var70);
    var5.addAvaliacao(var70);
    var5.setNome(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    boolean var83 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", ", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var71.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var73.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test119");


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
    var20.setConvenio("hi!, hi!\n\n, , \nhi!\n, ");
    model.ProfissionalSaude var40 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var41 = var40.getNome();
    java.lang.String var42 = var40.getNumeroRegistro();
    int var43 = var40.getAvaliacaoPositiva();
    var40.setTipo("hi!, hi!\nhi!\n, ");
    int var46 = var40.getAvaliacaoPositiva();
    java.lang.String var47 = var40.getNome();
    model.Endereco var54 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var56 = var54.equals((java.lang.Object)10L);
    java.lang.String var57 = var54.getNumero();
    var54.setNumero("");
    var54.setSala("hi!");
    boolean var62 = var40.equals((java.lang.Object)"hi!");
    var40.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var40.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var67 = var40.getNumeroRegistro();
    var40.setRegistro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    model.ProfissionalSaude var75 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var76 = var75.getNome();
    java.lang.String var77 = var75.getNumeroRegistro();
    int var78 = var75.getAvaliacaoPositiva();
    var75.setTipo("hi!, hi!\nhi!\n, ");
    int var81 = var75.getAvaliacaoPositiva();
    var75.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var84 = var75.getNome();
    var75.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var75.setNome("hi!, hi!\n\n, ");
    model.Avaliacao var92 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var93 = var92.isAvaliacao();
    var75.addAvaliacao(var92);
    var40.addAvaliacao(var92);
    var20.addAvaliacao(var92);
    
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
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var67.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!"+ "'", var77.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!"+ "'", var84.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == true);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test120");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test121");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    var5.setConvenio(", \nhi!\n, hi!");

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test122");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    var5.setRegistro("");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var22 = var5.getNome();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test123");


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
    java.lang.String var79 = var5.getNumeroRegistro();
    int var80 = var5.getAvaliacaoPositiva();
    
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
    assertTrue("'" + var79 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var79.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test124");


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
    java.lang.String var22 = var5.getEspecialidade();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ");
    int var25 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test125");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.getEstado();
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test126");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test127");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var11 = var6.getCidade();
    java.lang.String var12 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test128");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var2.setIdentificacao("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    model.Endereco var11 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var11.setCidade("");
    java.lang.String var14 = var11.getSala();
    var11.setCidade("");
    var11.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var26 = var25.getEstado();
    boolean var27 = var11.equals((java.lang.Object)var26);
    java.lang.String var28 = var11.getRua();
    var11.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    boolean var31 = var2.equals((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test129");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var6 = var5.getAvaliacaoNegativa();
    int var7 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!");
    var5.addConvenio("hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test130");


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
    java.lang.String var26 = var5.getTipo();
    var5.setConvenio("hi!, hi!\n\nhi!, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var31 = var5.getTipo();
    
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
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test131");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getSala();
    var6.setNumero("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var21 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test132");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, \nhi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    model.Usuario var9 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var9.setNome("hi!, hi!\nhi!\nhi!, ");
    var9.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getNumero();
    var20.setRua("hi!, \nhi!\n, ");
    java.lang.String var24 = var20.toString();
    var20.setEstado("");
    boolean var27 = var9.equals((java.lang.Object)var20);
    model.Endereco var34 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var35 = var34.getNumero();
    var34.setCidade("hi!");
    java.lang.String var38 = var34.getBairro();
    var34.setEstado("hi!, \nhi!\n, ");
    var34.setRua("");
    java.lang.String var43 = var34.toString();
    var34.setCidade("hi!, hi!\nhi!\nhi!, ");
    var34.setNumero("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var34.setSala("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var50 = var9.equals((java.lang.Object)"hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var51 = var6.equals((java.lang.Object)"hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var24.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var43.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test133");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    java.lang.String var18 = var8.getEspecialidade();
    var8.setNumeroRegistro("hi!, hi!\n\nhi!, ");
    java.lang.String var21 = var8.getConvenio();
    var8.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test134");


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
    java.lang.String var30 = var16.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test135");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("hi!");
    int var20 = var5.getAvaliacaoNegativa();
    int var21 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test136");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var24 = var5.getEspecialidade();
    var5.setTipo("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test137");


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
    model.ProfissionalSaude var32 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var33 = var32.getNome();
    var32.setEspecialidade("hi!, \nhi!\n, ");
    var32.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var38 = var32.getTipo();
    var32.setNumeroRegistro("hi!");
    boolean var41 = var5.equals((java.lang.Object)var32);
    model.ProfissionalSaude var47 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var48 = var47.getNome();
    java.lang.String var49 = var47.getNumeroRegistro();
    int var50 = var47.getAvaliacaoPositiva();
    var47.setTipo("hi!, hi!\nhi!\n, ");
    int var53 = var47.getAvaliacaoPositiva();
    var47.addConvenio("hi!, hi!\nhi!\n, ");
    var47.setTipo("");
    int var58 = var47.getAvaliacaoPositiva();
    java.lang.String var59 = var47.getEspecialidade();
    java.lang.String var60 = var47.getTipo();
    var47.setEspecialidade("");
    java.lang.String var63 = var47.getEspecialidade();
    var47.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var66 = var47.getTipo();
    boolean var67 = var32.equals((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test138");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", true);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test139");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test140");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test141");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getConvenio();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test142");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var17 = var15.equals((java.lang.Object)10L);
    var15.setCidade("");
    var15.setBairro("");
    var15.setCidade("hi!");
    var15.setEstado("");
    java.lang.String var26 = var15.getSala();
    java.lang.String var27 = var15.getBairro();
    var15.setNumero("");
    java.lang.String var30 = var15.getSala();
    boolean var31 = var2.equals((java.lang.Object)var15);
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test143");


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
    java.lang.String var24 = var6.getNumero();
    java.lang.String var25 = var6.getEstado();
    
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
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test144");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!");
    var2.setNome(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var7.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test145");


    model.Usuario var2 = new model.Usuario("hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ");

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test146");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test147");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test148");


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
    java.lang.String var35 = var6.getSala();
    
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

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test149");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var21 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var22 = var21.getNome();
    var21.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var31 = var30.getNome();
    java.lang.String var32 = var30.getNumeroRegistro();
    int var33 = var30.getAvaliacaoPositiva();
    var30.setTipo("hi!, hi!\nhi!\n, ");
    int var36 = var30.getAvaliacaoPositiva();
    var30.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var39 = var30.getConvenio();
    boolean var40 = var21.equals((java.lang.Object)var30);
    boolean var41 = var5.equals((java.lang.Object)var40);
    java.lang.String var42 = var5.getNome();
    var5.setTipo(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var39.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test150");


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
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var37 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var41 = new model.Avaliacao("", "hi!", false);
    java.lang.String var42 = var41.getIdUsuario();
    var37.addAvaliacao(var41);
    var37.setTipo("hi!, \nhi!\n, ");
    var37.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var49 = var37.equals((java.lang.Object)1.0f);
    var37.setRegistro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var55 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var37.addAvaliacao(var55);
    java.lang.String var57 = var55.getIdUsuario();
    var5.addAvaliacao(var55);
    java.lang.String var59 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var57.equals("hi!, \nhi!\n, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var59.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test151");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test152");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", true);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test153");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getNumeroRegistro();
    java.lang.String var12 = var5.getNumeroRegistro();
    model.Endereco var19 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var19.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var19.setBairro("hi!, hi!\n\nhi!, ");
    boolean var24 = var5.equals((java.lang.Object)"hi!, hi!\n\nhi!, ");
    java.lang.String var25 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test154");


    model.Endereco var6 = new model.Endereco(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test155");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    boolean var37 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \n", ", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!, hi!\nhi!\n, \nhi!\n, ");
    
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
    assertTrue(var37 == true);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test156");


    model.Endereco var6 = new model.Endereco("", "", "", "", "hi!", "");
    model.Usuario var9 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var15 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var19 = new model.Avaliacao("", "hi!", false);
    java.lang.String var20 = var19.getIdUsuario();
    var15.addAvaliacao(var19);
    var15.setConvenio("hi!");
    boolean var24 = var9.equals((java.lang.Object)var15);
    java.lang.String var25 = var15.getEspecialidade();
    java.lang.String var26 = var15.getTipo();
    boolean var27 = var6.equals((java.lang.Object)var15);
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var30 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test157");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.toString();
    var6.setCidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var6.getEstado();
    var6.setRua("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test158");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test159");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, ");

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test160");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test161");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", \nhi!\n, hi!", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test162");


    model.Usuario var2 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\n\nhi!, ");
    var2.setIdentificacao("");
    var2.setNome("hi!, hi!\n\n, ");
    java.lang.String var11 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\n, "+ "'", var11.equals("hi!, hi!\n\n, "));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test163");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test164");


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
    var14.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var14.setRegistro("hi!, \nhi!\n, ");
    java.lang.String var29 = var14.getConvenio();
    var14.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var14.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var34 = var14.getTipo();
    var14.setRegistro("hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, ");
    
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
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var29.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var34.equals("hi!, hi!\nhi!\n, "));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test165");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getConvenio();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
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

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test166");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test167");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var2.getNome();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\n\n, ");
    var2.setNome("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var16 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test168");


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
    var20.setNumeroRegistro("hi!, hi!, hi!\nhi!\n, \nhi!\n, ");
    
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

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test169");


    model.Endereco var6 = new model.Endereco("hi!", "", "hi!", "", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    model.Endereco var13 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var14 = var13.getNumero();
    var13.setCidade("hi!");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    java.lang.String var26 = var23.getNumero();
    boolean var27 = var13.equals((java.lang.Object)var26);
    var13.setBairro("");
    java.lang.String var30 = var13.getNumero();
    java.lang.String var31 = var13.getBairro();
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getCrm();
    boolean var37 = var35.isAvaliacao();
    java.lang.String var38 = var35.getIdUsuario();
    boolean var39 = var13.equals((java.lang.Object)var35);
    boolean var40 = var6.equals((java.lang.Object)var13);
    model.Endereco var47 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var47.setCidade("");
    var47.setBairro("hi!");
    var47.setSala("hi!");
    java.lang.String var54 = var47.getBairro();
    boolean var55 = var6.equals((java.lang.Object)var47);
    var6.setBairro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test170");


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
    java.lang.String var32 = var6.getEstado();
    java.lang.String var33 = var6.getNumero();
    java.lang.String var34 = var6.getSala();
    var6.setBairro("hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test171");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoPositiva();
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getTipo();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\n, "));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test172");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var5.getNumeroRegistro();
    int var16 = var5.getAvaliacaoPositiva();
    int var17 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test173");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    java.lang.String var15 = var6.toString();
    var6.setBairro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var18 = var6.getCidade();
    var6.setSala(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    java.lang.String var21 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test174");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!");
    java.lang.String var14 = var6.getNumero();
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getNumero();
    java.lang.String var17 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test175");


    model.Usuario var2 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var5 = var2.getIdentificacao();
    java.lang.String var6 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, "+ "'", var5.equals("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test176");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var6.toString();
    java.lang.String var14 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var17 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var13.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test177");


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
    java.lang.String var51 = var27.getBairro();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test178");


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
    var5.addConvenio("hi!");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var35 = var5.verificaParametros(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
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
    assertTrue(var35 == true);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test179");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var20 = var5.getEspecialidade();
    var5.setConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test180");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    boolean var25 = var23.isAvaliacao();
    var8.addAvaliacao(var23);
    boolean var31 = var8.verificaParametros("", "hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!");
    var8.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var8.setConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var8.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test181");


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
    var5.setTipo(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var28 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var28.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test182");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getIdUsuario();
    boolean var6 = var3.isAvaliacao();
    boolean var7 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var5.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test183");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var21 = var6.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var24 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test184");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    java.lang.String var10 = var6.getNumero();
    var6.setBairro("hi!");
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var13.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test185");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var13 = var12.getCrm();
    boolean var14 = var2.equals((java.lang.Object)var13);
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    var20.setConvenio("hi!");
    java.lang.String var29 = var20.getTipo();
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    var20.addAvaliacao(var39);
    var20.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    boolean var45 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\n, ");
    java.lang.String var46 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, \nhi!\n, "+ "'", var46.equals("hi!, \nhi!\n, "));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test186");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var7 = var2.getNome();
    var2.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var15 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var15.getNome();
    java.lang.String var17 = var15.getNumeroRegistro();
    int var18 = var15.getAvaliacaoPositiva();
    var15.setTipo("hi!, hi!\nhi!\n, ");
    int var21 = var15.getAvaliacaoPositiva();
    java.lang.String var22 = var15.getNome();
    model.Endereco var29 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var31 = var29.equals((java.lang.Object)10L);
    java.lang.String var32 = var29.getNumero();
    var29.setNumero("");
    var29.setSala("hi!");
    boolean var37 = var15.equals((java.lang.Object)"hi!");
    var15.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var45 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var49 = new model.Avaliacao("", "hi!", false);
    java.lang.String var50 = var49.getIdUsuario();
    var45.addAvaliacao(var49);
    var15.addAvaliacao(var49);
    int var53 = var15.getAvaliacaoNegativa();
    var15.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var56 = var15.getNome();
    java.lang.String var57 = var15.getNumeroRegistro();
    boolean var58 = var2.equals((java.lang.Object)var57);
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var61 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var57.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var61.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test187");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.toString();
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var23 = var22.getNumero();
    model.Endereco var30 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var31 = var30.getNumero();
    var30.setCidade("hi!");
    model.Endereco var40 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var42 = var40.equals((java.lang.Object)10L);
    java.lang.String var43 = var40.getNumero();
    boolean var44 = var30.equals((java.lang.Object)var43);
    var30.setBairro("");
    java.lang.String var47 = var30.getBairro();
    var30.setNumero("hi!, hi!\nhi!\n, ");
    boolean var50 = var22.equals((java.lang.Object)var30);
    var22.setNumero("");
    boolean var53 = var6.equals((java.lang.Object)"");
    var6.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var58 = var6.getRua();
    var6.setEstado("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var15.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test188");


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
    var2.setIdentificacao("hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var41 = var2.getNome();
    
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
    assertTrue("'" + var41 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var41.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test189");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoPositiva();
    int var16 = var5.getAvaliacaoNegativa();
    boolean var21 = var5.verificaParametros("hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    java.lang.String var22 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test190");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var15.setCidade("");
    java.lang.String var18 = var15.getSala();
    java.lang.String var19 = var15.getCidade();
    boolean var20 = var5.equals((java.lang.Object)var15);
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var31 = var5.verificaParametros(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test191");


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
    java.lang.String var20 = var5.getTipo();
    
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
    assertTrue("'" + var20 + "' != '" + "hi!, \nhi!\n, "+ "'", var20.equals("hi!, \nhi!\n, "));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test192");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.toString();
    java.lang.String var14 = var6.getEstado();
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test193");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getConvenio();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test194");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getIdUsuario();
    java.lang.String var7 = var3.getCrm();
    boolean var8 = var3.isAvaliacao();
    boolean var9 = var3.isAvaliacao();
    java.lang.String var10 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, "));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test195");


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
    model.Usuario var26 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var27 = var26.getNome();
    var26.setNome("hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    var35.setNumeroRegistro("");
    var35.setConvenio("hi!, hi!\nhi!\nhi!, ");
    int var46 = var35.getAvaliacaoNegativa();
    boolean var47 = var26.equals((java.lang.Object)var46);
    var26.setIdentificacao(", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var50 = var2.equals((java.lang.Object)", hi!\n\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, \nhi!\n, "+ "'", var27.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test196");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.getSala();
    java.lang.String var12 = var6.getRua();
    java.lang.String var13 = var6.toString();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test197");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    model.Endereco var13 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var14 = var13.getNumero();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.getEstado();
    var13.setEstado("hi!, hi!\nhi!\n, ");
    java.lang.String var19 = var13.getBairro();
    java.lang.String var20 = var13.getNumero();
    boolean var21 = var6.equals((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test198");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, ");
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var16 = new model.Avaliacao("", "hi!", false);
    java.lang.String var17 = var16.getIdUsuario();
    var12.addAvaliacao(var16);
    int var19 = var12.getAvaliacaoNegativa();
    boolean var24 = var12.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var12.setNome("");
    model.Avaliacao var30 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    var12.addAvaliacao(var30);
    model.Avaliacao var35 = new model.Avaliacao("hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    var12.addAvaliacao(var35);
    boolean var37 = var6.equals((java.lang.Object)var12);
    java.lang.String var38 = var6.getBairro();
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var38.equals("hi!, hi!\nhi!\n, "));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test199");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getCidade();
    var6.setCidade("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test200");


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
    java.lang.String var31 = var5.getTipo();
    int var32 = var5.getAvaliacaoPositiva();
    
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
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var31.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test201");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setTipo("");
    var5.setRegistro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getEspecialidade();
    boolean var23 = var5.verificaParametros("hi!, hi!\n\n, , \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var24 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test202");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test203");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test204");


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
    var5.addConvenio("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!\n\nhi!, ");
    var5.setNome("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
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

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test205");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getRua();
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var12 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test206");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test207");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var11 = var6.getBairro();
    var6.setSala("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var6.setNumero("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var11.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test208");


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
    model.Avaliacao var34 = new model.Avaliacao("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    boolean var35 = var34.isAvaliacao();
    java.lang.String var36 = var34.getCrm();
    var11.addAvaliacao(var34);
    java.lang.String var38 = var34.getIdUsuario();
    
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
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var38.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test209");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\n\nhi!, ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test210");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var15.setCidade("");
    java.lang.String var18 = var15.getSala();
    java.lang.String var19 = var15.getCidade();
    boolean var20 = var5.equals((java.lang.Object)var15);
    java.lang.String var21 = var5.getEspecialidade();
    java.lang.String var22 = var5.getNome();
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var28.setTipo("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var31 = var28.getConvenio();
    java.lang.String var32 = var28.getNumeroRegistro();
    java.lang.String var33 = var28.getNumeroRegistro();
    model.Usuario var36 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var43 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var43.setCidade("");
    java.lang.String var46 = var43.getSala();
    var43.setCidade("");
    var43.setCidade("hi!, hi!\nhi!\nhi!, ");
    var43.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    boolean var53 = var36.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var59 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var60 = var59.getNome();
    java.lang.String var61 = var59.getNumeroRegistro();
    int var62 = var59.getAvaliacaoPositiva();
    model.Endereco var69 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var69.setCidade("");
    java.lang.String var72 = var69.getSala();
    java.lang.String var73 = var69.getCidade();
    boolean var74 = var59.equals((java.lang.Object)var69);
    java.lang.String var75 = var69.getRua();
    boolean var76 = var36.equals((java.lang.Object)var75);
    java.lang.String var77 = var36.getIdentificacao();
    model.Usuario var80 = new model.Usuario("", "");
    java.lang.String var81 = var80.getIdentificacao();
    var80.setNome("hi!");
    java.lang.String var84 = var80.getIdentificacao();
    var80.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var87 = var80.getIdentificacao();
    boolean var88 = var36.equals((java.lang.Object)var87);
    var36.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    boolean var91 = var28.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    boolean var92 = var5.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var93 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var31.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var32.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var33.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var77.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + ""+ "'", var81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + ""+ "'", var84.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + ""+ "'", var87.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "hi!"+ "'", var93.equals("hi!"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test211");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test212");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.toString();
    java.lang.String var11 = var6.toString();
    var6.setEstado("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var19.setNumeroRegistro("hi!, hi!\n\n, ");
    model.ProfissionalSaude var27 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var28 = var27.getNome();
    java.lang.String var29 = var27.getNumeroRegistro();
    int var30 = var27.getAvaliacaoPositiva();
    var27.setTipo("hi!, hi!\nhi!\n, ");
    int var33 = var27.getAvaliacaoPositiva();
    java.lang.String var34 = var27.getNome();
    model.Endereco var41 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var43 = var41.equals((java.lang.Object)10L);
    java.lang.String var44 = var41.getNumero();
    var41.setNumero("");
    var41.setSala("hi!");
    boolean var49 = var27.equals((java.lang.Object)"hi!");
    var27.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var57 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var61 = new model.Avaliacao("", "hi!", false);
    java.lang.String var62 = var61.getIdUsuario();
    var57.addAvaliacao(var61);
    var27.addAvaliacao(var61);
    java.lang.String var65 = var61.getIdUsuario();
    var19.addAvaliacao(var61);
    boolean var67 = var6.equals((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test213");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test214");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test215");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test216");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, ");

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test217");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    boolean var25 = var23.isAvaliacao();
    var8.addAvaliacao(var23);
    boolean var31 = var8.verificaParametros("", "hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!");
    model.Usuario var34 = new model.Usuario("", "");
    java.lang.String var35 = var34.getIdentificacao();
    var34.setIdentificacao("hi!");
    java.lang.String var38 = var34.getNome();
    var34.setNome("hi!");
    model.ProfissionalSaude var46 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var50 = new model.Avaliacao("", "hi!", false);
    java.lang.String var51 = var50.getIdUsuario();
    var46.addAvaliacao(var50);
    java.lang.String var53 = var50.getIdUsuario();
    boolean var54 = var34.equals((java.lang.Object)var50);
    java.lang.String var55 = var50.getIdUsuario();
    boolean var56 = var50.isAvaliacao();
    java.lang.String var57 = var50.getIdUsuario();
    var8.addAvaliacao(var50);
    java.lang.String var59 = var50.getCrm();
    java.lang.String var60 = var50.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test218");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getBairro();
    java.lang.String var12 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test219");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test220");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var12 = var6.getEstado();
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getBairro();
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var21 = var20.getNome();
    java.lang.String var22 = var20.getNumeroRegistro();
    int var23 = var20.getAvaliacaoPositiva();
    var20.setTipo("hi!, hi!\nhi!\n, ");
    int var26 = var20.getAvaliacaoPositiva();
    java.lang.String var27 = var20.getNome();
    model.Endereco var34 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var36 = var34.equals((java.lang.Object)10L);
    java.lang.String var37 = var34.getNumero();
    var34.setNumero("");
    var34.setSala("hi!");
    boolean var42 = var20.equals((java.lang.Object)"hi!");
    var20.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var50 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var54 = new model.Avaliacao("", "hi!", false);
    java.lang.String var55 = var54.getIdUsuario();
    var50.addAvaliacao(var54);
    var20.addAvaliacao(var54);
    java.lang.String var58 = var20.getNumeroRegistro();
    java.lang.String var59 = var20.getNome();
    var20.setNumeroRegistro("");
    var20.setNome("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var20.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    boolean var66 = var6.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var58.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test221");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    model.Avaliacao var22 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var5.addAvaliacao(var22);
    int var24 = var5.getAvaliacaoNegativa();
    java.lang.String var25 = var5.getNome();
    
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
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test222");


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
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var53 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var53 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var53.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test223");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test224");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!");
    java.lang.String var14 = var6.getNumero();
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getNumero();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test225");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var19 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var19.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test226");


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
    var5.addConvenio("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test227");


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
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    
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

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test228");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var6.toString();
    java.lang.String var14 = var6.getRua();
    java.lang.String var15 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var13.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test229");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test230");


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
    java.lang.String var24 = var5.getTipo();
    java.lang.String var25 = var5.getNumeroRegistro();
    java.lang.String var26 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, "+ "'", var24.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test231");


    model.Endereco var6 = new model.Endereco(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test232");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    boolean var16 = var5.verificaParametros(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \n");
    int var17 = var5.getAvaliacaoPositiva();
    java.lang.String var18 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test233");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, ", "", true);
    java.lang.String var4 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var4.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test234");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var17 = var6.getRua();
    java.lang.String var18 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var17.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, \n, \nhi!, hi!\n\nhi!, \n, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, \n, \nhi!, hi!\n\nhi!, \n, "));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test235");


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
    java.lang.String var51 = var40.toString();
    
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
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\nhi!\n, hi!"+ "'", var51.equals("hi!, hi!\nhi!\n, hi!"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test236");


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
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    
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

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test237");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test238");


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
    var6.setRua("hi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var26 = var6.getCidade();
    var6.setEstado("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var29 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var26.equals("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "+ "'", var29.equals("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test239");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var7 = var6.getEstado();
    var6.setNumero("hi!, hi!\n\nhi!, ");
    var6.setRua("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test240");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, ");

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test241");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.getSala();
    java.lang.String var14 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test242");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    var6.setEstado("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var19 = var6.getSala();
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var26 = var25.getAvaliacaoNegativa();
    int var27 = var25.getAvaliacaoPositiva();
    var25.setTipo("hi!");
    var25.addConvenio("hi!");
    var25.setNumeroRegistro(", hi!\n\nhi!, ");
    boolean var34 = var6.equals((java.lang.Object)", hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test243");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.getCidade();
    java.lang.String var9 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test244");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ", true);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test245");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test246");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!\n", "hi!\n", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    var5.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var10 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\n"+ "'", var10.equals("hi!\n"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test247");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var19 = var5.getNome();
    java.lang.String var20 = var5.getNome();
    var5.setNumeroRegistro(", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test248");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    java.lang.String var11 = var6.getBairro();
    java.lang.String var12 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test249");


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
    var14.setNumeroRegistro("hi!, \nhi!\n, ");
    java.lang.String var27 = var14.getTipo();
    java.lang.String var28 = var14.getNome();
    var14.setTipo("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var31 = var14.getTipo();
    var14.setConvenio("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var31.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test250");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var8.getNome();
    java.lang.String var10 = var8.getNumeroRegistro();
    int var11 = var8.getAvaliacaoPositiva();
    var8.setTipo("hi!, hi!\nhi!\n, ");
    int var14 = var8.getAvaliacaoPositiva();
    var8.addConvenio("hi!, hi!\nhi!\n, ");
    var8.setNumeroRegistro("hi!, \nhi!\n, ");
    java.lang.String var19 = var8.getConvenio();
    java.lang.String var20 = var8.getNome();
    boolean var25 = var8.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    boolean var26 = var2.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test251");


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
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    java.lang.String var30 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var30.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test252");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var19 = var5.getEspecialidade();
    java.lang.String var20 = var5.getEspecialidade();
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var29 = var27.equals((java.lang.Object)10L);
    java.lang.String var30 = var27.getNumero();
    var27.setNumero("");
    java.lang.String var33 = var27.getSala();
    boolean var34 = var5.equals((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test253");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var12 = var6.getNumero();
    model.Usuario var15 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var21 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var25 = new model.Avaliacao("", "hi!", false);
    java.lang.String var26 = var25.getIdUsuario();
    var21.addAvaliacao(var25);
    var21.setConvenio("hi!");
    boolean var30 = var15.equals((java.lang.Object)var21);
    var21.addConvenio("");
    var21.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var21.setConvenio("hi!, hi!\nhi!\n, hi!");
    boolean var37 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\n, hi!");
    java.lang.String var38 = var6.getBairro();
    java.lang.String var39 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, \nhi!\n, "+ "'", var39.equals("hi!, \nhi!\n, "));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test254");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    model.Endereco var12 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var13 = var12.getNumero();
    var12.setCidade("hi!");
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var24 = var22.equals((java.lang.Object)10L);
    java.lang.String var25 = var22.getNumero();
    boolean var26 = var12.equals((java.lang.Object)var25);
    var12.setBairro("");
    var12.setRua("");
    java.lang.String var31 = var12.getBairro();
    model.ProfissionalSaude var37 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var41 = new model.Avaliacao("", "hi!", false);
    java.lang.String var42 = var41.getIdUsuario();
    var37.addAvaliacao(var41);
    var37.setNumeroRegistro("");
    java.lang.String var46 = var37.getConvenio();
    model.Avaliacao var50 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var37.addAvaliacao(var50);
    var37.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var54 = var12.equals((java.lang.Object)var37);
    var37.setTipo("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ");
    boolean var57 = var5.equals((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var46.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test255");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setEspecialidade("hi!");
    int var21 = var5.getAvaliacaoPositiva();
    
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
    assertTrue(var21 == 0);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test256");


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
    java.lang.String var23 = var5.getTipo();
    java.lang.String var24 = var5.getTipo();
    java.lang.String var25 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, "+ "'", var24.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var25.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test257");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test258");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setConvenio(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test259");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ");
    int var20 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test260");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ", false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test261");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var10 = var9.getNumero();
    var9.setCidade("hi!");
    java.lang.String var13 = var9.getBairro();
    var9.setEstado("hi!, \nhi!\n, ");
    var9.setRua("");
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var25 = var24.getNumero();
    var24.setCidade("hi!");
    java.lang.String var28 = var24.getRua();
    java.lang.String var29 = var24.getSala();
    boolean var30 = var9.equals((java.lang.Object)var29);
    var9.setCidade("hi!, \nhi!\n, ");
    java.lang.String var33 = var9.getRua();
    boolean var34 = var2.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test262");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test263");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getRua();
    java.lang.String var12 = var6.getCidade();
    var6.setEstado(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var21 = var20.getNome();
    java.lang.String var22 = var20.getNumeroRegistro();
    int var23 = var20.getAvaliacaoPositiva();
    var20.setTipo("hi!, hi!\nhi!\n, ");
    int var26 = var20.getAvaliacaoPositiva();
    java.lang.String var27 = var20.getNome();
    var20.setEspecialidade("hi!, \nhi!\n, ");
    var20.setEspecialidade("hi!\n");
    var20.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var20.setConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    model.Endereco var42 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var43 = var42.getNumero();
    model.Endereco var50 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var51 = var50.getNumero();
    var50.setCidade("hi!");
    model.Endereco var60 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var62 = var60.equals((java.lang.Object)10L);
    java.lang.String var63 = var60.getNumero();
    boolean var64 = var50.equals((java.lang.Object)var63);
    var50.setBairro("");
    java.lang.String var67 = var50.getBairro();
    var50.setNumero("hi!, hi!\nhi!\n, ");
    boolean var70 = var42.equals((java.lang.Object)var50);
    java.lang.String var71 = var42.getNumero();
    var42.setRua("hi!, \nhi!\n, ");
    var42.setSala("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var79 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var80 = var79.getCrm();
    java.lang.String var81 = var79.getCrm();
    java.lang.String var82 = var79.getIdUsuario();
    boolean var83 = var42.equals((java.lang.Object)var79);
    java.lang.String var84 = var79.getCrm();
    java.lang.String var85 = var79.getCrm();
    var20.addAvaliacao(var79);
    boolean var87 = var6.equals((java.lang.Object)var20);
    java.lang.String var88 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!, \nhi!\n, "+ "'", var80.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!, \nhi!\n, "+ "'", var81.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var82.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!, \nhi!\n, "+ "'", var84.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!, \nhi!\n, "+ "'", var85.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + ""+ "'", var88.equals(""));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test264");


    model.Endereco var6 = new model.Endereco("hi!", "", "hi!", "", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    model.Endereco var13 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var14 = var13.getNumero();
    var13.setCidade("hi!");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    java.lang.String var26 = var23.getNumero();
    boolean var27 = var13.equals((java.lang.Object)var26);
    var13.setBairro("");
    java.lang.String var30 = var13.getNumero();
    java.lang.String var31 = var13.getBairro();
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getCrm();
    boolean var37 = var35.isAvaliacao();
    java.lang.String var38 = var35.getIdUsuario();
    boolean var39 = var13.equals((java.lang.Object)var35);
    boolean var40 = var6.equals((java.lang.Object)var13);
    var6.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test265");


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
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var48 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var52 = new model.Avaliacao("", "hi!", false);
    java.lang.String var53 = var52.getIdUsuario();
    var48.addAvaliacao(var52);
    var48.setNumeroRegistro("");
    boolean var61 = var48.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var62 = var48.getAvaliacaoPositiva();
    var48.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var48.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    int var67 = var48.getAvaliacaoNegativa();
    var48.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var48.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var72 = var5.equals((java.lang.Object)var48);
    
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
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test266");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.getNumero();
    java.lang.String var24 = var6.getCidade();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var6.setSala("hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test267");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", ", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test268");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test269");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    var8.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var8.setConvenio("hi!, hi!\nhi!\nhi!, \n");
    model.Endereco var30 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var32 = var30.equals((java.lang.Object)10L);
    java.lang.String var33 = var30.getNumero();
    var30.setNumero("");
    java.lang.String var36 = var30.getSala();
    var30.setNumero("");
    model.Usuario var41 = new model.Usuario("hi!", "");
    java.lang.String var42 = var41.getNome();
    boolean var43 = var30.equals((java.lang.Object)var42);
    java.lang.String var44 = var30.getNumero();
    boolean var45 = var8.equals((java.lang.Object)var30);
    var30.setCidade("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test270");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getRua();
    model.ProfissionalSaude var13 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var17 = new model.Avaliacao("", "hi!", false);
    java.lang.String var18 = var17.getIdUsuario();
    var13.addAvaliacao(var17);
    int var20 = var13.getAvaliacaoPositiva();
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getCrm();
    java.lang.String var26 = var24.getCrm();
    java.lang.String var27 = var24.getCrm();
    var13.addAvaliacao(var24);
    int var29 = var13.getAvaliacaoPositiva();
    boolean var30 = var6.equals((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var7.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test271");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var23 = var22.getNome();
    java.lang.String var24 = var22.getNumeroRegistro();
    int var25 = var22.getAvaliacaoPositiva();
    var22.setTipo("hi!, hi!\nhi!\n, ");
    int var28 = var22.getAvaliacaoPositiva();
    var22.addConvenio("hi!, hi!\nhi!\n, ");
    var22.setNumeroRegistro("hi!, \nhi!\n, ");
    var22.setRegistro("hi!, hi!\nhi!\n, ");
    java.lang.String var35 = var22.getNome();
    boolean var36 = var6.equals((java.lang.Object)var22);
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    
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
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test272");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test273");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test274");


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
    int var20 = var5.getAvaliacaoPositiva();
    int var21 = var5.getAvaliacaoPositiva();
    
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
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test275");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test276");


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
    boolean var34 = var5.verificaParametros("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var38 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    boolean var39 = var38.isAvaliacao();
    var5.addAvaliacao(var38);
    java.lang.String var41 = var38.getCrm();
    
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
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\nhi!\n, "));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test277");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var25 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test278");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    java.lang.String var9 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var12 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test279");


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
    int var25 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var30 = var5.getNome();
    
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
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var30.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test280");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    var6.setSala("hi!");
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var20 = var6.getRua();
    java.lang.String var21 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test281");


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
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var51 = var5.getNome();
    int var52 = var5.getAvaliacaoPositiva();
    java.lang.String var53 = var5.getConvenio();
    
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
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var51.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var53.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test282");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    model.Endereco var13 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var14 = var13.getNumero();
    var13.setRua("hi!, \nhi!\n, ");
    java.lang.String var17 = var13.toString();
    var13.setEstado("");
    boolean var20 = var2.equals((java.lang.Object)var13);
    var13.setCidade("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var23 = var13.getSala();
    var13.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test283");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    boolean var24 = var5.verificaParametros("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test284");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNumeroRegistro();
    java.lang.String var7 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test285");


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
    var6.setRua("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
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

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test286");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test287");


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
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    var2.setNome("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var34 = var2.equals((java.lang.Object)"hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ");
    java.lang.String var35 = var2.getIdentificacao();
    
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
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , "+ "'", var35.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , "));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test288");


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
    java.lang.String var43 = var39.getIdUsuario();
    boolean var44 = var39.isAvaliacao();
    boolean var45 = var39.isAvaliacao();
    boolean var46 = var39.isAvaliacao();
    
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
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test289");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test290");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    java.lang.String var15 = var8.getTipo();
    int var16 = var8.getAvaliacaoPositiva();
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var24 = var23.getNumero();
    model.Endereco var31 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var32 = var31.getNumero();
    var31.setCidade("hi!");
    model.Endereco var41 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var43 = var41.equals((java.lang.Object)10L);
    java.lang.String var44 = var41.getNumero();
    boolean var45 = var31.equals((java.lang.Object)var44);
    var31.setBairro("");
    java.lang.String var48 = var31.getBairro();
    var31.setNumero("hi!, hi!\nhi!\n, ");
    boolean var51 = var23.equals((java.lang.Object)var31);
    boolean var52 = var8.equals((java.lang.Object)var31);
    boolean var53 = var2.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test291");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!\n", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ", "hi!", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test292");


    model.Endereco var6 = new model.Endereco("", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var7.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, "));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test293");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var20 = var5.verificaParametros("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    boolean var27 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var34 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var35 = var34.getNumero();
    var34.setCidade("hi!");
    model.Endereco var44 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var46 = var44.equals((java.lang.Object)10L);
    java.lang.String var47 = var44.getNumero();
    boolean var48 = var34.equals((java.lang.Object)var47);
    var34.setBairro("");
    java.lang.String var51 = var34.getNumero();
    java.lang.String var52 = var34.getBairro();
    model.Avaliacao var56 = new model.Avaliacao("", "hi!", false);
    java.lang.String var57 = var56.getCrm();
    boolean var58 = var56.isAvaliacao();
    java.lang.String var59 = var56.getIdUsuario();
    boolean var60 = var34.equals((java.lang.Object)var56);
    boolean var61 = var56.isAvaliacao();
    boolean var62 = var56.isAvaliacao();
    boolean var63 = var56.isAvaliacao();
    var5.addAvaliacao(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test294");


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
    java.lang.String var26 = var5.getEspecialidade();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    int var29 = var5.getAvaliacaoNegativa();
    int var30 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    model.Endereco var39 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var39.setCidade("");
    var39.setBairro("hi!");
    var39.setSala("hi!");
    java.lang.String var46 = var39.getBairro();
    java.lang.String var47 = var39.getEstado();
    boolean var48 = var5.equals((java.lang.Object)var39);
    var39.setRua(", hi!\n\nhi!, ");
    var39.setNumero("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
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
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test295");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test296");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var23 = var22.getNome();
    java.lang.String var24 = var22.getNumeroRegistro();
    int var25 = var22.getAvaliacaoPositiva();
    var22.setTipo("hi!, hi!\nhi!\n, ");
    int var28 = var22.getAvaliacaoPositiva();
    var22.addConvenio("hi!, hi!\nhi!\n, ");
    var22.setTipo("");
    int var33 = var22.getAvaliacaoPositiva();
    boolean var34 = var6.equals((java.lang.Object)var22);
    java.lang.String var35 = var6.getBairro();
    java.lang.String var36 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test297");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    boolean var25 = var23.isAvaliacao();
    var8.addAvaliacao(var23);
    int var27 = var8.getAvaliacaoPositiva();
    java.lang.String var28 = var8.getConvenio();
    java.lang.String var29 = var8.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!\n"+ "'", var28.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test298");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoPositiva();
    java.lang.String var16 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test299");


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
    boolean var30 = var5.verificaParametros("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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
    assertTrue(var30 == true);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test300");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    java.lang.String var22 = var5.getConvenio();
    model.Endereco var29 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var30 = var29.getEstado();
    boolean var31 = var5.equals((java.lang.Object)var29);
    int var32 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var22.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test301");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test302");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var25 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test303");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setSala("hi!");
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test304");


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
    java.lang.String var23 = var5.getEspecialidade();
    java.lang.String var24 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, "+ "'", var24.equals("hi!, \nhi!\n, "));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test305");


    model.Usuario var2 = new model.Usuario("hi!", "hi!");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var8.getNome();
    java.lang.String var10 = var8.getNumeroRegistro();
    int var11 = var8.getAvaliacaoPositiva();
    var8.setTipo("hi!, hi!\nhi!\n, ");
    int var14 = var8.getAvaliacaoPositiva();
    java.lang.String var15 = var8.getNome();
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var24 = var22.equals((java.lang.Object)10L);
    java.lang.String var25 = var22.getNumero();
    var22.setNumero("");
    var22.setSala("hi!");
    boolean var30 = var8.equals((java.lang.Object)"hi!");
    var8.setTipo("hi!, hi!\nhi!\n, ");
    var8.setConvenio("hi!, hi!\n\nhi!, ");
    java.lang.String var35 = var8.getNome();
    var8.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var8.setConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var8.setNumeroRegistro("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var42 = var8.getTipo();
    boolean var47 = var8.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var48 = var2.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var42.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test306");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, hi!");
    java.lang.String var3 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var3.equals("hi!, \nhi!\n, hi!"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test307");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var17 = var15.equals((java.lang.Object)10L);
    var15.setCidade("");
    var15.setBairro("");
    var15.setCidade("hi!");
    var15.setEstado("");
    java.lang.String var26 = var15.getSala();
    java.lang.String var27 = var15.getBairro();
    var15.setNumero("");
    java.lang.String var30 = var15.getSala();
    boolean var31 = var2.equals((java.lang.Object)var15);
    java.lang.String var32 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test308");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNome();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    int var15 = var5.getAvaliacaoPositiva();
    boolean var20 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test309");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var2.getIdentificacao();
    java.lang.String var10 = var2.getNome();
    java.lang.String var11 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test310");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", false);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var5.equals("hi!, hi!\n\nhi!, "));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test311");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var17 = var5.equals((java.lang.Object)1.0f);
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test312");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test313");


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
    java.lang.String var32 = var5.getConvenio();
    java.lang.String var33 = var5.getConvenio();
    var5.addConvenio(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test314");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var12 = var6.toString();
    java.lang.String var13 = var6.getBairro();
    java.lang.String var14 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "+ "'", var12.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test315");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    model.Avaliacao var16 = new model.Avaliacao("", "hi!", false);
    java.lang.String var17 = var16.getCrm();
    java.lang.String var18 = var16.getCrm();
    java.lang.String var19 = var16.getCrm();
    var5.addAvaliacao(var16);
    int var21 = var5.getAvaliacaoPositiva();
    java.lang.String var22 = var5.getConvenio();
    java.lang.String var23 = var5.getEspecialidade();
    boolean var28 = var5.verificaParametros("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!\n, hi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var22.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test316");


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
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var37 = new model.Avaliacao("", "hi!", false);
    java.lang.String var38 = var37.getIdUsuario();
    var33.addAvaliacao(var37);
    java.lang.String var40 = var33.getTipo();
    java.lang.String var41 = var33.getTipo();
    var33.addConvenio("hi!, hi!\nhi!\n, ");
    var33.addConvenio("hi!\n");
    boolean var46 = var2.equals((java.lang.Object)"hi!\n");
    var2.setIdentificacao(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test317");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setBairro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getBairro();
    var6.setEstado(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var22 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var17.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var22.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test318");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!\n");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var24 = var23.getNumero();
    var23.setCidade("hi!");
    java.lang.String var27 = var23.getBairro();
    var23.setEstado("hi!, \nhi!\n, ");
    var23.setRua("");
    java.lang.String var32 = var23.toString();
    var23.setCidade("hi!, hi!\nhi!\nhi!, ");
    var23.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var23.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var39 = var23.getBairro();
    boolean var40 = var5.equals((java.lang.Object)var23);
    java.lang.String var41 = var23.getNumero();
    java.lang.String var42 = var23.getSala();
    model.Endereco var49 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var51 = var49.equals((java.lang.Object)10L);
    java.lang.String var52 = var49.getNumero();
    var49.setNumero("");
    java.lang.String var55 = var49.getNumero();
    var49.setEstado("hi!");
    var49.setBairro("hi!, \nhi!\n, ");
    java.lang.String var60 = var49.getSala();
    boolean var61 = var23.equals((java.lang.Object)var60);
    
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var32.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var41.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test319");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getNumero();
    model.Usuario var14 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var15 = var14.getNome();
    java.lang.String var16 = var14.getNome();
    boolean var17 = var6.equals((java.lang.Object)var16);
    java.lang.String var18 = var6.getEstado();
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var28 = new model.Avaliacao("", "hi!", false);
    java.lang.String var29 = var28.getIdUsuario();
    var24.addAvaliacao(var28);
    var24.setNumeroRegistro("");
    var24.setConvenio("hi!");
    var24.setEspecialidade("hi!, \nhi!\n, ");
    var24.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var39 = var24.getNome();
    int var40 = var24.getAvaliacaoPositiva();
    boolean var41 = var6.equals((java.lang.Object)var24);
    var6.setRua("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test320");


    model.Endereco var6 = new model.Endereco(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test321");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    java.lang.String var15 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getNumeroRegistro();
    int var28 = var25.getAvaliacaoPositiva();
    var25.setTipo("hi!, hi!\nhi!\n, ");
    int var31 = var25.getAvaliacaoPositiva();
    java.lang.String var32 = var25.getNome();
    model.Endereco var39 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var41 = var39.equals((java.lang.Object)10L);
    java.lang.String var42 = var39.getNumero();
    var39.setNumero("");
    var39.setSala("hi!");
    boolean var47 = var25.equals((java.lang.Object)"hi!");
    var25.setTipo("hi!, hi!\nhi!\n, ");
    var25.setConvenio("hi!, hi!\n\nhi!, ");
    java.lang.String var52 = var25.getNome();
    var25.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var25.setConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    boolean var57 = var2.equals((java.lang.Object)var25);
    int var58 = var25.getAvaliacaoPositiva();
    model.ProfissionalSaude var64 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var68 = new model.Avaliacao("", "hi!", false);
    java.lang.String var69 = var68.getIdUsuario();
    var64.addAvaliacao(var68);
    java.lang.String var71 = var64.getTipo();
    java.lang.String var72 = var64.getTipo();
    var64.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var75 = var64.getEspecialidade();
    boolean var76 = var25.equals((java.lang.Object)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test322");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    boolean var22 = var5.verificaParametros("hi!, hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!");
    model.Avaliacao var26 = new model.Avaliacao("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    java.lang.String var27 = var26.getCrm();
    java.lang.String var28 = var26.getIdUsuario();
    boolean var29 = var5.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var28.equals("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test323");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test324");


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
    java.lang.String var20 = var12.getBairro();
    
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
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test325");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.setTipo("hi!");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, ");
    var5.setEspecialidade("hi!");
    java.lang.String var20 = var5.getNumeroRegistro();
    java.lang.String var21 = var5.getEspecialidade();
    var5.setNumeroRegistro("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var20.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test326");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test327");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    model.Endereco var17 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var18 = var17.getNumero();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var26 = var25.getNumero();
    var25.setCidade("hi!");
    model.Endereco var35 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var37 = var35.equals((java.lang.Object)10L);
    java.lang.String var38 = var35.getNumero();
    boolean var39 = var25.equals((java.lang.Object)var38);
    var25.setBairro("");
    java.lang.String var42 = var25.getBairro();
    var25.setNumero("hi!, hi!\nhi!\n, ");
    boolean var45 = var17.equals((java.lang.Object)var25);
    var25.setBairro("");
    boolean var48 = var6.equals((java.lang.Object)var25);
    var25.setSala("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var57 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var59 = var57.equals((java.lang.Object)10L);
    var57.setCidade("hi!, \nhi!\n, ");
    java.lang.String var62 = var57.getEstado();
    boolean var63 = var25.equals((java.lang.Object)var62);
    java.lang.String var64 = var25.toString();
    java.lang.String var65 = var25.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, "+ "'", var64.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test328");


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
    model.ProfissionalSaude var42 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var43 = var42.getNome();
    java.lang.String var44 = var42.getNumeroRegistro();
    int var45 = var42.getAvaliacaoPositiva();
    var42.setTipo("hi!, hi!\nhi!\n, ");
    int var48 = var42.getAvaliacaoPositiva();
    var42.addConvenio("hi!, hi!\nhi!\n, ");
    var42.setTipo("");
    int var53 = var42.getAvaliacaoPositiva();
    java.lang.String var54 = var42.getEspecialidade();
    java.lang.String var55 = var42.getTipo();
    var42.setEspecialidade("");
    java.lang.String var58 = var42.getEspecialidade();
    boolean var59 = var5.equals((java.lang.Object)var42);
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
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
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test329");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!\n", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test330");


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
    java.lang.String var37 = var20.getConvenio();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var37.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test331");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNome();
    model.Usuario var19 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var19.setNome("hi!, hi!\nhi!\nhi!, ");
    var19.setIdentificacao("hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var29 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var30 = var29.getNome();
    java.lang.String var31 = var29.getNumeroRegistro();
    int var32 = var29.getAvaliacaoPositiva();
    var29.setTipo("hi!, hi!\nhi!\n, ");
    int var35 = var29.getAvaliacaoPositiva();
    var29.addConvenio("hi!, hi!\nhi!\n, ");
    var29.setNumeroRegistro("hi!, \nhi!\n, ");
    int var40 = var29.getAvaliacaoPositiva();
    boolean var42 = var29.equals((java.lang.Object)100L);
    boolean var43 = var19.equals((java.lang.Object)100L);
    boolean var44 = var5.equals((java.lang.Object)var19);
    model.Usuario var47 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var53 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var57 = new model.Avaliacao("", "hi!", false);
    java.lang.String var58 = var57.getIdUsuario();
    var53.addAvaliacao(var57);
    var53.setConvenio("hi!");
    boolean var62 = var47.equals((java.lang.Object)var53);
    var53.addConvenio("");
    var53.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    boolean var67 = var5.equals((java.lang.Object)var53);
    var5.setRegistro("hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test332");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test333");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, ");
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var16 = new model.Avaliacao("", "hi!", false);
    java.lang.String var17 = var16.getIdUsuario();
    var12.addAvaliacao(var16);
    int var19 = var12.getAvaliacaoNegativa();
    boolean var24 = var12.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var12.setNome("");
    model.Avaliacao var30 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    var12.addAvaliacao(var30);
    model.Avaliacao var35 = new model.Avaliacao("hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    var12.addAvaliacao(var35);
    boolean var37 = var6.equals((java.lang.Object)var12);
    java.lang.String var38 = var6.getBairro();
    java.lang.String var39 = var6.toString();
    var6.setNumero("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    java.lang.String var42 = var6.getNumero();
    java.lang.String var43 = var6.getSala();
    java.lang.String var44 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var38.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "+ "'", var39.equals("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "+ "'", var42.equals("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var43.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!, \nhi!\n, , hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "+ "'", var44.equals("hi!, \nhi!\n, , hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test334");


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
    int var25 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, \nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test335");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getBairro();
    java.lang.String var16 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test336");


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
    var2.setIdentificacao("hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, hi!");
    
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

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test337");


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
    java.lang.String var33 = var20.getTipo();
    boolean var38 = var20.verificaParametros("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", "", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test338");


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
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, ");
    
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

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test339");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\nhi!, ", "hi!, hi!\n\n, ", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test340");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var18 = var5.getAvaliacaoPositiva();
    int var19 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test341");


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
    java.lang.String var51 = var46.getCrm();
    java.lang.String var52 = var46.getCrm();
    
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
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test342");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    java.lang.String var15 = var8.getNome();
    var8.setNome("hi!, \nhi!\n, ");
    model.Usuario var20 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var26 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getIdUsuario();
    var26.addAvaliacao(var30);
    var26.setConvenio("hi!");
    boolean var35 = var20.equals((java.lang.Object)var26);
    var26.addConvenio("");
    var26.addConvenio("hi!, \nhi!\n, ");
    model.Avaliacao var43 = new model.Avaliacao(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    boolean var44 = var26.equals((java.lang.Object)var43);
    java.lang.String var45 = var43.getIdUsuario();
    var8.addAvaliacao(var43);
    java.lang.String var47 = var43.getCrm();
    boolean var48 = var2.equals((java.lang.Object)var43);
    var2.setIdentificacao("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var45.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var47.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test343");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test344");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    java.lang.String var10 = var5.getTipo();
    int var11 = var5.getAvaliacaoNegativa();
    model.Usuario var14 = new model.Usuario("", "");
    java.lang.String var15 = var14.getIdentificacao();
    var14.setIdentificacao("hi!");
    java.lang.String var18 = var14.getNome();
    var14.setNome("hi!");
    model.ProfissionalSaude var26 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getIdUsuario();
    var26.addAvaliacao(var30);
    java.lang.String var33 = var30.getIdUsuario();
    boolean var34 = var14.equals((java.lang.Object)var30);
    boolean var35 = var30.isAvaliacao();
    boolean var36 = var30.isAvaliacao();
    java.lang.String var37 = var30.getIdUsuario();
    var5.addAvaliacao(var30);
    int var39 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test345");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    model.Usuario var15 = new model.Usuario("", "");
    java.lang.String var16 = var15.getIdentificacao();
    var15.setIdentificacao("hi!");
    var15.setIdentificacao("hi!");
    boolean var21 = var6.equals((java.lang.Object)"hi!");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var24 = var6.toString();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var24.equals("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test346");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    java.lang.String var17 = var5.getTipo();
    java.lang.String var18 = var5.getConvenio();
    
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
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test347");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
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
    boolean var42 = var6.equals((java.lang.Object)"hi!, \nhi!\n, ");
    java.lang.String var43 = var6.getRua();
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    
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
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test348");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getSala();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test349");


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
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setEspecialidade("hi!");
    var5.setTipo("hi!, hi!\nhi!\n, hi!");
    
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

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test350");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test351");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    var6.setRua("");
    java.lang.String var25 = var6.getSala();
    java.lang.String var26 = var6.getRua();
    java.lang.String var27 = var6.getRua();
    var6.setNumero("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var6.setNumero(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test352");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.Usuario var9 = new model.Usuario("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    boolean var10 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test353");


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
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test354");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getRua();
    java.lang.String var12 = var6.getCidade();
    var6.setEstado(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getCidade();
    var6.setNumero("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test355");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test356");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var8.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var11 = var8.getNumeroRegistro();
    int var12 = var8.getAvaliacaoNegativa();
    boolean var13 = var2.equals((java.lang.Object)var12);
    var2.setNome("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    model.Endereco var22 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    boolean var23 = var2.equals((java.lang.Object)", hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test357");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("hi!, \nhi!\n, ");
    model.Usuario var13 = new model.Usuario("hi!", "hi!, \nhi!\n, ");
    var13.setIdentificacao("hi!");
    model.Usuario var18 = new model.Usuario("hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var19 = var18.getIdentificacao();
    boolean var20 = var13.equals((java.lang.Object)var18);
    boolean var21 = var6.equals((java.lang.Object)var13);
    model.ProfissionalSaude var27 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var28 = var27.getNome();
    java.lang.String var29 = var27.getNumeroRegistro();
    int var30 = var27.getAvaliacaoPositiva();
    var27.setTipo("hi!, hi!\nhi!\n, ");
    int var33 = var27.getAvaliacaoPositiva();
    var27.addConvenio("hi!, hi!\nhi!\n, ");
    var27.setTipo("");
    int var38 = var27.getAvaliacaoPositiva();
    java.lang.String var39 = var27.getEspecialidade();
    var27.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var42 = var27.getEspecialidade();
    java.lang.String var43 = var27.getEspecialidade();
    model.ProfissionalSaude var49 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var53 = new model.Avaliacao("", "hi!", false);
    java.lang.String var54 = var53.getIdUsuario();
    var49.addAvaliacao(var53);
    int var56 = var49.getAvaliacaoNegativa();
    var49.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var64 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var68 = new model.Avaliacao("", "hi!", false);
    java.lang.String var69 = var68.getIdUsuario();
    var64.addAvaliacao(var68);
    var64.setTipo("hi!, \nhi!\n, ");
    boolean var73 = var49.equals((java.lang.Object)var64);
    boolean var74 = var27.equals((java.lang.Object)var64);
    java.lang.String var75 = var27.getTipo();
    boolean var76 = var13.equals((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var19.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var42.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var43.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test358");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    model.Endereco var19 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var19.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var19.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var24 = var6.equals((java.lang.Object)"hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test359");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Avaliacao var21 = new model.Avaliacao("hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", false);
    var5.addAvaliacao(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test360");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var20 = var5.getNome();
    var5.setTipo(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var23 = var5.getTipo();
    model.Avaliacao var27 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!", true);
    var5.addAvaliacao(var27);
    boolean var29 = var27.isAvaliacao();
    boolean var30 = var27.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var23.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test361");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, \nhi!\n, ");
    java.lang.String var13 = var6.getCidade();
    var6.setRua("hi!, hi!\n\n, , \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test362");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var11 = var6.getRua();
    var6.setEstado("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var14.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test363");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    java.lang.String var18 = var2.getIdentificacao();
    java.lang.String var19 = var2.getNome();
    var2.setNome("hi!, \nhi!\n, ");
    var2.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, "));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test364");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    int var6 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test365");


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
    var20.setConvenio("hi!, hi!\n\n, , \nhi!\n, ");
    var20.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    int var37 = var20.getAvaliacaoPositiva();
    
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
    assertTrue(var37 == 0);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test366");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("");
    model.Endereco var18 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var19 = var18.getRua();
    var18.setEstado("hi!");
    java.lang.String var22 = var18.getCidade();
    var18.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var18.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var27 = var2.equals((java.lang.Object)var18);
    var18.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test367");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.toString();
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test368");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    int var7 = var5.getAvaliacaoPositiva();
    var5.setRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var10 = var5.getNome();
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    int var13 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test369");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!\n", "hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var8 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test370");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test371");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!, hi!\nhi!\n, \nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test372");


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
    java.lang.String var28 = var6.getSala();
    java.lang.String var29 = var6.getSala();
    
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
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test373");


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
    model.Usuario var20 = new model.Usuario("hi!", "hi!, \nhi!\n, ");
    boolean var21 = var5.equals((java.lang.Object)"hi!, \nhi!\n, ");
    java.lang.String var22 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\n\n, ");
    
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test374");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getRua();
    java.lang.String var18 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, "+ "'", var18.equals("hi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, "));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test375");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    java.lang.String var15 = var8.getNome();
    var8.setNome("hi!, \nhi!\n, ");
    model.Usuario var20 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var26 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getIdUsuario();
    var26.addAvaliacao(var30);
    var26.setConvenio("hi!");
    boolean var35 = var20.equals((java.lang.Object)var26);
    var26.addConvenio("");
    var26.addConvenio("hi!, \nhi!\n, ");
    model.Avaliacao var43 = new model.Avaliacao(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    boolean var44 = var26.equals((java.lang.Object)var43);
    java.lang.String var45 = var43.getIdUsuario();
    var8.addAvaliacao(var43);
    java.lang.String var47 = var43.getCrm();
    boolean var48 = var2.equals((java.lang.Object)var43);
    model.Endereco var55 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var56 = var55.getNumero();
    var55.setCidade("hi!");
    java.lang.String var59 = var55.getCidade();
    boolean var60 = var2.equals((java.lang.Object)var55);
    var55.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var55.setCidade("hi!, \nhi!\n, , hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var45.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var47.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test376");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ", "", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
      fail("Expected exception of type exception.ProfissionalSaudeException");
    } catch (exception.ProfissionalSaudeException e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test377");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    model.Avaliacao var22 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var5.addAvaliacao(var22);
    int var24 = var5.getAvaliacaoNegativa();
    boolean var29 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
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
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test378");


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
    java.lang.String var26 = var5.getTipo();
    var5.addConvenio("hi!, hi!\n\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var31 = var5.getNome();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test379");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    java.lang.String var23 = var21.getCrm();
    boolean var24 = var21.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test380");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getCidade();
    java.lang.String var11 = var6.getSala();
    model.Usuario var14 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    var20.setConvenio("hi!");
    boolean var29 = var14.equals((java.lang.Object)var20);
    var20.addConvenio("");
    java.lang.String var32 = var20.getConvenio();
    int var33 = var20.getAvaliacaoNegativa();
    var20.setRegistro("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    boolean var36 = var6.equals((java.lang.Object)"hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var37 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!\n"+ "'", var32.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test381");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var7 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!"+ "'", var7.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test382");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    int var12 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test383");


    model.Usuario var2 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\n\nhi!, ");
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var16 = new model.Avaliacao("", "hi!", false);
    java.lang.String var17 = var16.getIdUsuario();
    var12.addAvaliacao(var16);
    var12.setNumeroRegistro("");
    java.lang.String var21 = var12.getNome();
    var12.setEspecialidade("hi!");
    boolean var24 = var2.equals((java.lang.Object)var12);
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var31 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test384");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var15.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var15.getRua();
    var15.setSala("hi!, hi!\nhi!\nhi!, ");
    var15.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var23 = var6.equals((java.lang.Object)var15);
    var6.setEstado("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test385");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    java.lang.String var18 = var2.getIdentificacao();
    java.lang.String var19 = var2.getNome();
    var2.setNome("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var24 = var2.getIdentificacao();
    java.lang.String var25 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test386");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var12 = var6.getEstado();
    java.lang.String var13 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test387");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!\n", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ");

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test388");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, \nhi!\n, ");
    model.ProfissionalSaude var18 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var22 = new model.Avaliacao("", "hi!", false);
    java.lang.String var23 = var22.getIdUsuario();
    var18.addAvaliacao(var22);
    var18.setTipo("hi!, \nhi!\n, ");
    var18.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var18.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var18.setNumeroRegistro("hi!");
    boolean var33 = var6.equals((java.lang.Object)var18);
    boolean var38 = var18.verificaParametros("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!, hi!\nhi!\n, \nhi!\n, ", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test389");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getConvenio();
    var5.setRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var20 = new model.Avaliacao("", "hi!", false);
    java.lang.String var21 = var20.getIdUsuario();
    var16.addAvaliacao(var20);
    var16.setConvenio("hi!");
    var16.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getCrm();
    java.lang.String var32 = var30.getCrm();
    boolean var33 = var30.isAvaliacao();
    java.lang.String var34 = var30.getCrm();
    java.lang.String var35 = var30.getCrm();
    var16.addAvaliacao(var30);
    java.lang.String var37 = var16.getNumeroRegistro();
    var16.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var40 = var5.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test390");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!\n");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var24 = var23.getNumero();
    var23.setCidade("hi!");
    java.lang.String var27 = var23.getBairro();
    var23.setEstado("hi!, \nhi!\n, ");
    var23.setRua("");
    java.lang.String var32 = var23.toString();
    var23.setCidade("hi!, hi!\nhi!\nhi!, ");
    var23.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var23.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var39 = var23.getBairro();
    boolean var40 = var5.equals((java.lang.Object)var23);
    int var41 = var5.getAvaliacaoPositiva();
    java.lang.String var42 = var5.getTipo();
    
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var32.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var42.equals("hi!, hi!\nhi!\n, "));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test391");


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
    java.lang.String var24 = var12.getCidade();
    
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
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test392");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, \nhi!\n, , hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, hi!");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test393");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    boolean var25 = var23.isAvaliacao();
    var8.addAvaliacao(var23);
    boolean var31 = var8.verificaParametros("", "hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!");
    var8.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var34 = var8.getConvenio();
    boolean var36 = var8.equals((java.lang.Object)", \nhi!\n, hi!");
    var8.setNumeroRegistro("hi!, \nhi!\n, ");
    int var39 = var8.getAvaliacaoPositiva();
    java.lang.String var40 = var8.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var34.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test394");


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
    int var55 = var29.getAvaliacaoPositiva();
    
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
    assertTrue(var55 == 0);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test395");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, "+ "'", var15.equals("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test396");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    java.lang.String var15 = var5.getTipo();
    var5.setRegistro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var18 = var5.getEspecialidade();
    
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
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test397");


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
    var5.setTipo("hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ");
    
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

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test398");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    var6.setRua("hi!, hi!\n\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test399");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    model.Usuario var11 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var12 = var5.equals((java.lang.Object)var11);
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var15.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test400");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var2.getIdentificacao();
    java.lang.String var8 = var2.getNome();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var8.equals("hi!, hi!\n\nhi!, "));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test401");


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
    var5.addConvenio("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ");
    int var23 = var5.getAvaliacaoNegativa();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test402");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    var5.setTipo(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var26 = new model.Avaliacao("", "hi!", false);
    java.lang.String var27 = var26.getIdUsuario();
    var22.addAvaliacao(var26);
    var22.setNumeroRegistro("");
    var22.setConvenio("hi!");
    var22.setEspecialidade("hi!, \nhi!\n, ");
    java.lang.String var35 = var22.getConvenio();
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getCrm();
    java.lang.String var41 = var39.getCrm();
    java.lang.String var42 = var39.getCrm();
    boolean var43 = var39.isAvaliacao();
    boolean var44 = var39.isAvaliacao();
    var22.addAvaliacao(var39);
    boolean var46 = var39.isAvaliacao();
    var5.addAvaliacao(var39);
    model.Avaliacao var51 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    boolean var52 = var51.isAvaliacao();
    var5.addAvaliacao(var51);
    int var54 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 3);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test403");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \nhi!\n, ");
    int var6 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test404");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    int var35 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    int var38 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test405");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getConvenio();
    model.Avaliacao var22 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, ", false);
    java.lang.String var23 = var22.getCrm();
    var5.addAvaliacao(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test406");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var22.setCidade("");
    java.lang.String var25 = var22.getSala();
    var22.setCidade("hi!, \nhi!\n, ");
    boolean var28 = var6.equals((java.lang.Object)"hi!, \nhi!\n, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test407");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test408");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    java.lang.String var10 = var6.getNumero();
    var6.setBairro("hi!");
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getRua();
    java.lang.String var15 = var6.toString();
    var6.setNumero("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var13.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test409");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    model.Endereco var17 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var18 = var17.getNumero();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var26 = var25.getNumero();
    var25.setCidade("hi!");
    model.Endereco var35 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var37 = var35.equals((java.lang.Object)10L);
    java.lang.String var38 = var35.getNumero();
    boolean var39 = var25.equals((java.lang.Object)var38);
    var25.setBairro("");
    java.lang.String var42 = var25.getBairro();
    var25.setNumero("hi!, hi!\nhi!\n, ");
    boolean var45 = var17.equals((java.lang.Object)var25);
    var25.setBairro("");
    boolean var48 = var6.equals((java.lang.Object)var25);
    var25.setSala("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var51 = var25.getNumero();
    java.lang.String var52 = var25.getNumero();
    var25.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var25.setBairro("hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var51.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var52.equals("hi!, hi!\nhi!\n, "));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test410");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    model.Usuario var17 = new model.Usuario("", "");
    java.lang.String var18 = var17.getIdentificacao();
    java.lang.String var19 = var17.getNome();
    boolean var20 = var2.equals((java.lang.Object)var17);
    var17.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var23 = var17.getIdentificacao();
    var17.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var23.equals("hi!, \nhi!\n, hi!"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test411");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    var6.setRua("");
    java.lang.String var25 = var6.getSala();
    var6.setBairro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var28 = var6.getNumero();
    java.lang.String var29 = var6.toString();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setRua("hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, "+ "'", var29.equals(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, "));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test412");


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
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var20 = var5.getEspecialidade();
    model.ProfissionalSaude var26 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getIdUsuario();
    var26.addAvaliacao(var30);
    var26.setTipo("hi!, \nhi!\n, ");
    var26.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var26.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var42 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var26.addAvaliacao(var42);
    java.lang.String var44 = var42.getCrm();
    java.lang.String var45 = var42.getIdUsuario();
    var5.addAvaliacao(var42);
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
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var20.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var45.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test413");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getConvenio();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
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

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test414");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    java.lang.String var18 = var15.getCidade();
    java.lang.String var19 = var15.getNumero();
    java.lang.String var20 = var15.toString();
    java.lang.String var21 = var15.getRua();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test415");


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
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var20 = var5.getEspecialidade();
    model.ProfissionalSaude var26 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getIdUsuario();
    var26.addAvaliacao(var30);
    var26.setTipo("hi!, \nhi!\n, ");
    var26.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var26.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var42 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var26.addAvaliacao(var42);
    java.lang.String var44 = var42.getCrm();
    java.lang.String var45 = var42.getIdUsuario();
    var5.addAvaliacao(var42);
    boolean var51 = var5.verificaParametros("hi!, hi!\nhi!\n, hi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    boolean var56 = var5.verificaParametros("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var20 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var20.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var45.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test416");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.getEstado();
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, "));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test417");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.toString();
    java.lang.String var12 = var6.getBairro();
    var6.setNumero("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var15 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test418");


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
    model.ProfissionalSaude var36 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var37 = var36.getNome();
    var36.addConvenio("hi!");
    var36.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var36.addConvenio("hi!, hi!\nhi!\n, ");
    var36.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var46 = var36.getAvaliacaoNegativa();
    var36.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    boolean var49 = var22.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
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
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test419");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getNome();
    java.lang.String var5 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test420");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test421");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", true);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test422");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getEstado();
    var6.setNumero("hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var6.getBairro();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    var6.setEstado("hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test423");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var6.getNumero();
    var6.setSala(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var12 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test424");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\n\n, , \nhi!\n, ");
    int var26 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test425");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getCidade();
    java.lang.String var9 = var6.getCidade();
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var12 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test426");


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
    var6.setBairro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!\n\n, , \nhi!\n, ");
    java.lang.String var36 = var6.getEstado();
    
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
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test427");


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
    var20.setNumeroRegistro("hi!, \nhi!\n, , hi!\n\nhi!, ");
    boolean var43 = var20.verificaParametros("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test428");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var6 = var5.getTipo();
    java.lang.String var7 = var5.getNome();
    var5.addConvenio("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var10 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var13 = var5.getNumeroRegistro();
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\n, "+ "'", var7.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var10.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test429");


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
    java.lang.String var35 = var6.getBairro();
    var6.setCidade("hi!, \nhi!\nhi!, ");
    
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
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test430");


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
    var5.setRegistro("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test431");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getNumero();
    java.lang.String var12 = var6.toString();
    java.lang.String var13 = var6.getBairro();
    java.lang.String var14 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test432");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var4 = var3.getIdUsuario();
    boolean var5 = var3.isAvaliacao();
    java.lang.String var6 = var3.getCrm();
    boolean var7 = var3.isAvaliacao();
    boolean var8 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test433");


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
    java.lang.String var35 = var2.getIdentificacao();
    
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
    assertTrue("'" + var35 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var35.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test434");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var17 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test435");


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
    java.lang.String var21 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var20.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test436");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test437");


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
    model.Avaliacao var28 = new model.Avaliacao("", "hi!", false);
    java.lang.String var29 = var28.getCrm();
    boolean var30 = var28.isAvaliacao();
    java.lang.String var31 = var28.getIdUsuario();
    boolean var32 = var6.equals((java.lang.Object)var28);
    boolean var33 = var28.isAvaliacao();
    boolean var34 = var28.isAvaliacao();
    boolean var35 = var28.isAvaliacao();
    java.lang.String var36 = var28.getIdUsuario();
    
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
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test438");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getConvenio();
    int var16 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var19 = var5.getTipo();
    java.lang.String var20 = var5.getNumeroRegistro();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test439");


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
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
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

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test440");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getTipo();
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var17 = var5.getEspecialidade();
    java.lang.String var18 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test441");


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
    int var22 = var5.getAvaliacaoPositiva();
    
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

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test442");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getSala();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getBairro();
    java.lang.String var15 = var6.toString();
    var6.setRua(", \nhi!\n, hi!");
    java.lang.String var18 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var15.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test443");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var7 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test444");


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
    int var22 = var5.getAvaliacaoPositiva();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test445");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var19 = var6.toString();
    model.Usuario var22 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var22.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var25 = var22.getIdentificacao();
    var22.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    var22.setIdentificacao("hi!, hi!\n\nhi!, ");
    java.lang.String var30 = var22.getNome();
    java.lang.String var31 = var22.getIdentificacao();
    var22.setIdentificacao("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var34 = var6.equals((java.lang.Object)"hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var19.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var30.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var31.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test446");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getConvenio();
    var5.setRegistro(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test447");


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
    java.lang.String var23 = var5.getTipo();
    
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
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test448");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test449");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    var5.setEspecialidade("");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    java.lang.String var30 = var23.getNumeroRegistro();
    java.lang.String var31 = var23.getTipo();
    java.lang.String var32 = var23.getNome();
    model.Usuario var35 = new model.Usuario("", "");
    java.lang.String var36 = var35.getIdentificacao();
    var35.setIdentificacao("hi!");
    java.lang.String var39 = var35.getNome();
    var35.setNome("hi!");
    model.ProfissionalSaude var47 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var51 = new model.Avaliacao("", "hi!", false);
    java.lang.String var52 = var51.getIdUsuario();
    var47.addAvaliacao(var51);
    java.lang.String var54 = var51.getIdUsuario();
    boolean var55 = var35.equals((java.lang.Object)var51);
    java.lang.String var56 = var51.getCrm();
    var23.addAvaliacao(var51);
    var5.addAvaliacao(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test450");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("hi!");
    java.lang.String var15 = var6.getBairro();
    var6.setSala("hi!");
    java.lang.String var18 = var6.getRua();
    java.lang.String var19 = var6.getCidade();
    var6.setCidade("hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test451");


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
    var6.setBairro(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    model.Endereco var59 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var60 = var59.getSala();
    java.lang.String var61 = var59.getSala();
    boolean var62 = var6.equals((java.lang.Object)var59);
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var65 = var6.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!, hi!\n, hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var65.equals("hi!, hi!\n, hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test452");


    model.Usuario var2 = new model.Usuario("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test453");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var9.setCidade("");
    java.lang.String var12 = var9.getSala();
    var9.setCidade("");
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    var9.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    boolean var19 = var2.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getNumeroRegistro();
    int var28 = var25.getAvaliacaoPositiva();
    model.Endereco var35 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var35.setCidade("");
    java.lang.String var38 = var35.getSala();
    java.lang.String var39 = var35.getCidade();
    boolean var40 = var25.equals((java.lang.Object)var35);
    java.lang.String var41 = var35.getRua();
    boolean var42 = var2.equals((java.lang.Object)var41);
    java.lang.String var43 = var2.getIdentificacao();
    model.Usuario var46 = new model.Usuario("", "");
    java.lang.String var47 = var46.getIdentificacao();
    var46.setNome("hi!");
    java.lang.String var50 = var46.getIdentificacao();
    var46.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var53 = var46.getIdentificacao();
    boolean var54 = var2.equals((java.lang.Object)var53);
    var2.setNome("hi!, hi!, hi!\nhi!\n, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var43.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test454");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test455");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var7 = var2.getNome();
    var2.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var15 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var15.getNome();
    java.lang.String var17 = var15.getNumeroRegistro();
    int var18 = var15.getAvaliacaoPositiva();
    var15.setTipo("hi!, hi!\nhi!\n, ");
    int var21 = var15.getAvaliacaoPositiva();
    var15.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var24 = var15.getNome();
    var15.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var27 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var31 = var2.equals((java.lang.Object)(byte)1);
    var2.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test456");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var3 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , "+ "'", var3.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , "));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test457");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.toString();
    var6.setRua("hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getRua();
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var18 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var18.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test458");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    java.lang.String var6 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, "));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test459");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var15 = var5.verificaParametros(", \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var16 = var5.getTipo();
    var5.setTipo(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "+ "'", var16.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test460");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var15 = var5.verificaParametros(", \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    int var16 = var5.getAvaliacaoPositiva();
    boolean var21 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var24 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test461");


    model.Usuario var2 = new model.Usuario(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var11 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var13 = var11.equals((java.lang.Object)10L);
    java.lang.String var14 = var11.getRua();
    java.lang.String var15 = var11.getSala();
    var11.setBairro("");
    boolean var18 = var2.equals((java.lang.Object)var11);
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var28 = new model.Avaliacao("", "hi!", false);
    java.lang.String var29 = var28.getIdUsuario();
    var24.addAvaliacao(var28);
    int var31 = var24.getAvaliacaoNegativa();
    var24.setNumeroRegistro("hi!, hi!\n\n, ");
    model.ProfissionalSaude var39 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var40 = var39.getNome();
    var39.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var48 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var49 = var48.getNome();
    java.lang.String var50 = var48.getNumeroRegistro();
    int var51 = var48.getAvaliacaoPositiva();
    var48.setTipo("hi!, hi!\nhi!\n, ");
    int var54 = var48.getAvaliacaoPositiva();
    var48.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var57 = var48.getConvenio();
    boolean var58 = var39.equals((java.lang.Object)var48);
    var48.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var61 = var48.getEspecialidade();
    java.lang.String var62 = var48.getNome();
    var48.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var70 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var71 = var70.getNome();
    java.lang.String var72 = var70.getNumeroRegistro();
    int var73 = var70.getAvaliacaoPositiva();
    var70.setTipo("hi!, hi!\nhi!\n, ");
    int var76 = var70.getAvaliacaoPositiva();
    var70.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var79 = var70.getNome();
    var70.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var70.setNome("hi!, hi!\n\n, ");
    model.Avaliacao var87 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var88 = var87.isAvaliacao();
    var70.addAvaliacao(var87);
    var48.addAvaliacao(var87);
    java.lang.String var91 = var87.getCrm();
    boolean var92 = var87.isAvaliacao();
    var24.addAvaliacao(var87);
    boolean var94 = var11.equals((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var57.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "hi!, \nhi!\n, "+ "'", var91.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test462");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    var6.setNumero(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var6.setNumero("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    java.lang.String var19 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test463");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n, \nhi!, hi!\n\nhi!, \n, ");

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test464");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var7 = var6.getRua();
    java.lang.String var8 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var8.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test465");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var9 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, "));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test466");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setSala("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var12 = var6.getRua();
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var6.getEstado();
    java.lang.String var16 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test467");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    model.ProfissionalSaude var15 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var15.getNome();
    java.lang.String var17 = var15.getNumeroRegistro();
    int var18 = var15.getAvaliacaoPositiva();
    var15.setTipo("hi!, hi!\nhi!\n, ");
    int var21 = var15.getAvaliacaoPositiva();
    var15.addConvenio("hi!, hi!\nhi!\n, ");
    model.Endereco var30 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var31 = var30.getNumero();
    var30.setCidade("hi!");
    model.Endereco var40 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var42 = var40.equals((java.lang.Object)10L);
    java.lang.String var43 = var40.getNumero();
    boolean var44 = var30.equals((java.lang.Object)var43);
    var30.setBairro("");
    java.lang.String var47 = var30.getNumero();
    java.lang.String var48 = var30.getBairro();
    boolean var49 = var15.equals((java.lang.Object)var48);
    boolean var50 = var6.equals((java.lang.Object)var48);
    var6.setCidade("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test468");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\n, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test469");


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
    boolean var34 = var5.verificaParametros("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var38 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    boolean var39 = var38.isAvaliacao();
    var5.addAvaliacao(var38);
    java.lang.String var41 = var38.getIdUsuario();
    java.lang.String var42 = var38.getCrm();
    
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
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var42.equals("hi!, hi!\nhi!\n, "));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test470");


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
    var5.setConvenio("hi!, hi!\n\n, , \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test471");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    var5.addConvenio("hi!, \nhi!\n, ");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    var23.setCidade("");
    var23.setBairro("");
    java.lang.String var30 = var23.getNumero();
    boolean var31 = var5.equals((java.lang.Object)var30);
    var5.setConvenio("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var38 = var5.verificaParametros("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test472");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var20 = var5.getConvenio();
    java.lang.String var21 = var5.getConvenio();
    java.lang.String var22 = var5.getNome();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test473");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!");
    int var8 = var5.getAvaliacaoPositiva();
    java.lang.String var9 = var5.getNome();
    var5.setConvenio("hi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test474");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", true);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test475");


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
    java.lang.String var25 = var6.getEstado();
    java.lang.String var26 = var6.getBairro();
    java.lang.String var27 = var6.getNumero();
    java.lang.String var28 = var6.getBairro();
    
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
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test476");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getSala();
    var6.setEstado("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test477");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var17 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var24 = var23.getNome();
    java.lang.String var25 = var23.getNumeroRegistro();
    int var26 = var23.getAvaliacaoPositiva();
    var23.setTipo("hi!, hi!\nhi!\n, ");
    int var29 = var23.getAvaliacaoPositiva();
    var23.addConvenio("hi!, hi!\nhi!\n, ");
    var23.setNumeroRegistro("hi!, \nhi!\n, ");
    model.Avaliacao var37 = new model.Avaliacao("", "hi!", false);
    java.lang.String var38 = var37.getCrm();
    boolean var39 = var23.equals((java.lang.Object)var37);
    java.lang.String var40 = var37.getCrm();
    var5.addAvaliacao(var37);
    var5.setRegistro("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test478");


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
    java.lang.String var34 = var6.getEstado();
    java.lang.String var35 = var6.getNumero();
    java.lang.String var36 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, \nhi!\n, "+ "'", var28.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test479");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    boolean var9 = var5.equals((java.lang.Object)(byte)100);
    int var10 = var5.getAvaliacaoPositiva();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test480");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", true);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test481");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getRua();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test482");


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
    java.lang.String var24 = var6.toString();
    var6.setNumero(", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var19.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, , hi!\n\nhi!, "+ "'", var24.equals("hi!, \nhi!\n, , hi!\n\nhi!, "));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test483");


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
    boolean var34 = var5.verificaParametros("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var38 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    boolean var39 = var38.isAvaliacao();
    var5.addAvaliacao(var38);
    model.ProfissionalSaude var46 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var46.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var49 = var46.getEspecialidade();
    model.ProfissionalSaude var55 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var59 = new model.Avaliacao("", "hi!", false);
    java.lang.String var60 = var59.getIdUsuario();
    var55.addAvaliacao(var59);
    int var62 = var55.getAvaliacaoNegativa();
    boolean var67 = var55.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var55.setNome("");
    model.Avaliacao var73 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    var55.addAvaliacao(var73);
    model.Avaliacao var78 = new model.Avaliacao("hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    var55.addAvaliacao(var78);
    java.lang.String var80 = var78.getCrm();
    boolean var81 = var78.isAvaliacao();
    java.lang.String var82 = var78.getIdUsuario();
    boolean var83 = var78.isAvaliacao();
    var46.addAvaliacao(var78);
    var5.addAvaliacao(var78);
    
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
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var49.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!"+ "'", var80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var82.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test484");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    model.Usuario var15 = new model.Usuario("", "");
    java.lang.String var16 = var15.getIdentificacao();
    var15.setIdentificacao("hi!");
    var15.setIdentificacao("hi!");
    boolean var21 = var6.equals((java.lang.Object)"hi!");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var6.setEstado("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var26 = var6.toString();
    java.lang.String var27 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test485");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getRua();
    java.lang.String var12 = var6.getCidade();
    var6.setEstado(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getCidade();
    var6.setBairro("hi!, hi!\n, hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test486");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getBairro();
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var20 = new model.Avaliacao("", "hi!", false);
    java.lang.String var21 = var20.getIdUsuario();
    var16.addAvaliacao(var20);
    var16.setTipo("hi!, \nhi!\n, ");
    var16.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var16.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var16.addAvaliacao(var32);
    var16.addConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var42 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var43 = var42.getNumero();
    model.Endereco var50 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var51 = var50.getNumero();
    var50.setCidade("hi!");
    model.Endereco var60 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var62 = var60.equals((java.lang.Object)10L);
    java.lang.String var63 = var60.getNumero();
    boolean var64 = var50.equals((java.lang.Object)var63);
    var50.setBairro("");
    java.lang.String var67 = var50.getBairro();
    var50.setNumero("hi!, hi!\nhi!\n, ");
    boolean var70 = var42.equals((java.lang.Object)var50);
    java.lang.String var71 = var42.getNumero();
    var42.setRua("hi!, \nhi!\n, ");
    var42.setSala("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var79 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var80 = var79.getCrm();
    java.lang.String var81 = var79.getCrm();
    java.lang.String var82 = var79.getIdUsuario();
    boolean var83 = var42.equals((java.lang.Object)var79);
    java.lang.String var84 = var79.getCrm();
    var16.addAvaliacao(var79);
    boolean var86 = var6.equals((java.lang.Object)var16);
    java.lang.String var87 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!, \nhi!\n, "+ "'", var80.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!, \nhi!\n, "+ "'", var81.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var82.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!, \nhi!\n, "+ "'", var84.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var87.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test487");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
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
    java.lang.String var31 = var9.getIdentificacao();
    boolean var32 = var6.equals((java.lang.Object)var31);
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
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
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var31.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test488");


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
    var12.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
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

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test489");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    int var12 = var5.getAvaliacaoNegativa();
    java.lang.String var13 = var5.getNumeroRegistro();
    java.lang.String var14 = var5.getNome();
    var5.setNome("hi!, \nhi!\n, , hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test490");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!");
    java.lang.String var11 = var6.getNumero();
    var6.setCidade("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test491");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    java.lang.String var4 = var2.getIdentificacao();
    model.ProfissionalSaude var10 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var11 = var10.getNome();
    java.lang.String var12 = var10.getNumeroRegistro();
    int var13 = var10.getAvaliacaoPositiva();
    var10.setTipo("hi!, hi!\nhi!\n, ");
    int var16 = var10.getAvaliacaoPositiva();
    var10.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var19 = var10.getNumeroRegistro();
    java.lang.String var20 = var10.getTipo();
    java.lang.String var21 = var10.getEspecialidade();
    java.lang.String var22 = var10.getTipo();
    var10.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    var10.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var10.setNumeroRegistro("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    boolean var29 = var2.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var4.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test492");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var37 = var5.getNome();
    int var38 = var5.getAvaliacaoPositiva();
    
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
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test493");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getNome();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var17 = var5.getNome();
    model.Avaliacao var21 = new model.Avaliacao("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", true);
    var5.addAvaliacao(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test494");


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
    model.Usuario var45 = new model.Usuario("", "");
    java.lang.String var46 = var45.getIdentificacao();
    var45.setIdentificacao("hi!");
    java.lang.String var49 = var45.getNome();
    var45.setNome("hi!");
    model.ProfissionalSaude var57 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var61 = new model.Avaliacao("", "hi!", false);
    java.lang.String var62 = var61.getIdUsuario();
    var57.addAvaliacao(var61);
    java.lang.String var64 = var61.getIdUsuario();
    boolean var65 = var45.equals((java.lang.Object)var61);
    java.lang.String var66 = var61.getIdUsuario();
    boolean var67 = var61.isAvaliacao();
    java.lang.String var68 = var61.getIdUsuario();
    java.lang.String var69 = var61.getCrm();
    java.lang.String var70 = var61.getIdUsuario();
    boolean var71 = var5.equals((java.lang.Object)var61);
    java.lang.String var72 = var61.getIdUsuario();
    
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
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test495");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    model.Endereco var17 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var18 = var17.getNumero();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var26 = var25.getNumero();
    var25.setCidade("hi!");
    model.Endereco var35 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var37 = var35.equals((java.lang.Object)10L);
    java.lang.String var38 = var35.getNumero();
    boolean var39 = var25.equals((java.lang.Object)var38);
    var25.setBairro("");
    java.lang.String var42 = var25.getBairro();
    var25.setNumero("hi!, hi!\nhi!\n, ");
    boolean var45 = var17.equals((java.lang.Object)var25);
    var25.setBairro("");
    boolean var48 = var6.equals((java.lang.Object)var25);
    var25.setSala("hi!, hi!\nhi!\nhi!, ");
    var25.setSala("hi!, hi!\n\nhi!, ");
    var25.setEstado(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var55 = var25.getNumero();
    java.lang.String var56 = var25.toString();
    java.lang.String var57 = var25.toString();
    var25.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var55.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var56.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var57.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test496");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test497");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var22 = var5.getAvaliacaoNegativa();
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("", "hi!", false);
    java.lang.String var33 = var32.getIdUsuario();
    var28.addAvaliacao(var32);
    int var35 = var28.getAvaliacaoNegativa();
    var28.addConvenio("hi!");
    java.lang.String var38 = var28.getTipo();
    java.lang.String var39 = var28.getEspecialidade();
    int var40 = var28.getAvaliacaoPositiva();
    model.Avaliacao var44 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var45 = var44.isAvaliacao();
    java.lang.String var46 = var44.getCrm();
    var28.addAvaliacao(var44);
    boolean var48 = var5.equals((java.lang.Object)var44);
    java.lang.String var49 = var5.getNumeroRegistro();
    int var50 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test498");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    var5.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var27 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var28 = var27.getNome();
    java.lang.String var29 = var27.getNumeroRegistro();
    int var30 = var27.getAvaliacaoPositiva();
    var27.setTipo("hi!, hi!\nhi!\n, ");
    int var33 = var27.getAvaliacaoPositiva();
    var27.addConvenio("hi!, hi!\nhi!\n, ");
    int var36 = var27.getAvaliacaoPositiva();
    boolean var41 = var27.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var27.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var27.setConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var51 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var52 = var51.getNome();
    java.lang.String var53 = var51.getNumeroRegistro();
    int var54 = var51.getAvaliacaoPositiva();
    var51.setTipo("hi!, hi!\nhi!\n, ");
    int var57 = var51.getAvaliacaoPositiva();
    var51.addConvenio("hi!, hi!\nhi!\n, ");
    var51.setTipo("");
    model.Usuario var64 = new model.Usuario("", "");
    java.lang.String var65 = var64.getIdentificacao();
    var64.setIdentificacao("hi!");
    java.lang.String var68 = var64.getNome();
    var64.setNome("hi!");
    model.ProfissionalSaude var76 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var80 = new model.Avaliacao("", "hi!", false);
    java.lang.String var81 = var80.getIdUsuario();
    var76.addAvaliacao(var80);
    java.lang.String var83 = var80.getIdUsuario();
    boolean var84 = var64.equals((java.lang.Object)var80);
    java.lang.String var85 = var80.getIdUsuario();
    boolean var86 = var80.isAvaliacao();
    java.lang.String var87 = var80.getIdUsuario();
    java.lang.String var88 = var80.getCrm();
    var51.addAvaliacao(var80);
    var27.addAvaliacao(var80);
    java.lang.String var91 = var80.getCrm();
    java.lang.String var92 = var80.getCrm();
    var5.addAvaliacao(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!"+ "'", var81.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "hi!"+ "'", var83.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!"+ "'", var87.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + ""+ "'", var88.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + ""+ "'", var91.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + ""+ "'", var92.equals(""));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test499");


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
    var6.setIdentificacao("hi!, hi!\nhi!\n, ");
    java.lang.String var23 = var6.getIdentificacao();
    java.lang.String var24 = var6.getNome();
    java.lang.String var25 = var6.getNome();
    
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
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var24.equals("hi!, \nhi!\n, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var25.equals("hi!, \nhi!\n, hi!"));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test500");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

}
