package randoop;

import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test1");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var10 = var6.getRua();
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var17 = var16.getNome();
    java.lang.String var18 = var16.getNumeroRegistro();
    int var19 = var16.getAvaliacaoPositiva();
    var16.setTipo("hi!, hi!\nhi!\n, ");
    int var22 = var16.getAvaliacaoPositiva();
    var16.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var25 = var16.getNumeroRegistro();
    java.lang.String var26 = var16.getTipo();
    java.lang.String var27 = var16.getEspecialidade();
    java.lang.String var28 = var16.getTipo();
    boolean var29 = var6.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test2");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test3");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    var8.addConvenio("hi!, \nhi!\n, ");
    java.lang.String var22 = var8.getNome();
    java.lang.String var23 = var8.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test4");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setEspecialidade("hi!\n");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test5");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Avaliacao var11 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, ", false);
    var5.addAvaliacao(var11);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test6");


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
    var6.setSala("hi!, hi!\n\n, , \nhi!\n, ");
    
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

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test7");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test8");


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
    java.lang.String var23 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test9");


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
    boolean var39 = var20.verificaParametros("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    var20.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
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

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test10");


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
    java.lang.String var27 = var6.getEstado();
    
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
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test11");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.getNumero();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test12");


    model.Usuario var2 = new model.Usuario("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", ", \nhi!\n, hi!");

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test13");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    java.lang.String var9 = var5.getTipo();
    var5.addConvenio("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test14");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var6.toString();
    var6.setBairro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var16 = var6.getRua();
    java.lang.String var17 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var13.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var17.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test15");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNumeroRegistro();
    var5.setTipo("");
    var5.setTipo("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNome("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test16");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!\n\nhi!, ");
    var6.setEstado("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var21 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test17");


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
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getCrm();
    java.lang.String var29 = var27.getCrm();
    java.lang.String var30 = var27.getCrm();
    boolean var31 = var27.isAvaliacao();
    java.lang.String var32 = var27.getIdUsuario();
    boolean var33 = var2.equals((java.lang.Object)var32);
    var2.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test18");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    var6.setBairro(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test19");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test20");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!", "");
    java.lang.String var3 = var2.getIdentificacao();
    java.lang.String var4 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var4.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test21");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", true);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test22");


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
    int var24 = var5.getAvaliacaoPositiva();
    
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
    assertTrue(var24 == 0);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test23");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var12 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var14 = var12.equals((java.lang.Object)10L);
    var12.setCidade("hi!, \nhi!\n, ");
    boolean var17 = var5.equals((java.lang.Object)"hi!, \nhi!\n, ");
    boolean var22 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    java.lang.String var23 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var23.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test24");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!\n", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\n\n, ");

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test25");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.toString();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test26");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\n\n, ");
    model.ProfissionalSaude var10 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var11 = var10.getNome();
    java.lang.String var12 = var10.getNumeroRegistro();
    int var13 = var10.getAvaliacaoPositiva();
    var10.setTipo("hi!, hi!\nhi!\n, ");
    int var16 = var10.getAvaliacaoPositiva();
    var10.addConvenio("hi!, hi!\nhi!\n, ");
    int var19 = var10.getAvaliacaoPositiva();
    boolean var24 = var10.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var10.setRegistro("");
    var10.setTipo(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var10.addConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var31 = var2.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test27");


    model.Endereco var6 = new model.Endereco(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "");
    var6.setRua("hi!");
    var6.setRua("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test28");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\n\n, ");
    int var20 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test29");


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
    java.lang.String var38 = var6.getEstado();
    java.lang.String var39 = var6.toString();
    
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
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var39.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test30");


    model.Avaliacao var3 = new model.Avaliacao("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var6.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test31");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", "hi!");

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test32");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    model.Endereco var12 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var14 = var12.equals((java.lang.Object)10L);
    java.lang.String var15 = var12.getNumero();
    java.lang.String var16 = var12.getBairro();
    boolean var17 = var2.equals((java.lang.Object)var12);
    java.lang.String var18 = var12.getNumero();
    java.lang.String var19 = var12.getRua();
    var12.setRua(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test33");


    model.Usuario var2 = new model.Usuario("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test34");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    model.ProfissionalSaude var13 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var17 = new model.Avaliacao("", "hi!", false);
    java.lang.String var18 = var17.getIdUsuario();
    var13.addAvaliacao(var17);
    var13.setTipo("hi!, \nhi!\n, ");
    var13.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var24 = var13.getAvaliacaoNegativa();
    boolean var25 = var2.equals((java.lang.Object)var24);
    java.lang.String var26 = var2.getNome();
    model.ProfissionalSaude var32 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var36 = new model.Avaliacao("", "hi!", false);
    java.lang.String var37 = var36.getIdUsuario();
    var32.addAvaliacao(var36);
    var32.setTipo("hi!, \nhi!\n, ");
    var32.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var32.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var45 = var32.getConvenio();
    int var46 = var32.getAvaliacaoNegativa();
    boolean var47 = var2.equals((java.lang.Object)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var45.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test35");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNome();
    var5.setNome("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
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

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test36");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test37");


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
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test38");


    model.Usuario var2 = new model.Usuario("hi!", "hi!");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var10 = var9.toString();
    boolean var11 = var2.equals((java.lang.Object)var10);
    java.lang.String var12 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test39");


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
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var37 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var37 == 0);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test40");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getNumero();
    var6.setCidade("hi!, hi!\n\nhi!, ");
    java.lang.String var12 = var6.toString();
    java.lang.String var13 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , "));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test41");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Avaliacao var9 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", true);
    var5.addAvaliacao(var9);
    boolean var11 = var9.isAvaliacao();
    java.lang.String var12 = var9.getIdUsuario();
    boolean var13 = var9.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test42");


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
    java.lang.String var29 = var6.getSala();
    
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
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test43");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    var6.setSala("hi!");
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var18 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test44");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getNumero();
    var6.setSala("hi!, hi!\n\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test45");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var19 = var6.toString();
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var19.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test46");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test47");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test48");


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
    var52.setNome("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
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

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test49");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!\n, , "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \nhi!\n, , "));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test50");


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
    boolean var32 = var5.equals((java.lang.Object)"hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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
    assertTrue(var32 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test51");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var13 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var14 = var13.getEstado();
    var13.setRua("hi!, hi!\nhi!\nhi!, \n");
    boolean var17 = var6.equals((java.lang.Object)var13);
    var13.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test52");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test53");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    var15.setEstado("hi!");
    java.lang.String var20 = var15.getBairro();
    java.lang.String var21 = var15.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test54");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", "hi!, hi!\n\nhi!, ");

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test55");


    model.Endereco var6 = new model.Endereco(", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test56");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test57");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var5 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var5.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test58");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test59");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var5.setRegistro("");
    model.Usuario var22 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var22.setNome("hi!, hi!\nhi!\nhi!, ");
    var22.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    boolean var27 = var5.equals((java.lang.Object)"hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test60");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test61");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    model.ProfissionalSaude var13 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var17 = new model.Avaliacao("", "hi!", false);
    java.lang.String var18 = var17.getIdUsuario();
    var13.addAvaliacao(var17);
    var13.setTipo("hi!, \nhi!\n, ");
    var13.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var24 = var13.getAvaliacaoNegativa();
    boolean var25 = var2.equals((java.lang.Object)var24);
    java.lang.String var26 = var2.getNome();
    java.lang.String var27 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var27.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test62");


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
    java.lang.String var44 = var5.getNumeroRegistro();
    var5.setConvenio("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var44 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var44.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test63");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    int var14 = var5.getAvaliacaoNegativa();
    java.lang.String var15 = var5.getNumeroRegistro();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test64");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.toString();
    java.lang.String var14 = var6.getEstado();
    java.lang.String var15 = var6.getNumero();
    java.lang.String var16 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\n, "));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test65");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNome();
    java.lang.String var15 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
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
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test66");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    java.lang.String var15 = var5.getEspecialidade();
    var5.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test67");


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
    var5.setEspecialidade("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    
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

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test68");


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
    java.lang.String var44 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
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
    assertTrue("'" + var44 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var44.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test69");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    java.lang.String var30 = var23.getTipo();
    java.lang.String var31 = var23.getTipo();
    boolean var36 = var23.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var23.setRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var39 = var2.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var45 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var46 = var45.getNome();
    java.lang.String var47 = var45.getNumeroRegistro();
    int var48 = var45.getAvaliacaoPositiva();
    var45.setTipo("hi!, hi!\nhi!\n, ");
    int var51 = var45.getAvaliacaoPositiva();
    java.lang.String var52 = var45.getNome();
    model.Endereco var59 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var61 = var59.equals((java.lang.Object)10L);
    java.lang.String var62 = var59.getNumero();
    var59.setNumero("");
    var59.setSala("hi!");
    boolean var67 = var45.equals((java.lang.Object)"hi!");
    var45.setTipo("hi!, hi!\nhi!\n, ");
    model.Usuario var72 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var72.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var75 = var72.getIdentificacao();
    var72.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    var72.setIdentificacao("hi!, hi!\n\nhi!, ");
    java.lang.String var80 = var72.getNome();
    java.lang.String var81 = var72.getIdentificacao();
    boolean var82 = var45.equals((java.lang.Object)var81);
    model.Avaliacao var86 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    boolean var87 = var86.isAvaliacao();
    var45.addAvaliacao(var86);
    boolean var89 = var2.equals((java.lang.Object)var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var75.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var80.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var81.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test70");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test71");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test72");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    java.lang.String var11 = var6.getEstado();
    model.Endereco var18 = new model.Endereco("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    boolean var19 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    java.lang.String var20 = var6.getEstado();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Usuario var25 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var25.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var25.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var30 = var25.getNome();
    var25.setIdentificacao("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    boolean var33 = var6.equals((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var30.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test73");


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
    var5.setRegistro("hi!\n");
    
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

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test74");


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
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
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

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test75");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var17 = var5.getNome();
    java.lang.String var18 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test76");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test77");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test78");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, "));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test79");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var17 = var15.equals((java.lang.Object)10L);
    java.lang.String var18 = var15.getNumero();
    var15.setNumero("");
    java.lang.String var21 = var15.getNumero();
    java.lang.String var22 = var15.getRua();
    var15.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var25 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test80");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\n\n, ");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\n, "));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test81");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.toString();
    var6.setNumero("hi!, hi!\n\nhi!, ");
    java.lang.String var18 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var15.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test82");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test83");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", true);
    boolean var4 = var3.isAvaliacao();
    boolean var5 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test84");


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
    java.lang.String var24 = var2.getNome();
    var2.setIdentificacao(", \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\n, "));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test85");


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
    model.Avaliacao var45 = new model.Avaliacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", false);
    var5.addAvaliacao(var45);
    
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

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test86");


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
    var5.setEspecialidade("hi!, hi!\n\n, , \nhi!\n, ");
    
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

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test87");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!\n");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
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

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test88");


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
    java.lang.String var24 = var5.getNome();
    java.lang.String var25 = var5.getEspecialidade();
    
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test89");


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
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    model.ProfissionalSaude var29 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var33 = new model.Avaliacao("", "hi!", false);
    java.lang.String var34 = var33.getIdUsuario();
    var29.addAvaliacao(var33);
    var29.setNumeroRegistro("");
    var29.setConvenio("hi!, hi!\nhi!\nhi!, ");
    int var40 = var29.getAvaliacaoNegativa();
    java.lang.String var41 = var29.getEspecialidade();
    var29.setRegistro("hi!, \nhi!\n, ");
    boolean var44 = var5.equals((java.lang.Object)var29);
    
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
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test90");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    model.Usuario var18 = new model.Usuario("", "");
    java.lang.String var19 = var18.getIdentificacao();
    var18.setIdentificacao("hi!");
    java.lang.String var22 = var18.getNome();
    var18.setNome("hi!");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    java.lang.String var37 = var34.getIdUsuario();
    boolean var38 = var18.equals((java.lang.Object)var34);
    java.lang.String var39 = var34.getIdUsuario();
    boolean var40 = var34.isAvaliacao();
    java.lang.String var41 = var34.getIdUsuario();
    java.lang.String var42 = var34.getCrm();
    var5.addAvaliacao(var34);
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test91");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!\n");

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test92");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    model.Endereco var14 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var16 = var14.equals((java.lang.Object)10L);
    java.lang.String var17 = var14.getNumero();
    boolean var18 = var6.equals((java.lang.Object)var17);
    java.lang.String var19 = var6.getEstado();
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    java.lang.String var26 = var25.getEspecialidade();
    boolean var27 = var6.equals((java.lang.Object)var26);
    var6.setEstado("hi!, hi!\nhi!\nhi!, \n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test93");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var6 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test94");


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
    java.lang.String var37 = var5.getConvenio();
    
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
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test95");


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
    boolean var51 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!", "hi!, hi!\n\nhi!, ");
    boolean var56 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test96");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    model.Endereco var13 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var14 = var13.getNumero();
    var13.setRua("hi!, \nhi!\n, ");
    java.lang.String var17 = var13.toString();
    var13.setEstado("");
    boolean var20 = var2.equals((java.lang.Object)var13);
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var25 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var25.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test97");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    int var14 = var5.getAvaliacaoNegativa();
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test98");


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
    var9.setSala("hi!, hi!\nhi!\nhi!, ");
    
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

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test99");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros("", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test100");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var19 = new model.Avaliacao("", "hi!", false);
    java.lang.String var20 = var19.getCrm();
    java.lang.String var21 = var19.getCrm();
    boolean var22 = var19.isAvaliacao();
    java.lang.String var23 = var19.getCrm();
    java.lang.String var24 = var19.getCrm();
    var5.addAvaliacao(var19);
    java.lang.String var26 = var19.getCrm();
    java.lang.String var27 = var19.getIdUsuario();
    boolean var28 = var19.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test101");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \n", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test102");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var16 = var15.getNumero();
    var15.setCidade("hi!");
    boolean var19 = var6.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test103");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var23 = var6.getNumero();
    var6.setEstado("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var26 = var6.getSala();
    java.lang.String var27 = var6.toString();
    
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
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test104");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var12 = var6.toString();
    java.lang.String var13 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test105");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test106");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setNumeroRegistro("hi!");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var5.verificaParametros("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    java.lang.String var23 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test107");


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
    java.lang.String var44 = var5.getNumeroRegistro();
    java.lang.String var45 = var5.getEspecialidade();
    
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
    assertTrue("'" + var44 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var44.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test108");


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
    boolean var31 = var14.verificaParametros("hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var14.setRegistro(", \nhi!\n, hi!");
    int var34 = var14.getAvaliacaoPositiva();
    
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
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test109");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    java.lang.String var8 = var2.getNome();
    java.lang.String var9 = var2.getNome();
    java.lang.String var10 = var2.getNome();
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var17 = var16.getNome();
    java.lang.String var18 = var16.getNumeroRegistro();
    int var19 = var16.getAvaliacaoPositiva();
    var16.setTipo("hi!, hi!\nhi!\n, ");
    int var22 = var16.getAvaliacaoPositiva();
    java.lang.String var23 = var16.getNome();
    model.Endereco var30 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var32 = var30.equals((java.lang.Object)10L);
    java.lang.String var33 = var30.getNumero();
    var30.setNumero("");
    var30.setSala("hi!");
    boolean var38 = var16.equals((java.lang.Object)"hi!");
    var16.setTipo("hi!, hi!\nhi!\n, ");
    var16.setRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var43 = var16.getAvaliacaoPositiva();
    model.ProfissionalSaude var49 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var53 = new model.Avaliacao("", "hi!", false);
    java.lang.String var54 = var53.getIdUsuario();
    var49.addAvaliacao(var53);
    var49.setConvenio("hi!");
    var49.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var63 = new model.Avaliacao("", "hi!", false);
    java.lang.String var64 = var63.getCrm();
    java.lang.String var65 = var63.getCrm();
    boolean var66 = var63.isAvaliacao();
    java.lang.String var67 = var63.getCrm();
    java.lang.String var68 = var63.getCrm();
    var49.addAvaliacao(var63);
    java.lang.String var70 = var63.getCrm();
    var16.addAvaliacao(var63);
    java.lang.String var72 = var16.getNumeroRegistro();
    boolean var73 = var2.equals((java.lang.Object)var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var72.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test110");


    model.Usuario var2 = new model.Usuario("hi!", "hi!");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test111");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    java.lang.String var23 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\n, "));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test112");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var22 = var5.getNumeroRegistro();
    java.lang.String var23 = var5.getNumeroRegistro();
    var5.setNome("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    model.ProfissionalSaude var31 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getIdUsuario();
    var31.addAvaliacao(var35);
    var31.setConvenio("hi!");
    var31.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var45 = new model.Avaliacao("", "hi!", false);
    java.lang.String var46 = var45.getCrm();
    java.lang.String var47 = var45.getCrm();
    boolean var48 = var45.isAvaliacao();
    java.lang.String var49 = var45.getCrm();
    java.lang.String var50 = var45.getCrm();
    var31.addAvaliacao(var45);
    boolean var52 = var5.equals((java.lang.Object)var45);
    boolean var53 = var45.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test113");


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
    java.lang.String var35 = var6.getBairro();
    java.lang.String var36 = var6.getEstado();
    
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
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test114");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.toString();
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, "));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test115");


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
    java.lang.String var24 = var2.getNome();
    java.lang.String var25 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\n, "));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test116");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var12 = var6.getSala();
    var6.setBairro(", \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test117");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    java.lang.String var16 = var5.getEspecialidade();
    java.lang.String var17 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test118");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var15 = var5.getAvaliacaoNegativa();
    java.lang.String var16 = var5.getEspecialidade();
    java.lang.String var17 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test119");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", true);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test120");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getEspecialidade();
    var5.setConvenio("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var26 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    var5.setRegistro("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test121");


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
    java.lang.String var29 = var2.getNome();
    
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
    assertTrue("'" + var29 + "' != '" + "hi!, \nhi!\n, "+ "'", var29.equals("hi!, \nhi!\n, "));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test122");


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
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test123");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    java.lang.String var30 = var23.getTipo();
    java.lang.String var31 = var23.getTipo();
    boolean var36 = var23.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var23.setRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var39 = var2.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test124");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", true);
    java.lang.String var4 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var4.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test125");


    model.Usuario var2 = new model.Usuario("", "");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var10 = var9.getNumero();
    var9.setNumero("hi!, hi!\nhi!\nhi!, ");
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var15 = var2.equals((java.lang.Object)var9);
    var9.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var9.setRua("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var20 = var9.getBairro();
    java.lang.String var21 = var9.getEstado();
    var9.setSala("");
    java.lang.String var24 = var9.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test126");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test127");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    java.lang.String var15 = var2.getIdentificacao();
    var2.setNome("hi!");
    var2.setNome("hi!, \nhi!\n, ");
    java.lang.String var20 = var2.getIdentificacao();
    
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
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\n, "));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test128");


    model.Avaliacao var3 = new model.Avaliacao("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    java.lang.String var4 = var3.getIdUsuario();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var4.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test129");


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
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    
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

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test130");


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
    var6.setIdentificacao("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test131");


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
    boolean var80 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
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
    assertTrue(var80 == true);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test132");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \n");

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test133");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    java.lang.String var17 = var6.getBairro();
    model.Usuario var20 = new model.Usuario("", "");
    java.lang.String var21 = var20.getIdentificacao();
    var20.setIdentificacao("hi!");
    java.lang.String var24 = var20.getNome();
    var20.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var27 = var20.getIdentificacao();
    var20.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var30 = var20.getIdentificacao();
    boolean var31 = var6.equals((java.lang.Object)var30);
    var6.setEstado("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, \nhi!\n, "+ "'", var30.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test134");


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
    var25.setBairro("hi!");
    
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

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test135");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test136");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test137");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test138");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    java.lang.String var3 = var2.getIdentificacao();
    java.lang.String var4 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test139");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setEstado(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Usuario var18 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var19 = var18.getNome();
    var18.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var22 = var18.getIdentificacao();
    var18.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var25 = var18.getNome();
    boolean var26 = var6.equals((java.lang.Object)var25);
    java.lang.String var27 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var27.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test140");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getEstado();
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var16 = var6.getSala();
    
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

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test141");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test142");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test143");


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
    java.lang.String var24 = var10.getEstado();
    java.lang.String var25 = var10.toString();
    java.lang.String var26 = var10.getEstado();
    var10.setSala("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test144");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getSala();
    var6.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test145");


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
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    java.lang.String var33 = var5.getConvenio();
    
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
    assertTrue("'" + var33 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n"+ "'", var33.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test146");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    int var14 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    java.lang.String var27 = var20.getTipo();
    int var28 = var20.getAvaliacaoPositiva();
    var20.setTipo("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var31 = var20.getEspecialidade();
    model.Avaliacao var35 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var36 = var35.getCrm();
    var20.addAvaliacao(var35);
    var5.addAvaliacao(var35);
    boolean var39 = var35.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test147");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getNumero();
    var6.setCidade("hi!, hi!\n\nhi!, ");
    java.lang.String var16 = var6.getCidade();
    java.lang.String var17 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var16.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test148");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var5.getEspecialidade();
    var5.setTipo("hi!\n");
    var5.setRegistro("hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test149");


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
    var19.setConvenio("hi!\n");
    model.ProfissionalSaude var41 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var42 = var41.getNome();
    java.lang.String var43 = var41.getNumeroRegistro();
    int var44 = var41.getAvaliacaoPositiva();
    var41.setTipo("hi!, hi!\nhi!\n, ");
    int var47 = var41.getAvaliacaoPositiva();
    java.lang.String var48 = var41.getNome();
    model.Endereco var55 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var57 = var55.equals((java.lang.Object)10L);
    java.lang.String var58 = var55.getNumero();
    var55.setNumero("");
    var55.setSala("hi!");
    boolean var63 = var41.equals((java.lang.Object)"hi!");
    var41.setTipo("hi!, hi!\nhi!\n, ");
    var41.setRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var68 = var41.getAvaliacaoPositiva();
    model.ProfissionalSaude var74 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var78 = new model.Avaliacao("", "hi!", false);
    java.lang.String var79 = var78.getIdUsuario();
    var74.addAvaliacao(var78);
    var74.setConvenio("hi!");
    var74.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var88 = new model.Avaliacao("", "hi!", false);
    java.lang.String var89 = var88.getCrm();
    java.lang.String var90 = var88.getCrm();
    boolean var91 = var88.isAvaliacao();
    java.lang.String var92 = var88.getCrm();
    java.lang.String var93 = var88.getCrm();
    var74.addAvaliacao(var88);
    java.lang.String var95 = var88.getCrm();
    var41.addAvaliacao(var88);
    var19.addAvaliacao(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, \nhi!\n, "+ "'", var28.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + ""+ "'", var89.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + ""+ "'", var90.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + ""+ "'", var92.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + ""+ "'", var93.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + ""+ "'", var95.equals(""));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test150");


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
    java.lang.String var21 = var5.getConvenio();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
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
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test151");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var22 = var5.getNumeroRegistro();
    java.lang.String var23 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test152");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    java.lang.String var4 = var3.getCrm();
    boolean var5 = var3.isAvaliacao();
    boolean var6 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test153");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", true);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var5.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test154");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!\n");
    var5.setConvenio(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test155");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var15 = var5.getAvaliacaoNegativa();
    java.lang.String var16 = var5.getEspecialidade();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var19 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test156");


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
    int var39 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var39 == 0);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test157");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    var5.setEspecialidade("");
    var5.setConvenio("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test158");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    java.lang.String var12 = var5.getEspecialidade();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var20 = var5.verificaParametros("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var21 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var21 == 0);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test159");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    int var14 = var5.getAvaliacaoNegativa();
    java.lang.String var15 = var5.getConvenio();
    
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

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test160");


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
    boolean var31 = var14.verificaParametros("hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var14.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var14.setConvenio("hi!, hi!\nhi!\n, ");
    
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
    assertTrue(var31 == true);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test161");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test162");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", true);
    java.lang.String var4 = var3.getIdUsuario();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var4.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var5.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var6.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test163");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getIdUsuario();
    boolean var7 = var3.isAvaliacao();
    java.lang.String var8 = var3.getCrm();
    java.lang.String var9 = var3.getCrm();
    java.lang.String var10 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test164");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getEstado();
    boolean var22 = var6.equals((java.lang.Object)var21);
    java.lang.String var23 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var26 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test165");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test166");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var23 = var22.getNumero();
    var22.setCidade("hi!");
    model.Endereco var32 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var34 = var32.equals((java.lang.Object)10L);
    java.lang.String var35 = var32.getNumero();
    boolean var36 = var22.equals((java.lang.Object)var35);
    var22.setBairro("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var45 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var47 = var45.equals((java.lang.Object)10L);
    var45.setCidade("");
    var45.setBairro("");
    var45.setSala("hi!");
    java.lang.String var54 = var45.toString();
    model.Endereco var61 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var61.setCidade("");
    java.lang.String var64 = var61.getSala();
    var61.setCidade("hi!, \nhi!\n, ");
    boolean var67 = var45.equals((java.lang.Object)"hi!, \nhi!\n, ");
    boolean var68 = var22.equals((java.lang.Object)var45);
    boolean var69 = var6.equals((java.lang.Object)var45);
    java.lang.String var70 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!, hi!\n\n, "+ "'", var54.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test167");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \n");

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test168");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setEstado("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test169");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getCidade();
    java.lang.String var18 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var21 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test170");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    model.Usuario var11 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var12 = var5.equals((java.lang.Object)var11);
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test171");


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
    var14.setNome("");
    var14.addConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test172");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    java.lang.String var23 = var5.getTipo();
    java.lang.String var24 = var5.getTipo();
    var5.setNumeroRegistro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var29 = var5.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, "+ "'", var24.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test173");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test174");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!");
    java.lang.String var8 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test175");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var2.getIdentificacao();
    java.lang.String var7 = var2.getIdentificacao();
    java.lang.String var8 = var2.getNome();
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var15.setCidade("");
    var15.setBairro("hi!");
    var15.setSala("hi!");
    model.Usuario var24 = new model.Usuario("", "");
    java.lang.String var25 = var24.getIdentificacao();
    var24.setIdentificacao("hi!");
    var24.setIdentificacao("hi!");
    boolean var30 = var15.equals((java.lang.Object)"hi!");
    java.lang.String var31 = var15.getSala();
    java.lang.String var32 = var15.getEstado();
    java.lang.String var33 = var15.getBairro();
    boolean var34 = var2.equals((java.lang.Object)var33);
    var2.setNome("hi!, hi!\nhi!\nhi!, \n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test176");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!");

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test177");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var22 = var5.getNome();
    var5.setRegistro("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    var5.setEspecialidade(", \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test178");


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
    java.lang.String var34 = var20.getConvenio();
    var20.setNome(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    model.Endereco var43 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var45 = var43.equals((java.lang.Object)10L);
    var43.setCidade("");
    var43.setBairro("");
    var43.setCidade("hi!");
    var43.setEstado("");
    java.lang.String var54 = var43.getSala();
    java.lang.String var55 = var43.getBairro();
    java.lang.String var56 = var43.toString();
    var43.setRua("hi!, \nhi!\n, ");
    var43.setSala("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var61 = var20.equals((java.lang.Object)"hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var34.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var56.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test179");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, hi!");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var10 = var9.getNumero();
    var9.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var9.getRua();
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var9.getNumero();
    boolean var19 = var2.equals((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test180");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test181");


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
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    
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

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test182");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test183");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var2.getNome();
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    var2.setNome(", \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test184");


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
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test185");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var18 = var5.getEspecialidade();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test186");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var20 = var5.getNome();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test187");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao("hi!, hi!\n\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test188");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var7.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test189");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var16 = var6.getBairro();
    var6.setCidade("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test190");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNome();
    var5.setNome("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade(", \nhi!\n, hi!");
    
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

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test191");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var17 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getNumeroRegistro();
    int var28 = var25.getAvaliacaoPositiva();
    var25.setTipo("hi!, hi!\nhi!\n, ");
    int var31 = var25.getAvaliacaoPositiva();
    var25.addConvenio("hi!, hi!\nhi!\n, ");
    var25.setTipo("");
    int var36 = var25.getAvaliacaoPositiva();
    java.lang.String var37 = var25.getEspecialidade();
    model.ProfissionalSaude var43 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var47 = new model.Avaliacao("", "hi!", false);
    java.lang.String var48 = var47.getIdUsuario();
    var43.addAvaliacao(var47);
    var43.setNumeroRegistro("");
    java.lang.String var52 = var43.getConvenio();
    java.lang.String var53 = var43.getConvenio();
    boolean var54 = var25.equals((java.lang.Object)var53);
    int var55 = var25.getAvaliacaoNegativa();
    java.lang.String var56 = var25.getNome();
    boolean var57 = var5.equals((java.lang.Object)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var52.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var53.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test192");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var24 = var5.verificaParametros("hi!, hi!\nhi!\n, hi!", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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
    assertTrue(var24 == true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test193");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test194");


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
    java.lang.String var21 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test195");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    int var14 = var5.getAvaliacaoNegativa();
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\n, "));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test196");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!\n");
    java.lang.String var17 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test197");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test198");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.setNumeroRegistro("hi!, hi!\n\n, ");
    model.ProfissionalSaude var13 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var14 = var13.getNome();
    java.lang.String var15 = var13.getNumeroRegistro();
    int var16 = var13.getAvaliacaoPositiva();
    var13.setTipo("hi!, hi!\nhi!\n, ");
    int var19 = var13.getAvaliacaoPositiva();
    java.lang.String var20 = var13.getNome();
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var29 = var27.equals((java.lang.Object)10L);
    java.lang.String var30 = var27.getNumero();
    var27.setNumero("");
    var27.setSala("hi!");
    boolean var35 = var13.equals((java.lang.Object)"hi!");
    var13.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var43 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var47 = new model.Avaliacao("", "hi!", false);
    java.lang.String var48 = var47.getIdUsuario();
    var43.addAvaliacao(var47);
    var13.addAvaliacao(var47);
    java.lang.String var51 = var47.getIdUsuario();
    var5.addAvaliacao(var47);
    java.lang.String var53 = var47.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test199");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", true);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test200");


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
    model.ProfissionalSaude var26 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getIdUsuario();
    var26.addAvaliacao(var30);
    var26.setConvenio("hi!");
    java.lang.String var35 = var26.getConvenio();
    java.lang.String var36 = var26.getNumeroRegistro();
    java.lang.String var37 = var26.getNumeroRegistro();
    var26.setTipo("");
    var26.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var48 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var49 = var48.getNumero();
    var48.setCidade("hi!");
    model.Endereco var58 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var60 = var58.equals((java.lang.Object)10L);
    java.lang.String var61 = var58.getNumero();
    boolean var62 = var48.equals((java.lang.Object)var61);
    var48.setBairro("");
    java.lang.String var65 = var48.getBairro();
    var48.setNumero("hi!, hi!\nhi!\n, ");
    java.lang.String var68 = var48.getRua();
    var48.setEstado(", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var71 = var26.equals((java.lang.Object)", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var72 = var5.equals((java.lang.Object)var71);
    java.lang.String var73 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var73.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test201");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    java.lang.String var10 = var6.getNumero();
    var6.setBairro("hi!");
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getRua();
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test202");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("");
    var5.setEspecialidade("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test203");


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
    java.lang.String var29 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var29.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test204");


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
    model.ProfissionalSaude var43 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var47 = new model.Avaliacao("", "hi!", false);
    java.lang.String var48 = var47.getIdUsuario();
    var43.addAvaliacao(var47);
    var43.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var57 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var61 = new model.Avaliacao("", "hi!", false);
    java.lang.String var62 = var61.getIdUsuario();
    var57.addAvaliacao(var61);
    java.lang.String var64 = var57.getConvenio();
    boolean var65 = var43.equals((java.lang.Object)var57);
    boolean var66 = var14.equals((java.lang.Object)var43);
    model.Avaliacao var70 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var71 = var70.getIdUsuario();
    var43.addAvaliacao(var70);
    java.lang.String var73 = var43.getNome();
    
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
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var64.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, \nhi!\n, "+ "'", var71.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test205");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test206");


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
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
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

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test207");


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
    java.lang.String var30 = var5.getNome();
    java.lang.String var31 = var5.getTipo();
    
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

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test208");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test209");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var12.getNome();
    var12.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var21 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var22 = var21.getNome();
    java.lang.String var23 = var21.getNumeroRegistro();
    int var24 = var21.getAvaliacaoPositiva();
    var21.setTipo("hi!, hi!\nhi!\n, ");
    int var27 = var21.getAvaliacaoPositiva();
    var21.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var30 = var21.getConvenio();
    boolean var31 = var12.equals((java.lang.Object)var21);
    var12.addConvenio("hi!");
    var12.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var41 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var45 = new model.Avaliacao("", "hi!", false);
    java.lang.String var46 = var45.getIdUsuario();
    var41.addAvaliacao(var45);
    var41.setNumeroRegistro("");
    java.lang.String var50 = var41.getConvenio();
    model.Avaliacao var54 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var41.addAvaliacao(var54);
    var41.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var62 = var41.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var41.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var41.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    boolean var67 = var12.equals((java.lang.Object)var41);
    boolean var68 = var6.equals((java.lang.Object)var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var30.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var50.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test210");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", ", \nhi!\n, hi!");

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test211");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test212");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.toString();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.toString();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!"+ "'", var11.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test213");


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
    var5.setConvenio("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
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

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test214");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test215");


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
    java.lang.String var33 = var5.getEspecialidade();
    java.lang.String var34 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test216");


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
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test217");


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
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, \nhi!\n, ");
    
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

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test218");


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
    var6.setEstado("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test219");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test220");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getNome();
    java.lang.String var5 = var2.getNome();
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
    var11.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var38 = var11.getConvenio();
    java.lang.String var39 = var11.getConvenio();
    var11.setEspecialidade("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    boolean var42 = var2.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
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
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var38.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var39.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test221");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var11 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var12 = var11.isAvaliacao();
    java.lang.String var13 = var11.getCrm();
    boolean var14 = var11.isAvaliacao();
    var5.addAvaliacao(var11);
    java.lang.String var16 = var11.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test222");


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
    boolean var26 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var31 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test223");


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
    java.lang.String var27 = var6.getRua();
    var6.setRua("hi!, hi!\n\n, ");
    var6.setNumero("hi!, hi!\n\n, , \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test225");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    int var14 = var5.getAvaliacaoNegativa();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test226");


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
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getCrm();
    java.lang.String var29 = var27.getCrm();
    java.lang.String var30 = var27.getCrm();
    boolean var31 = var27.isAvaliacao();
    java.lang.String var32 = var27.getIdUsuario();
    boolean var33 = var2.equals((java.lang.Object)var32);
    var2.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Usuario var38 = new model.Usuario("", "");
    java.lang.String var39 = var38.getIdentificacao();
    var38.setIdentificacao("hi!");
    boolean var43 = var38.equals((java.lang.Object)10.0d);
    boolean var44 = var2.equals((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test227");


    model.Usuario var2 = new model.Usuario(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test228");


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
    var8.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var36 = var8.getConvenio();
    
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
    assertTrue("'" + var36 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var36.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test229");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test230");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test231");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var2.getIdentificacao();
    java.lang.String var7 = var2.getIdentificacao();
    java.lang.String var8 = var2.getNome();
    java.lang.String var9 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test232");


    model.Usuario var2 = new model.Usuario("", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    int var15 = var8.getAvaliacaoNegativa();
    var8.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var22 = var8.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var8.setEspecialidade("hi!");
    java.lang.String var25 = var8.getConvenio();
    java.lang.String var26 = var8.getNome();
    boolean var27 = var2.equals((java.lang.Object)var8);
    var2.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test233");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test234");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getNumero();
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var29 = var28.getNumero();
    var28.setCidade("hi!");
    model.Endereco var38 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var40 = var38.equals((java.lang.Object)10L);
    java.lang.String var41 = var38.getNumero();
    boolean var42 = var28.equals((java.lang.Object)var41);
    var28.setBairro("");
    java.lang.String var45 = var28.getBairro();
    var28.setNumero("hi!, hi!\nhi!\n, ");
    boolean var48 = var20.equals((java.lang.Object)var28);
    boolean var49 = var5.equals((java.lang.Object)var28);
    java.lang.String var50 = var28.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test235");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\n, ", "hi!, \nhi!\n, ");

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test236");


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
    java.lang.String var30 = var5.getTipo();
    java.lang.String var31 = var5.getEspecialidade();
    
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
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var30.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test237");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test238");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getIdUsuario();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getCrm();
    java.lang.String var8 = var3.getCrm();
    boolean var9 = var3.isAvaliacao();
    boolean var10 = var3.isAvaliacao();
    boolean var11 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test239");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getBairro();
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test240");


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
    java.lang.String var32 = var6.toString();
    
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
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!\nhi!\n, "));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test241");


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
    java.lang.String var53 = var6.getCidade();
    var6.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test242");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getBairro();
    java.lang.String var9 = var6.toString();
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ", \nhi!\n, hi!"+ "'", var9.equals(", \nhi!\n, hi!"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test243");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var12 = var6.getSala();
    var6.setRua("hi!, hi!\n\n, ");
    java.lang.String var15 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , "+ "'", var15.equals("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , "));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test244");


    model.Endereco var6 = new model.Endereco("", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var7 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test245");


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
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var27 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, \nhi!\n, hi!");
    model.Avaliacao var31 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var32 = var31.getIdUsuario();
    java.lang.String var33 = var31.getIdUsuario();
    java.lang.String var34 = var31.getCrm();
    var5.addAvaliacao(var31);
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
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
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, \nhi!\n, "+ "'", var32.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, \nhi!\n, "+ "'", var33.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test246");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test247");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", ", hi!\n\nhi!, ");

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test248");


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
    java.lang.String var49 = var25.getCidade();
    java.lang.String var50 = var25.getSala();
    
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
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test249");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test250");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Usuario var17 = new model.Usuario("hi!, \nhi!\n, ", "hi!");
    boolean var18 = var5.equals((java.lang.Object)var17);
    java.lang.String var19 = var17.getIdentificacao();
    var17.setIdentificacao("hi!, hi!\n\n, , \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test251");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getNome();
    var2.setNome("hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test252");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    java.lang.String var10 = var6.getNumero();
    var6.setBairro("hi!");
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getRua();
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getNumero();
    java.lang.String var17 = var6.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test253");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var5 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test254");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test255");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var16 = var5.getConvenio();
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test256");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var5.setTipo("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test257");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test258");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!\n", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test259");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test260");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test261");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    var15.setNumero("hi!, hi!\nhi!\nhi!, ");
    var15.setNumero(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var15.setEstado("hi!, hi!\n\n, , \nhi!\n, ");
    java.lang.String var24 = var15.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test262");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.toString();
    java.lang.String var12 = var6.getSala();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var19.setCidade("");
    java.lang.String var22 = var19.getSala();
    var19.setCidade("");
    java.lang.String var25 = var19.getRua();
    var19.setRua("hi!");
    java.lang.String var28 = var19.getRua();
    boolean var29 = var6.equals((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test263");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var10 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var10.equals("hi!, hi!\n\nhi!, "));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test264");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ");
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!\n");
    var12.setNome("hi!, hi!\nhi!\nhi!, ");
    boolean var15 = var6.equals((java.lang.Object)var12);
    var12.setTipo("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test265");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var19 = new model.Avaliacao("", "hi!", false);
    java.lang.String var20 = var19.getCrm();
    java.lang.String var21 = var19.getCrm();
    boolean var22 = var19.isAvaliacao();
    java.lang.String var23 = var19.getCrm();
    java.lang.String var24 = var19.getCrm();
    var5.addAvaliacao(var19);
    java.lang.String var26 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var29 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test266");


    model.Usuario var2 = new model.Usuario("", "");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var10 = var9.getNumero();
    var9.setNumero("hi!, hi!\nhi!\nhi!, ");
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var15 = var2.equals((java.lang.Object)var9);
    var9.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var9.setRua("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var9.setRua("hi!, \nhi!\n, hi!");
    java.lang.String var22 = var9.toString();
    var9.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test267");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var15.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test268");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var29 = new model.Avaliacao("", "hi!", false);
    java.lang.String var30 = var29.getIdUsuario();
    var25.addAvaliacao(var29);
    var25.setConvenio("hi!");
    java.lang.String var34 = var25.getConvenio();
    java.lang.String var35 = var25.getNumeroRegistro();
    java.lang.String var36 = var25.getNumeroRegistro();
    boolean var37 = var5.equals((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test269");


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
    model.ProfissionalSaude var29 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var30 = var29.getNome();
    java.lang.String var31 = var29.getNumeroRegistro();
    int var32 = var29.getAvaliacaoPositiva();
    var29.setTipo("hi!, hi!\nhi!\n, ");
    int var35 = var29.getAvaliacaoPositiva();
    var29.addConvenio("hi!, hi!\nhi!\n, ");
    var29.setTipo("");
    model.Usuario var42 = new model.Usuario("", "");
    java.lang.String var43 = var42.getIdentificacao();
    var42.setIdentificacao("hi!");
    java.lang.String var46 = var42.getNome();
    var42.setNome("hi!");
    model.ProfissionalSaude var54 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var58 = new model.Avaliacao("", "hi!", false);
    java.lang.String var59 = var58.getIdUsuario();
    var54.addAvaliacao(var58);
    java.lang.String var61 = var58.getIdUsuario();
    boolean var62 = var42.equals((java.lang.Object)var58);
    java.lang.String var63 = var58.getIdUsuario();
    boolean var64 = var58.isAvaliacao();
    java.lang.String var65 = var58.getIdUsuario();
    java.lang.String var66 = var58.getCrm();
    var29.addAvaliacao(var58);
    var5.addAvaliacao(var58);
    var5.addConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
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
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test270");


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
    model.Endereco var43 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\n\n, , \nhi!\n, ");
    boolean var44 = var5.equals((java.lang.Object)", \nhi!\n, hi!");
    
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
    assertTrue(var44 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test271");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var23 = var6.getNumero();
    java.lang.String var24 = var6.getCidade();
    java.lang.String var25 = var6.getEstado();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test272");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getNumero();
    java.lang.String var9 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test273");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    java.lang.String var17 = var6.getBairro();
    java.lang.String var18 = var6.getBairro();
    var6.setBairro("hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test274");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getTipo();
    var8.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test275");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    int var24 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var27 = var5.getNumeroRegistro();
    boolean var32 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test276");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test277");


    model.Avaliacao var3 = new model.Avaliacao("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", true);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test278");


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
    java.lang.String var59 = var55.getIdUsuario();
    
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
    assertTrue("'" + var59 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var59.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test279");


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
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test280");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", true);
    java.lang.String var4 = var3.getCrm();
    boolean var5 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var4.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test281");


    model.Usuario var2 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test282");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getNumeroRegistro();
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var18 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test283");


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
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var27 = var6.getRua();
    
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
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test284");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getCrm();
    java.lang.String var8 = var3.getCrm();
    java.lang.String var9 = var3.getCrm();
    boolean var10 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test285");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var19 = var5.getNome();
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
    java.lang.String var48 = var45.getCrm();
    boolean var49 = var5.equals((java.lang.Object)var45);
    boolean var51 = var5.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var47.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var48.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test286");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoPositiva();
    int var16 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test287");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    var2.setIdentificacao("hi!, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var5.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var6.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test288");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getNome();
    var5.setEspecialidade("hi!");
    var5.setTipo("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test289");


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
    model.ProfissionalSaude var43 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var47 = new model.Avaliacao("", "hi!", false);
    java.lang.String var48 = var47.getIdUsuario();
    var43.addAvaliacao(var47);
    var43.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var57 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var61 = new model.Avaliacao("", "hi!", false);
    java.lang.String var62 = var61.getIdUsuario();
    var57.addAvaliacao(var61);
    java.lang.String var64 = var57.getConvenio();
    boolean var65 = var43.equals((java.lang.Object)var57);
    boolean var66 = var14.equals((java.lang.Object)var43);
    var14.setCidade("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var64.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test290");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getSala();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getNumero();
    var6.setBairro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getRua();
    
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
    assertTrue("'" + var17 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var17.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test291");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, "+ "'", var3.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, "));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test292");


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
    var5.addConvenio("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test293");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test294");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getRua();
    java.lang.String var12 = var6.getCidade();
    var6.setEstado(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getCidade();
    java.lang.String var16 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test295");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.toString();
    java.lang.String var11 = var6.toString();
    var6.setEstado("hi!, hi!\nhi!\nhi!, ");
    var6.setSala("hi!");
    java.lang.String var16 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test296");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    java.lang.String var11 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test297");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test298");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setRua("hi!");
    java.lang.String var15 = var6.getEstado();
    java.lang.String var16 = var6.toString();
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, , \nhi!\n, ");
    boolean var23 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test299");


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
    var5.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test300");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    java.lang.String var13 = var6.getBairro();
    java.lang.String var14 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test301");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNome();
    var5.setNome("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    
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

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test302");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test303");


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
    java.lang.String var40 = var9.getBairro();
    
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
    assertTrue("'" + var40 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var40.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test304");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getSala();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getNumero();
    java.lang.String var15 = var6.getSala();
    var6.setRua(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var18 = var6.getRua();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var18.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test305");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getConvenio();
    int var21 = var8.getAvaliacaoNegativa();
    java.lang.String var22 = var8.getEspecialidade();
    var8.setEspecialidade("hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!\n"+ "'", var20.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test306");


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
    java.lang.String var64 = var62.getCrm();
    
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
    assertTrue("'" + var64 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var64.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test307");


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
    var5.addConvenio("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
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

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test308");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    java.lang.String var13 = var6.getBairro();
    java.lang.String var14 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test309");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var11 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var12 = var11.getNumero();
    var11.setCidade("hi!");
    java.lang.String var15 = var11.getBairro();
    var11.setEstado("hi!, \nhi!\n, ");
    var11.setRua("");
    java.lang.String var20 = var11.toString();
    var11.setCidade("hi!, hi!\nhi!\nhi!, ");
    var11.setNumero("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    var30.setTipo("hi!, \nhi!\n, ");
    var30.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var30.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var46 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var30.addAvaliacao(var46);
    boolean var52 = var30.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "", "hi!, hi!\nhi!\n, ");
    boolean var53 = var11.equals((java.lang.Object)"hi!, hi!\nhi!\n, ");
    java.lang.String var54 = var11.getCidade();
    boolean var55 = var2.equals((java.lang.Object)var11);
    var2.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var20.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var54.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test310");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    java.lang.String var18 = var8.getConvenio();
    int var19 = var8.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test311");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!");
    java.lang.String var6 = var5.getEspecialidade();
    java.lang.String var7 = var5.getEspecialidade();
    java.lang.String var8 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var8.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test312");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getNumeroRegistro();
    java.lang.String var15 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test313");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", true);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test314");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getConvenio();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test315");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    var6.setNumero("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getNumero();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test316");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!");
    int var17 = var5.getAvaliacaoPositiva();
    boolean var22 = var5.verificaParametros("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("", "hi!", false);
    java.lang.String var33 = var32.getIdUsuario();
    var28.addAvaliacao(var32);
    var28.setConvenio("hi!");
    java.lang.String var37 = var28.getConvenio();
    java.lang.String var38 = var28.getNumeroRegistro();
    java.lang.String var39 = var28.getNumeroRegistro();
    var28.setTipo("");
    var28.setTipo("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var44 = var5.equals((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test317");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", false);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var4.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test318");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("hi!, hi!\n\nhi!, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test319");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getTipo();
    var5.setTipo(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test320");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\n, ");
    model.Usuario var14 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var15 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test321");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    model.Endereco var14 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var16 = var14.equals((java.lang.Object)10L);
    java.lang.String var17 = var14.getNumero();
    boolean var18 = var6.equals((java.lang.Object)var17);
    java.lang.String var19 = var6.getEstado();
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    java.lang.String var26 = var25.getEspecialidade();
    boolean var27 = var6.equals((java.lang.Object)var26);
    java.lang.String var28 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\n, "));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test322");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getRua();
    java.lang.String var12 = var6.getCidade();
    var6.setEstado(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getEstado();
    java.lang.String var16 = var6.getEstado();
    var6.setCidade("hi!");
    java.lang.String var19 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var16.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test323");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var21 = var6.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var24 = var6.getBairro();
    var6.setSala("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test324");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getBairro();
    java.lang.String var12 = var6.getNumero();
    
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

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test325");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var6.getNumero();
    var6.setSala(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var12 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test326");


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
    java.lang.String var34 = var15.getCidade();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test327");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var8.getNome();
    var8.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var12 = var2.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var2.setNome("");
    model.Endereco var21 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var22 = var21.getNumero();
    var21.setCidade("hi!");
    java.lang.String var25 = var21.getBairro();
    var21.setEstado("hi!, \nhi!\n, ");
    var21.setRua("");
    model.Endereco var36 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var37 = var36.getNumero();
    var36.setCidade("hi!");
    java.lang.String var40 = var36.getRua();
    java.lang.String var41 = var36.getSala();
    boolean var42 = var21.equals((java.lang.Object)var41);
    var21.setBairro("");
    java.lang.String var45 = var21.toString();
    java.lang.String var46 = var21.getNumero();
    var21.setCidade(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var21.setRua("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    boolean var51 = var2.equals((java.lang.Object)var21);
    java.lang.String var52 = var2.getIdentificacao();
    java.lang.String var53 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var45.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var52.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var53.equals("hi!, hi!\nhi!\n, "));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test328");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!");
    java.lang.String var8 = var5.getConvenio();
    java.lang.String var9 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test329");


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
    var6.setBairro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test331");


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
    var5.setConvenio("hi!");
    var5.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var22 = var5.getEspecialidade();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test332");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test333");


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
    var25.setEspecialidade("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var41 = var25.getConvenio();
    
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
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var41.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test334");


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
    model.ProfissionalSaude var36 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var40 = new model.Avaliacao("", "hi!", false);
    java.lang.String var41 = var40.getIdUsuario();
    var36.addAvaliacao(var40);
    var36.setConvenio("hi!");
    java.lang.String var45 = var36.getTipo();
    java.lang.String var46 = var36.getNumeroRegistro();
    boolean var47 = var2.equals((java.lang.Object)var46);
    
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
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test335");


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
    java.lang.String var25 = var5.getEspecialidade();
    
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
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test336");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var6.getCidade();
    var6.setSala(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test337");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", true);
    boolean var4 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test338");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test339");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getNumero();
    var20.setCidade("hi!");
    model.Endereco var30 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var32 = var30.equals((java.lang.Object)10L);
    java.lang.String var33 = var30.getNumero();
    boolean var34 = var20.equals((java.lang.Object)var33);
    var20.setBairro("");
    java.lang.String var37 = var20.getNumero();
    java.lang.String var38 = var20.getBairro();
    boolean var39 = var5.equals((java.lang.Object)var38);
    java.lang.String var40 = var5.getTipo();
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var40.equals("hi!, hi!\nhi!\n, "));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test340");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var9 = var6.getNumero();
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var16.setSala("hi!, hi!\nhi!\n, ");
    var16.setBairro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var21 = var6.equals((java.lang.Object)", hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test341");


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
    model.Avaliacao var29 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", true);
    var5.addAvaliacao(var29);
    java.lang.String var31 = var5.getConvenio();
    java.lang.String var32 = var5.getNome();
    
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
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var31.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test342");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    java.lang.String var21 = var6.getBairro();
    var6.setEstado("hi!, hi!\n\nhi!, ");
    
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

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test343");


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
    var6.setBairro("");
    java.lang.String var30 = var6.toString();
    java.lang.String var31 = var6.getNumero();
    java.lang.String var32 = var6.getBairro();
    
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
    assertTrue("'" + var30 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var30.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test344");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoPositiva();
    int var16 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var19 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var19.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test345");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    boolean var5 = var3.isAvaliacao();
    java.lang.String var6 = var3.getIdUsuario();
    boolean var7 = var3.isAvaliacao();
    java.lang.String var8 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test346");


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
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var28 = new model.Avaliacao("", "hi!", false);
    java.lang.String var29 = var28.getIdUsuario();
    var24.addAvaliacao(var28);
    var24.setConvenio("hi!");
    var24.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var38 = new model.Avaliacao("", "hi!", false);
    java.lang.String var39 = var38.getCrm();
    java.lang.String var40 = var38.getCrm();
    boolean var41 = var38.isAvaliacao();
    java.lang.String var42 = var38.getCrm();
    java.lang.String var43 = var38.getCrm();
    var24.addAvaliacao(var38);
    java.lang.String var45 = var38.getIdUsuario();
    java.lang.String var46 = var38.getCrm();
    java.lang.String var47 = var38.getIdUsuario();
    boolean var48 = var6.equals((java.lang.Object)var47);
    
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
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test347");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var6.setBairro("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test348");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!"+ "'", var10.equals(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!"));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test349");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var17 = var6.toString();
    var6.setSala("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"+ "'", var17.equals("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test350");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getConvenio();
    model.Avaliacao var22 = new model.Avaliacao("", "hi!", false);
    java.lang.String var23 = var22.getCrm();
    java.lang.String var24 = var22.getCrm();
    java.lang.String var25 = var22.getCrm();
    boolean var26 = var22.isAvaliacao();
    boolean var27 = var22.isAvaliacao();
    var5.addAvaliacao(var22);
    int var29 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test351");


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
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var45 = var5.getTipo();
    java.lang.String var46 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test352");


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
    var6.setRua("hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var43 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var44 = var43.getCrm();
    java.lang.String var45 = var43.getCrm();
    java.lang.String var46 = var43.getIdUsuario();
    boolean var47 = var6.equals((java.lang.Object)var43);
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!, \nhi!\n, "+ "'", var44.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, \nhi!\n, "+ "'", var45.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var46.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test353");


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
    java.lang.String var44 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    int var47 = var5.getAvaliacaoNegativa();
    var5.setRegistro(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    
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
    assertTrue("'" + var44 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var44.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test354");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test355");


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
    var5.setEspecialidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\n\nhi!, ");
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test356");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!");
    var5.setRegistro("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var19 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test357");


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
    var5.setRegistro("hi!, hi!\n\n, ");
    var5.setTipo(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    int var37 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var37 == 0);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test358");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test359");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    model.Usuario var13 = new model.Usuario("hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var14 = var13.getNome();
    boolean var15 = var6.equals((java.lang.Object)var14);
    java.lang.String var16 = var6.getNumero();
    var6.setSala("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var19 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!\n"+ "'", var19.equals("hi!\n"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test360");


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
    java.lang.String var49 = var40.getCidade();
    
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
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test361");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var12 = var6.getEstado();
    var6.setBairro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test362");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, "));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test363");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test364");


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
    java.lang.String var27 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, \nhi!\n, "+ "'", var27.equals("hi!, \nhi!\n, "));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test365");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    java.lang.String var13 = var6.getSala();
    var6.setCidade("hi!, \nhi!\n, ");
    var6.setCidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setSala(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var20 = var6.toString();
    java.lang.String var21 = var6.toString();
    var6.setBairro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var24 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "+ "'", var20.equals("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "+ "'", var21.equals("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test366");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var6 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, "));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test367");


    model.Endereco var6 = new model.Endereco("", "", "", "", "hi!", "");
    var6.setCidade("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    var6.setCidade("hi!\n");

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test368");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    java.lang.String var13 = var6.getBairro();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var13.equals("hi!, hi!\n\nhi!, "));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test369");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getNumero();
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test370");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    var6.setRua(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test371");


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
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
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

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test372");


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
    java.lang.String var30 = var5.getNome();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test373");


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
    model.ProfissionalSaude var27 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var31 = new model.Avaliacao("", "hi!", false);
    java.lang.String var32 = var31.getIdUsuario();
    var27.addAvaliacao(var31);
    var27.setNumeroRegistro("");
    java.lang.String var36 = var27.getConvenio();
    model.Avaliacao var40 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var27.addAvaliacao(var40);
    var27.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var27.setNome("hi!, \nhi!\n, ");
    boolean var46 = var2.equals((java.lang.Object)var27);
    java.lang.String var47 = var27.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var36.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!, \nhi!\n, "+ "'", var47.equals("hi!, \nhi!\n, "));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test374");


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
    int var27 = var14.getAvaliacaoNegativa();
    var14.setEspecialidade("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue(var27 == 0);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test375");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var5.getNome();
    var5.setTipo("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test376");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test377");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    java.lang.String var15 = var6.toString();
    model.Endereco var22 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var24 = var22.equals((java.lang.Object)10L);
    java.lang.String var25 = var22.getNumero();
    java.lang.String var26 = var22.getBairro();
    var22.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var29 = var6.equals((java.lang.Object)var22);
    java.lang.String var30 = var22.getRua();
    var22.setRua("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test378");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test379");


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
    var5.setRegistro("hi!, hi!\n\n, ");
    var5.setTipo(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var33 = var5.getNome();
    model.ProfissionalSaude var39 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var40 = var39.getNome();
    java.lang.String var41 = var39.getNumeroRegistro();
    int var42 = var39.getAvaliacaoPositiva();
    var39.setTipo("hi!, hi!\nhi!\n, ");
    int var45 = var39.getAvaliacaoPositiva();
    var39.addConvenio("hi!, hi!\nhi!\n, ");
    var39.setTipo("");
    model.Usuario var52 = new model.Usuario("", "");
    java.lang.String var53 = var52.getIdentificacao();
    var52.setIdentificacao("hi!");
    java.lang.String var56 = var52.getNome();
    var52.setNome("hi!");
    model.ProfissionalSaude var64 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var68 = new model.Avaliacao("", "hi!", false);
    java.lang.String var69 = var68.getIdUsuario();
    var64.addAvaliacao(var68);
    java.lang.String var71 = var68.getIdUsuario();
    boolean var72 = var52.equals((java.lang.Object)var68);
    java.lang.String var73 = var68.getIdUsuario();
    boolean var74 = var68.isAvaliacao();
    java.lang.String var75 = var68.getIdUsuario();
    java.lang.String var76 = var68.getCrm();
    var39.addAvaliacao(var68);
    boolean var78 = var5.equals((java.lang.Object)var39);
    int var79 = var39.getAvaliacaoPositiva();
    
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
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + ""+ "'", var76.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test380");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getNome();
    var2.setNome("hi!\n");
    java.lang.String var7 = var2.getIdentificacao();
    java.lang.String var8 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, "));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test381");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test382");


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
    boolean var28 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    
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
    assertTrue(var28 == true);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test383");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test384");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test385");


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
    model.Usuario var48 = new model.Usuario("", "");
    java.lang.String var49 = var48.getIdentificacao();
    var48.setIdentificacao("hi!");
    java.lang.String var52 = var48.getNome();
    var48.setNome("hi!");
    model.ProfissionalSaude var60 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var64 = new model.Avaliacao("", "hi!", false);
    java.lang.String var65 = var64.getIdUsuario();
    var60.addAvaliacao(var64);
    java.lang.String var67 = var64.getIdUsuario();
    boolean var68 = var48.equals((java.lang.Object)var64);
    boolean var69 = var64.isAvaliacao();
    var5.addAvaliacao(var64);
    java.lang.String var71 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var71.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test386");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test387");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!\n");
    java.lang.String var6 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!\n"+ "'", var6.equals("hi!\n"));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test388");


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
    boolean var36 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var29.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test389");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getTipo();
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Usuario var19 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var19.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var29 = var28.getNumero();
    var28.setCidade("hi!");
    model.Endereco var38 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var40 = var38.equals((java.lang.Object)10L);
    java.lang.String var41 = var38.getNumero();
    boolean var42 = var28.equals((java.lang.Object)var41);
    var28.setBairro("");
    java.lang.String var45 = var28.getNumero();
    java.lang.String var46 = var28.getBairro();
    model.Avaliacao var50 = new model.Avaliacao("", "hi!", false);
    java.lang.String var51 = var50.getCrm();
    boolean var52 = var50.isAvaliacao();
    java.lang.String var53 = var50.getIdUsuario();
    boolean var54 = var28.equals((java.lang.Object)var50);
    boolean var55 = var50.isAvaliacao();
    boolean var56 = var50.isAvaliacao();
    boolean var57 = var19.equals((java.lang.Object)var50);
    var5.addAvaliacao(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test390");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!\n\nhi!, ");
    var6.setSala("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var19 = var6.getEstado();
    java.lang.String var20 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var19.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test391");


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
    var6.setEstado("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var6.setSala("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    var6.setEstado(", hi!\n\nhi!, ");
    
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

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test392");


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
    model.Avaliacao var29 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!", false);
    boolean var30 = var29.isAvaliacao();
    boolean var31 = var29.isAvaliacao();
    var8.addAvaliacao(var29);
    var8.setConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test393");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var18 = var5.getNome();
    int var19 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test394");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test395");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test396");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var20 = var5.getNome();
    java.lang.String var21 = var5.getNome();
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test397");


    model.Usuario var2 = new model.Usuario("hi!", "hi!");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var10 = var9.toString();
    boolean var11 = var2.equals((java.lang.Object)var10);
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test398");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test399");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoNegativa();
    java.lang.String var14 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test400");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    var6.setNumero(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var17 = var6.toString();
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, "+ "'", var17.equals("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, "));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test401");


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
    int var31 = var14.getAvaliacaoPositiva();
    var14.setEspecialidade("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
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
    assertTrue(var31 == 0);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test402");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var6.setEstado(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test403");


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
    java.lang.String var51 = var6.getBairro();
    model.Endereco var58 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var59 = var58.getCidade();
    boolean var60 = var6.equals((java.lang.Object)var58);
    var6.setNumero("hi!, hi!\nhi!\n, hi!");
    
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
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var51.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var59.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test404");


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
    java.lang.String var49 = var6.getRua();
    
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
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test405");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test406");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var11 = var6.getCidade();
    java.lang.String var12 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test407");


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
    var25.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test408");


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
    java.lang.String var46 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var46 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var46.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test409");


    model.Endereco var6 = new model.Endereco(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test410");


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
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test411");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\n\n, , \nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test412");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getIdUsuario();
    java.lang.String var7 = var3.getCrm();
    boolean var8 = var3.isAvaliacao();
    java.lang.String var9 = var3.getCrm();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, "));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test413");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var5.getNome();
    model.Avaliacao var12 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", false);
    boolean var13 = var12.isAvaliacao();
    var5.addAvaliacao(var12);
    java.lang.String var15 = var12.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test414");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var6.getCidade();
    var6.setRua("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test415");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test416");


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
    java.lang.String var23 = var8.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test417");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getBairro();
    var6.setBairro("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test418");


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
    java.lang.String var34 = var5.getEspecialidade();
    var5.setNome("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test419");


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
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var47 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!");
    
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
    assertTrue("'" + var47 + "' != '" + "hi!, \nhi!\n, "+ "'", var47.equals("hi!, \nhi!\n, "));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test420");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.getSala();
    var6.setEstado("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, \nhi!\n, "+ "'", var8.equals("hi!, \nhi!\n, "));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test421");


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
    var5.setNumeroRegistro("hi!\n");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var35 = var5.getConvenio();
    
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
    assertTrue("'" + var35 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var35.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test422");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    java.lang.String var18 = var15.getCidade();
    java.lang.String var19 = var15.getCidade();
    var15.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test423");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test424");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getCrm();
    java.lang.String var7 = var3.getIdUsuario();
    java.lang.String var8 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test425");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    int var14 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    java.lang.String var17 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var17.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test426");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    var6.setCidade("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test427");


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
    java.lang.String var26 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test428");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, hi!", "hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var8 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test429");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    model.Usuario var22 = new model.Usuario("", "");
    java.lang.String var23 = var22.getIdentificacao();
    var22.setIdentificacao("hi!");
    java.lang.String var26 = var22.getNome();
    var22.setNome("hi!");
    model.ProfissionalSaude var34 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var38 = new model.Avaliacao("", "hi!", false);
    java.lang.String var39 = var38.getIdUsuario();
    var34.addAvaliacao(var38);
    java.lang.String var41 = var38.getIdUsuario();
    boolean var42 = var22.equals((java.lang.Object)var38);
    java.lang.String var43 = var38.getIdUsuario();
    boolean var44 = var38.isAvaliacao();
    var5.addAvaliacao(var38);
    boolean var50 = var5.verificaParametros("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    model.Avaliacao var54 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    boolean var55 = var54.isAvaliacao();
    java.lang.String var56 = var54.getCrm();
    boolean var57 = var5.equals((java.lang.Object)var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test430");


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
    var5.setRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test431");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoNegativa();
    java.lang.String var16 = var5.getNumeroRegistro();
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test432");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", \nhi!\n, hi!");

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test433");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    var5.setTipo("hi!, hi!\n\n, ");
    java.lang.String var16 = var5.getNome();
    int var17 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test434");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    java.lang.String var18 = var15.getCidade();
    var15.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
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

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test435");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var10 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test436");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var6.getRua();
    java.lang.String var16 = var6.getEstado();
    java.lang.String var17 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test437");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var5.getConvenio();
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var12 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test438");


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
    int var20 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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
    assertTrue(var20 == 1);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test439");


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
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getCrm();
    java.lang.String var29 = var27.getCrm();
    java.lang.String var30 = var27.getCrm();
    boolean var31 = var27.isAvaliacao();
    java.lang.String var32 = var27.getIdUsuario();
    boolean var33 = var2.equals((java.lang.Object)var32);
    java.lang.String var34 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var34.equals("hi!, hi!\nhi!\n, "));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test440");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setSala("hi!, hi!\n\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test441");


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
    var5.addConvenio("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test442");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    int var6 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test443");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getIdUsuario();
    java.lang.String var6 = var3.getCrm();
    boolean var7 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test444");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.toString();
    var6.setRua("hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var15.equals("hi!, hi!\n\nhi!, "));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test445");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    var2.setNome("hi!, \nhi!\n, ");
    var2.setIdentificacao("");
    var2.setNome("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    java.lang.String var21 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test446");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    java.lang.String var22 = var5.getConvenio();
    int var23 = var5.getAvaliacaoNegativa();
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var22.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test447");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    model.Endereco var17 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var17.setRua("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var6.equals((java.lang.Object)var17);
    java.lang.String var21 = var17.getEstado();
    var17.setRua("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    var17.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test448");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\n\n, ");
    model.Endereco var11 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var11.getCidade();
    java.lang.String var13 = var11.getBairro();
    boolean var14 = var2.equals((java.lang.Object)var13);
    java.lang.String var15 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test449");


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
    model.ProfissionalSaude var65 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var69 = new model.Avaliacao("", "hi!", false);
    java.lang.String var70 = var69.getIdUsuario();
    var65.addAvaliacao(var69);
    var65.setConvenio("hi!");
    java.lang.String var74 = var65.getTipo();
    model.ProfissionalSaude var80 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var84 = new model.Avaliacao("", "hi!", false);
    java.lang.String var85 = var84.getIdUsuario();
    var80.addAvaliacao(var84);
    var65.addAvaliacao(var84);
    boolean var88 = var5.equals((java.lang.Object)var65);
    var5.setNumeroRegistro("hi!, hi!\n\n, ");
    var5.addConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!"+ "'", var74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test450");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!");
    java.lang.String var18 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test451");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test452");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test453");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    var6.setNumero("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var15 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test454");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", false);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test455");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var2.getIdentificacao();
    model.Avaliacao var10 = new model.Avaliacao("", "hi!", false);
    boolean var11 = var2.equals((java.lang.Object)"hi!");
    java.lang.String var12 = var2.getNome();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test456");


    model.Usuario var2 = new model.Usuario(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test457");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test458");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getTipo();
    var5.setNome("hi!, hi!\nhi!\n, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var20 = var5.getTipo();
    
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
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\n, "));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test459");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    var2.setIdentificacao("hi!, hi!\n\nhi!, ");
    java.lang.String var10 = var2.getNome();
    model.ProfissionalSaude var16 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var17 = var16.getNome();
    java.lang.String var18 = var16.getNumeroRegistro();
    int var19 = var16.getAvaliacaoPositiva();
    var16.setTipo("hi!, hi!\nhi!\n, ");
    int var22 = var16.getAvaliacaoPositiva();
    var16.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var25 = var16.getNumeroRegistro();
    java.lang.String var26 = var16.getTipo();
    java.lang.String var27 = var16.getEspecialidade();
    java.lang.String var28 = var16.getTipo();
    var16.setConvenio("hi!");
    var16.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var33 = var2.equals((java.lang.Object)"hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var34 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var34.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test460");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getCrm();
    java.lang.String var8 = var3.getCrm();
    boolean var9 = var3.isAvaliacao();
    boolean var10 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test461");


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
    java.lang.String var31 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    
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

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test462");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test463");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getIdUsuario();
    java.lang.String var8 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test464");


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
    java.lang.String var24 = var10.getEstado();
    java.lang.String var25 = var10.getSala();
    java.lang.String var26 = var10.getEstado();
    
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
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test465");


    model.Avaliacao var3 = new model.Avaliacao(", \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", false);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test466");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getConvenio();
    var5.setRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getNumeroRegistro();
    var5.addConvenio("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test467");


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
    java.lang.String var27 = var2.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test468");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var16 = var5.getTipo();
    var5.setEspecialidade("hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test469");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test470");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!\n", "hi!, hi!\n\n, ", "", "");
    java.lang.String var20 = var5.getConvenio();
    java.lang.String var21 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test471");


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
    var6.setSala(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
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

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test472");


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
    java.lang.String var30 = var14.getNumeroRegistro();
    
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
    assertTrue("'" + var30 + "' != '" + "hi!, \nhi!\n, "+ "'", var30.equals("hi!, \nhi!\n, "));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test473");


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
    java.lang.String var34 = var6.getNumero();
    java.lang.String var35 = var6.getSala();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test474");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    java.lang.String var15 = var5.getTipo();
    java.lang.String var16 = var5.getEspecialidade();
    model.Usuario var19 = new model.Usuario("", "");
    java.lang.String var20 = var19.getIdentificacao();
    var19.setIdentificacao("hi!");
    java.lang.String var23 = var19.getNome();
    var19.setNome("hi!");
    model.ProfissionalSaude var31 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getIdUsuario();
    var31.addAvaliacao(var35);
    java.lang.String var38 = var35.getIdUsuario();
    boolean var39 = var19.equals((java.lang.Object)var35);
    java.lang.String var40 = var35.getIdUsuario();
    var5.addAvaliacao(var35);
    var5.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test475");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test476");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setNumeroRegistro("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test477");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setTipo("");
    var5.setRegistro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getEspecialidade();
    model.Avaliacao var22 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    var5.addAvaliacao(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test478");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setNumeroRegistro("hi!");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.setRegistro("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test479");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var15.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var15.getRua();
    var15.setSala("hi!, hi!\nhi!\nhi!, ");
    var15.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var23 = var6.equals((java.lang.Object)var15);
    java.lang.String var24 = var15.getCidade();
    model.Endereco var31 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var33 = var31.equals((java.lang.Object)10L);
    java.lang.String var34 = var31.getNumero();
    var31.setNumero("");
    java.lang.String var37 = var31.getSala();
    var31.setNumero("hi!");
    java.lang.String var40 = var31.getBairro();
    var31.setSala("hi!");
    java.lang.String var43 = var31.getRua();
    java.lang.String var44 = var31.toString();
    java.lang.String var45 = var31.getEstado();
    boolean var46 = var15.equals((java.lang.Object)var31);
    var15.setSala("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var15.setEstado("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var44.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test480");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test481");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    java.lang.String var4 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var4.equals("hi!, hi!\nhi!\n, "));

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test482");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.toString();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setSala("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test483");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var12 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var14 = var12.equals((java.lang.Object)10L);
    var12.setCidade("hi!, \nhi!\n, ");
    boolean var17 = var5.equals((java.lang.Object)"hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getNome();
    java.lang.String var19 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, \nhi!\n, "+ "'", var18.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, "));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test484");


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
    java.lang.String var47 = var6.getEstado();
    
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
    assertTrue("'" + var47 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var47.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test485");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    java.lang.String var21 = var6.getBairro();
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var28.setCidade("");
    var28.setBairro("hi!");
    var28.setSala("hi!");
    java.lang.String var35 = var28.getRua();
    boolean var36 = var6.equals((java.lang.Object)var35);
    java.lang.String var37 = var6.getEstado();
    
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
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test486");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getIdUsuario();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test487");


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
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test488");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    int var24 = var5.getAvaliacaoNegativa();
    int var25 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var34 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var35 = var34.getNumero();
    var34.setCidade("hi!");
    java.lang.String var38 = var34.getCidade();
    var34.setBairro("hi!, hi!\n\nhi!, ");
    model.Endereco var47 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var48 = var47.getNumero();
    model.Endereco var55 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var56 = var55.getNumero();
    var55.setCidade("hi!");
    model.Endereco var65 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var67 = var65.equals((java.lang.Object)10L);
    java.lang.String var68 = var65.getNumero();
    boolean var69 = var55.equals((java.lang.Object)var68);
    var55.setBairro("");
    java.lang.String var72 = var55.getBairro();
    var55.setNumero("hi!, hi!\nhi!\n, ");
    boolean var75 = var47.equals((java.lang.Object)var55);
    var55.setBairro("");
    boolean var78 = var34.equals((java.lang.Object)var55);
    var34.setBairro(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    model.Endereco var87 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var88 = var87.getSala();
    java.lang.String var89 = var87.getSala();
    boolean var90 = var34.equals((java.lang.Object)var87);
    boolean var91 = var5.equals((java.lang.Object)var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + ""+ "'", var72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + ""+ "'", var88.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + ""+ "'", var89.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test489");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var15 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test490");


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
    model.Avaliacao var35 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var36 = var35.isAvaliacao();
    java.lang.String var37 = var35.getCrm();
    var5.addAvaliacao(var35);
    
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
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test491");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test492");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    java.lang.String var13 = var5.getEspecialidade();
    var5.addConvenio("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test493");


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
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var31 = var6.getNumero();
    
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
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test494");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\nhi!, ");

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test495");


    model.Endereco var6 = new model.Endereco("", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test496");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getEstado();
    boolean var22 = var6.equals((java.lang.Object)var21);
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var25 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test497");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    int var20 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.Endereco var29 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var29.setCidade("");
    java.lang.String var32 = var29.getSala();
    var29.setCidade("");
    var29.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var43 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var44 = var43.getEstado();
    boolean var45 = var29.equals((java.lang.Object)var44);
    var29.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var48 = var29.getEstado();
    var29.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var51 = var29.getRua();
    boolean var52 = var5.equals((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var48.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test498");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var7 = var6.getEstado();
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var7.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test499");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    java.lang.String var10 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test500");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");

  }

}
