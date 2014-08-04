package randoop;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


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
    var5.setNumeroRegistro("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
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

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


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
    var5.setNumeroRegistro("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.toString();
    java.lang.String var11 = var6.getEstado();
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getCidade();
    java.lang.String var10 = var6.getCidade();
    java.lang.String var11 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("hi!");
    java.lang.String var15 = var6.getBairro();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var18 = var6.getSala();
    var6.setRua("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


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
    var5.setRegistro("hi!, hi!\n\nhi!, ");
    java.lang.String var22 = var5.getTipo();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, "));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setRua("hi!, \nhi!\n, ");
    java.lang.String var10 = var6.toString();
    var6.setCidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var13 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, "));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


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
    var5.setTipo("hi!, hi!\n\n, ");
    
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

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var6 = var5.getAvaliacaoNegativa();
    int var7 = var5.getAvaliacaoPositiva();
    java.lang.String var8 = var5.getNome();
    boolean var13 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


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
    var8.addConvenio("hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!\n"+ "'", var20.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getCrm();
    java.lang.String var8 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, \nhi!\n, "+ "'", var8.equals("hi!, \nhi!\n, "));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var16 = var5.getEspecialidade();
    var5.setNome("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


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
    java.lang.String var40 = var6.getSala();
    java.lang.String var41 = var6.getBairro();
    
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
    assertTrue("'" + var41 + "' != '" + ", hi!\n\nhi!, "+ "'", var41.equals(", hi!\n\nhi!, "));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, "));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


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
    java.lang.String var46 = var5.getEspecialidade();
    
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
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


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
    java.lang.String var20 = var12.getSala();
    java.lang.String var21 = var12.getRua();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


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
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    
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

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    boolean var9 = var5.equals((java.lang.Object)(byte)100);
    var5.addConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


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
    var6.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


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
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    java.lang.String var15 = var9.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


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
    java.lang.String var59 = var55.getCrm();
    
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
    assertTrue("'" + var59 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var59.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


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
    java.lang.String var29 = var14.getTipo();
    var14.setRegistro(", hi!\n\nhi!, ");
    
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
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var29.equals("hi!, hi!\nhi!\n, "));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var4.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setEstado("hi!\n");
    var6.setRua("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var11 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\n, ");

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var26.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ", false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", true);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, ", true);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "+ "'", var5.equals("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


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
    boolean var46 = var38.isAvaliacao();
    
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
    assertTrue(var46 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!");
    int var17 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var10 = var5.verificaParametros("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


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
    int var19 = var5.getAvaliacaoPositiva();
    
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
    assertTrue(var19 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    int var11 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \n");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \n");
    model.Avaliacao var20 = new model.Avaliacao("", "hi!", false);
    java.lang.String var21 = var20.getCrm();
    java.lang.String var22 = var20.getIdUsuario();
    boolean var23 = var20.isAvaliacao();
    var5.addAvaliacao(var20);
    java.lang.String var25 = var20.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


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
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
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

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var18 = new model.Avaliacao("", "hi!", false);
    java.lang.String var19 = var18.getIdUsuario();
    var14.addAvaliacao(var18);
    var14.setTipo("hi!, \nhi!\n, ");
    var14.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var25 = var14.getAvaliacaoNegativa();
    java.lang.String var26 = var14.getTipo();
    java.lang.String var27 = var14.getNumeroRegistro();
    int var28 = var14.getAvaliacaoNegativa();
    var14.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var31 = var14.getTipo();
    boolean var32 = var2.equals((java.lang.Object)var14);
    int var33 = var14.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, \nhi!\n, "+ "'", var31.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


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
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    int var33 = var5.getAvaliacaoPositiva();
    int var34 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


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
    java.lang.String var27 = var6.getEstado();
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, "+ "'", var27.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setRegistro(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    java.lang.String var15 = var6.toString();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    model.Endereco var17 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var17.setRua("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var6.equals((java.lang.Object)var17);
    java.lang.String var21 = var6.getEstado();
    var6.setNumero("hi!");
    var6.setRua(", hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\n\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var6 = var5.getConvenio();
    var5.setNome("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    boolean var10 = var5.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    java.lang.String var12 = var5.getEspecialidade();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    int var16 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


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
    var5.setEspecialidade(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var38 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    java.lang.String var39 = var38.getCrm();
    java.lang.String var40 = var38.getCrm();
    java.lang.String var41 = var38.getCrm();
    var5.addAvaliacao(var38);
    
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
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


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
    int var47 = var5.getAvaliacaoPositiva();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


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
    java.lang.String var21 = var8.getNumeroRegistro();
    var8.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


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
    java.lang.String var25 = var5.getNumeroRegistro();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "");
    var6.setEstado("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var6.setNumero("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var21 = var6.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var6.getBairro();
    var6.setEstado("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var25 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, \nhi!\n, "+ "'", var25.equals("hi!, \nhi!\n, "));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getBairro();
    var6.setNumero("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    var5.setConvenio("");
    java.lang.String var15 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


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
    model.Usuario var34 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var35 = var2.equals((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setSala("hi!");
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var12 = var6.getEstado();
    java.lang.String var13 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var12.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


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
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getCrm();
    java.lang.String var32 = var30.getIdUsuario();
    boolean var33 = var30.isAvaliacao();
    java.lang.String var34 = var30.getCrm();
    java.lang.String var35 = var30.getCrm();
    boolean var36 = var30.isAvaliacao();
    boolean var37 = var30.isAvaliacao();
    var5.addAvaliacao(var30);
    
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
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


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
    var19.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var19.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


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
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    boolean var7 = var3.isAvaliacao();
    java.lang.String var8 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, "));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var17 = var5.getNumeroRegistro();
    var5.setNome("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setNome(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\n\n, , \nhi!\n, ");
    var5.setRegistro("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    var6.setNumero("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var13.equals("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


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
    var5.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    boolean var31 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    
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
    assertTrue(var31 == true);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var2.getNome();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\n\n, ");
    java.lang.String var14 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!");
    int var17 = var5.getAvaliacaoPositiva();
    var5.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


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
    java.lang.String var64 = var62.getIdUsuario();
    java.lang.String var65 = var62.getCrm();
    
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
    assertTrue("'" + var64 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var64.equals("hi!, \nhi!\n, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var65.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setNome("");
    java.lang.String var8 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


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
    var6.setBairro(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
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

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setNome("");
    java.lang.String var8 = var5.getNumeroRegistro();
    model.Avaliacao var12 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", true);
    java.lang.String var13 = var12.getIdUsuario();
    java.lang.String var14 = var12.getIdUsuario();
    var5.addAvaliacao(var12);
    java.lang.String var16 = var12.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var8.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


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
    java.lang.String var31 = var5.getNome();
    
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

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


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
    boolean var61 = var17.verificaParametros(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ");
    
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
    assertTrue(var61 == true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    model.Usuario var2 = new model.Usuario("hi!", "hi!");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    java.lang.String var5 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var2.setNome("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var16.setCidade("");
    var16.setBairro("hi!");
    var16.setSala("hi!");
    model.Usuario var25 = new model.Usuario("", "");
    java.lang.String var26 = var25.getIdentificacao();
    var25.setIdentificacao("hi!");
    var25.setIdentificacao("hi!");
    boolean var31 = var16.equals((java.lang.Object)"hi!");
    java.lang.String var32 = var16.getSala();
    java.lang.String var33 = var16.getEstado();
    java.lang.String var34 = var16.getBairro();
    boolean var35 = var2.equals((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


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
    int var29 = var5.getAvaliacaoNegativa();
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!, \nhi!\n, hi!");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.toString();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var26 = var6.toString();
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var23.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var26.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


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
    model.ProfissionalSaude var32 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var36 = new model.Avaliacao("", "hi!", false);
    java.lang.String var37 = var36.getIdUsuario();
    var32.addAvaliacao(var36);
    java.lang.String var39 = var32.getNumeroRegistro();
    var32.setNumeroRegistro("hi!, \nhi!\n, ");
    var32.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var44 = var17.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


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
    java.lang.String var34 = var2.getIdentificacao();
    
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
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var34.equals("hi!, hi!\n\nhi!, "));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


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
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var36 = var5.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


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
    java.lang.String var22 = var5.getEspecialidade();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var22.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
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
    var12.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var41 = var12.verificaParametros("", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!");
    var12.setConvenio("hi!");
    model.ProfissionalSaude var49 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var50 = var49.getNome();
    java.lang.String var51 = var49.getNumeroRegistro();
    int var52 = var49.getAvaliacaoPositiva();
    var49.setTipo("hi!, hi!\nhi!\n, ");
    int var55 = var49.getAvaliacaoPositiva();
    var49.addConvenio("hi!, hi!\nhi!\n, ");
    var49.setTipo("");
    int var60 = var49.getAvaliacaoPositiva();
    java.lang.String var61 = var49.getEspecialidade();
    java.lang.String var62 = var49.getTipo();
    var49.setEspecialidade("");
    java.lang.String var65 = var49.getEspecialidade();
    boolean var66 = var12.equals((java.lang.Object)var49);
    model.ProfissionalSaude var72 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var76 = new model.Avaliacao("", "hi!", false);
    java.lang.String var77 = var76.getIdUsuario();
    var72.addAvaliacao(var76);
    var72.setConvenio("hi!");
    java.lang.String var81 = var72.getTipo();
    model.ProfissionalSaude var87 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var91 = new model.Avaliacao("", "hi!", false);
    java.lang.String var92 = var91.getIdUsuario();
    var87.addAvaliacao(var91);
    var72.addAvaliacao(var91);
    boolean var95 = var12.equals((java.lang.Object)var72);
    boolean var96 = var6.equals((java.lang.Object)var12);
    java.lang.String var97 = var6.getEstado();
    
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
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!"+ "'", var77.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!"+ "'", var81.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "hi!"+ "'", var92.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + ""+ "'", var97.equals(""));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


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
    java.lang.String var26 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


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
    java.lang.String var41 = var23.getCidade();
    model.Usuario var44 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    boolean var45 = var23.equals((java.lang.Object)", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
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
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var41.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test92");


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
    java.lang.String var21 = var15.getEstado();
    
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

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test93");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test94");


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
    java.lang.String var23 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var23.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test95");


    model.Usuario var2 = new model.Usuario("", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var8.getNome();
    java.lang.String var10 = var8.getNumeroRegistro();
    int var11 = var8.getAvaliacaoPositiva();
    var8.setTipo("hi!, hi!\nhi!\n, ");
    int var14 = var8.getAvaliacaoPositiva();
    var8.addConvenio("hi!, hi!\nhi!\n, ");
    int var17 = var8.getAvaliacaoPositiva();
    boolean var22 = var8.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var8.addConvenio("hi!");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    var30.setConvenio("hi!");
    java.lang.String var39 = var30.getTipo();
    model.ProfissionalSaude var45 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var49 = new model.Avaliacao("", "hi!", false);
    java.lang.String var50 = var49.getIdUsuario();
    var45.addAvaliacao(var49);
    var30.addAvaliacao(var49);
    var8.addAvaliacao(var49);
    boolean var54 = var49.isAvaliacao();
    java.lang.String var55 = var49.getCrm();
    boolean var56 = var2.equals((java.lang.Object)var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test96");


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
    java.lang.String var33 = var5.getConvenio();
    
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
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var33.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test97");


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
    var5.addConvenio("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var50 = var5.verificaParametros("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    
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
    assertTrue(var50 == true);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test98");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    boolean var6 = var3.isAvaliacao();
    java.lang.String var7 = var3.getCrm();
    java.lang.String var8 = var3.getCrm();
    boolean var9 = var3.isAvaliacao();
    java.lang.String var10 = var3.getIdUsuario();
    
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test99");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    
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

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test100");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    var5.setRegistro("hi!\n");
    model.Avaliacao var15 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    java.lang.String var16 = var15.getIdUsuario();
    var5.addAvaliacao(var15);
    java.lang.String var18 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test101");


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
    int var27 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test102");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test103");


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
    model.ProfissionalSaude var36 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var40 = new model.Avaliacao("", "hi!", false);
    java.lang.String var41 = var40.getIdUsuario();
    var36.addAvaliacao(var40);
    int var43 = var36.getAvaliacaoPositiva();
    var36.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    var36.setConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var53 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var54 = var53.getNome();
    var53.setEspecialidade("hi!, \nhi!\n, ");
    var53.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var59 = var53.getTipo();
    var53.setEspecialidade("");
    int var62 = var53.getAvaliacaoNegativa();
    java.lang.String var63 = var53.getNumeroRegistro();
    boolean var68 = var53.verificaParametros("hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
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
    java.lang.String var95 = var88.getIdUsuario();
    java.lang.String var96 = var88.getCrm();
    var53.addAvaliacao(var88);
    var36.addAvaliacao(var88);
    boolean var99 = var5.equals((java.lang.Object)var88);
    
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
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
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
    assertTrue("'" + var95 + "' != '" + "hi!"+ "'", var95.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var96 + "' != '" + ""+ "'", var96.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test104");


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
    java.lang.String var35 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test105");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getConvenio();
    int var19 = var5.getAvaliacaoPositiva();
    java.lang.String var20 = var5.getNome();
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var28 = var27.getNumero();
    var27.setCidade("hi!");
    model.Endereco var37 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var39 = var37.equals((java.lang.Object)10L);
    java.lang.String var40 = var37.getNumero();
    boolean var41 = var27.equals((java.lang.Object)var40);
    var27.setBairro("");
    java.lang.String var44 = var27.getNumero();
    java.lang.String var45 = var27.getBairro();
    model.Avaliacao var49 = new model.Avaliacao("", "hi!", false);
    java.lang.String var50 = var49.getCrm();
    boolean var51 = var49.isAvaliacao();
    java.lang.String var52 = var49.getIdUsuario();
    boolean var53 = var27.equals((java.lang.Object)var49);
    boolean var54 = var49.isAvaliacao();
    boolean var55 = var49.isAvaliacao();
    var5.addAvaliacao(var49);
    java.lang.String var57 = var49.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
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
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test106");


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
    model.Avaliacao var49 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", false);
    boolean var50 = var5.equals((java.lang.Object)var49);
    java.lang.String var51 = var5.getConvenio();
    
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
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var51.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test107");


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
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    var23.setNumeroRegistro("");
    java.lang.String var32 = var23.getConvenio();
    java.lang.String var33 = var23.getConvenio();
    boolean var34 = var5.equals((java.lang.Object)var33);
    int var35 = var5.getAvaliacaoNegativa();
    int var36 = var5.getAvaliacaoPositiva();
    model.Avaliacao var40 = new model.Avaliacao("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", true);
    var5.addAvaliacao(var40);
    
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
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var33.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test108");


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
    model.Endereco var36 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var37 = var36.toString();
    var36.setEstado("hi!");
    java.lang.String var40 = var36.getRua();
    boolean var41 = var6.equals((java.lang.Object)var40);
    var6.setNumero("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
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
    assertTrue("'" + var37 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var37.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test109");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    var5.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    model.Endereco var28 = new model.Endereco("hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var29 = var28.getEstado();
    java.lang.String var30 = var28.getSala();
    model.ProfissionalSaude var36 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var37 = var36.getNome();
    java.lang.String var38 = var36.getConvenio();
    var36.setConvenio("hi!");
    boolean var41 = var28.equals((java.lang.Object)var36);
    boolean var42 = var5.equals((java.lang.Object)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var29.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var30.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var38.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test110");


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
    var5.addConvenio("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    var5.setTipo("hi!, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test111");


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
    java.lang.String var24 = var5.getConvenio();
    var5.setRegistro("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test112");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.toString();
    java.lang.String var24 = var6.getEstado();
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
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var23.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test113");


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
    java.lang.String var20 = var18.getIdUsuario();
    boolean var21 = var18.isAvaliacao();
    
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
    assertTrue("'" + var20 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var20.equals("hi!, \nhi!\n, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test114");


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
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var56 = var6.getBairro();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ", hi!\nhi!, hi!\nhi!\n, \nhi!, "+ "'", var56.equals(", hi!\nhi!, hi!\nhi!\n, \nhi!, "));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test115");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test116");


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
    java.lang.String var33 = var6.getCidade();
    
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
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test117");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setNumero("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test118");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    var5.setConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var17 = var5.getAvaliacaoPositiva();
    int var18 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test119");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getSala();
    var6.setRua("hi!, hi!\n\n, ");
    java.lang.String var19 = var6.getSala();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test120");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var7.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var8.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test121");


    model.Usuario var2 = new model.Usuario(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test122");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var18 = var5.getConvenio();
    int var19 = var5.getAvaliacaoNegativa();
    java.lang.String var20 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test123");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test124");


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
    model.Usuario var27 = new model.Usuario("hi!", "");
    java.lang.String var28 = var27.getNome();
    java.lang.String var29 = var27.getIdentificacao();
    var27.setNome("hi!, hi!\n\nhi!, ");
    model.ProfissionalSaude var37 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var41 = new model.Avaliacao("", "hi!", false);
    java.lang.String var42 = var41.getIdUsuario();
    var37.addAvaliacao(var41);
    boolean var44 = var27.equals((java.lang.Object)var41);
    model.Usuario var47 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var48 = var27.equals((java.lang.Object)var47);
    boolean var49 = var5.equals((java.lang.Object)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test125");


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
    model.ProfissionalSaude var40 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var44 = new model.Avaliacao("", "hi!", false);
    java.lang.String var45 = var44.getIdUsuario();
    var40.addAvaliacao(var44);
    int var47 = var40.getAvaliacaoPositiva();
    java.lang.String var48 = var40.getEspecialidade();
    model.ProfissionalSaude var54 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var55 = var54.getNome();
    java.lang.String var56 = var54.getNumeroRegistro();
    int var57 = var54.getAvaliacaoPositiva();
    var54.setTipo("hi!, hi!\nhi!\n, ");
    int var60 = var54.getAvaliacaoPositiva();
    var54.addConvenio("hi!, hi!\nhi!\n, ");
    int var63 = var54.getAvaliacaoPositiva();
    boolean var68 = var54.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var54.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var54.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var54.setNome("hi!, \nhi!\n, ");
    boolean var75 = var40.equals((java.lang.Object)var54);
    boolean var76 = var6.equals((java.lang.Object)var40);
    var6.setCidade("hi!, hi!\n\nhi!, ");
    var6.setEstado("hi!, hi!\n\n, , \nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    
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
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test126");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test127");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var3.equals("hi!, hi!\n\nhi!, "));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test128");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test129");


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
    int var31 = var5.getAvaliacaoNegativa();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    
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
    assertTrue(var31 == 1);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test130");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var6.getRua();
    var6.setSala("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var14 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test131");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!");
    int var8 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var18 = new model.Avaliacao("", "hi!", false);
    java.lang.String var19 = var18.getIdUsuario();
    var14.addAvaliacao(var18);
    var14.setTipo("hi!, \nhi!\n, ");
    var14.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var25 = var14.getAvaliacaoNegativa();
    java.lang.String var26 = var14.getTipo();
    int var27 = var14.getAvaliacaoPositiva();
    boolean var32 = var14.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "", "hi!, hi!\n\nhi!, ");
    int var33 = var14.getAvaliacaoNegativa();
    boolean var34 = var5.equals((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test132");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var14 = var5.getAvaliacaoPositiva();
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
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
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"+ "'", var26.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test133");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    java.lang.String var17 = var5.getEspecialidade();
    java.lang.String var18 = var5.getEspecialidade();
    java.lang.String var19 = var5.getNome();
    int var20 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test134");


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
    var5.setTipo("hi!");
    
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

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test135");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNumeroRegistro();
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var19 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test136");


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
    model.ProfissionalSaude var54 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var58 = new model.Avaliacao("", "hi!", false);
    java.lang.String var59 = var58.getIdUsuario();
    var54.addAvaliacao(var58);
    int var61 = var54.getAvaliacaoNegativa();
    var54.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var68 = var54.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var54.setEspecialidade("hi!");
    java.lang.String var71 = var54.getConvenio();
    var54.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    boolean var78 = var54.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var79 = var6.equals((java.lang.Object)var54);
    var6.setEstado("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
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
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var71.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test137");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    model.Endereco var13 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var14 = var13.getNumero();
    var13.setRua("hi!, \nhi!\n, ");
    java.lang.String var17 = var13.toString();
    var13.setEstado("");
    boolean var20 = var2.equals((java.lang.Object)var13);
    java.lang.String var21 = var13.getRua();
    var13.setBairro("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    java.lang.String var24 = var13.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, \nhi!\n, "+ "'", var21.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, "+ "'", var24.equals("hi!, \nhi!\n, "));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test138");


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
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
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

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test139");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test140");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    java.lang.String var7 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test141");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!\n", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
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
    java.lang.String var43 = var20.getTipo();
    var20.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Usuario var48 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var54 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var58 = new model.Avaliacao("", "hi!", false);
    java.lang.String var59 = var58.getIdUsuario();
    var54.addAvaliacao(var58);
    var54.setConvenio("hi!");
    boolean var63 = var48.equals((java.lang.Object)var54);
    var54.addConvenio("");
    java.lang.String var66 = var54.getNome();
    model.Avaliacao var70 = new model.Avaliacao("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    var54.addAvaliacao(var70);
    java.lang.String var72 = var70.getCrm();
    var20.addAvaliacao(var70);
    boolean var74 = var70.isAvaliacao();
    java.lang.String var75 = var70.getCrm();
    var14.addAvaliacao(var70);
    java.lang.String var77 = var70.getIdUsuario();
    boolean var78 = var5.equals((java.lang.Object)var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
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
    assertTrue("'" + var43 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var43.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + ""+ "'", var72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var77.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test142");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setBairro("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getRua();
    java.lang.String var13 = var6.getCidade();
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var16 = var6.getSala();
    java.lang.String var17 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test143");


    model.Usuario var2 = new model.Usuario(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test144");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!\n");
    boolean var14 = var2.equals((java.lang.Object)(-1L));
    java.lang.String var15 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test145");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getEstado();
    boolean var22 = var6.equals((java.lang.Object)var21);
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var25 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test146");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getConvenio();
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test147");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getConvenio();
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var17.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test148");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var26 = new model.Avaliacao("", "hi!", false);
    java.lang.String var27 = var26.getIdUsuario();
    var22.addAvaliacao(var26);
    var22.setConvenio("hi!");
    var22.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var36 = new model.Avaliacao("", "hi!", false);
    java.lang.String var37 = var36.getCrm();
    java.lang.String var38 = var36.getCrm();
    boolean var39 = var36.isAvaliacao();
    java.lang.String var40 = var36.getCrm();
    java.lang.String var41 = var36.getCrm();
    var22.addAvaliacao(var36);
    java.lang.String var43 = var36.getCrm();
    var5.addAvaliacao(var36);
    java.lang.String var45 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var45.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test149");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\n\n, , \nhi!\n, ");

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test150");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Usuario var17 = new model.Usuario("hi!, \nhi!\n, ", "hi!");
    boolean var18 = var5.equals((java.lang.Object)var17);
    var5.setConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var25 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!");
    boolean var30 = var5.verificaParametros(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test151");


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
    var40.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test152");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var17 = var5.getEspecialidade();
    
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
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test153");


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
    boolean var30 = var5.verificaParametros("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
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
    assertTrue(var30 == true);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test154");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    int var16 = var5.getAvaliacaoPositiva();
    boolean var18 = var5.equals((java.lang.Object)100L);
    var5.setEspecialidade("hi!, hi!\nhi!\n, ");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var23 = var5.getTipo();
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\n, "));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test155");


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
    var16.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    model.Endereco var38 = new model.Endereco(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "");
    var38.setRua("hi!");
    boolean var41 = var16.equals((java.lang.Object)var38);
    java.lang.String var42 = var38.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var42.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test156");


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
    var2.setIdentificacao("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test157");


    model.Avaliacao var3 = new model.Avaliacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test158");


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
    java.lang.String var36 = var6.getBairro();
    
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

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test159");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.getBairro();
    java.lang.String var14 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test160");


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
    java.lang.String var33 = var6.getBairro();
    java.lang.String var34 = var6.getNumero();
    
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

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test161");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", true);
    java.lang.String var4 = var3.getIdUsuario();
    java.lang.String var5 = var3.getIdUsuario();
    java.lang.String var6 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test162");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test163");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test164");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!", false);
    boolean var4 = var3.isAvaliacao();
    boolean var5 = var3.isAvaliacao();
    java.lang.String var6 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var6.equals("hi!, \nhi!\n, hi!"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test165");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    boolean var7 = var2.equals((java.lang.Object)"hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    java.lang.String var8 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, \nhi!\n, "+ "'", var8.equals("hi!, \nhi!\n, "));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test166");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!");
    var6.setNumero(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!\n\nhi!, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var22 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var22.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test167");


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
    var6.setCidade("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test168");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var17 = var5.getEspecialidade();
    var5.setEspecialidade("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    java.lang.String var20 = var5.getConvenio();
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var27.setCidade("");
    java.lang.String var30 = var27.getSala();
    var27.setCidade("");
    var27.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var41 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var42 = var41.getEstado();
    boolean var43 = var27.equals((java.lang.Object)var42);
    var27.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var46 = var27.getEstado();
    var27.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var27.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var51 = var5.equals((java.lang.Object)var27);
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var46.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test169");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    var5.setTipo("hi!, hi!\n\n, ");
    java.lang.String var16 = var5.getNome();
    var5.setTipo("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    model.Usuario var21 = new model.Usuario("", "");
    java.lang.String var22 = var21.getIdentificacao();
    var21.setIdentificacao("hi!");
    java.lang.String var25 = var21.getNome();
    var21.setNome("hi!");
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var37 = new model.Avaliacao("", "hi!", false);
    java.lang.String var38 = var37.getIdUsuario();
    var33.addAvaliacao(var37);
    java.lang.String var40 = var37.getIdUsuario();
    boolean var41 = var21.equals((java.lang.Object)var37);
    java.lang.String var42 = var37.getIdUsuario();
    boolean var43 = var37.isAvaliacao();
    java.lang.String var44 = var37.getIdUsuario();
    var5.addAvaliacao(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test170");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test171");


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
    var6.setRua("hi!, hi!\n\nhi!, ");
    java.lang.String var51 = var6.getNumero();
    
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
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test172");


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
    java.lang.String var33 = var6.getEstado();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test173");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    java.lang.String var11 = var6.getEstado();
    model.Endereco var18 = new model.Endereco("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    boolean var19 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    java.lang.String var20 = var6.getEstado();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var23 = var6.getEstado();
    var6.setNumero("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var26 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var26.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test174");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test175");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\nhi!, \n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test176");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var20 = var5.verificaParametros("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro(", hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test177");


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
    java.lang.String var61 = var5.getConvenio();
    
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
    assertTrue("'" + var61 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var61.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test178");


    model.Endereco var6 = new model.Endereco("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var7.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var8.equals("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test179");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\n\n, "+ "'", var4.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\n\n, "+ "'", var5.equals("hi!, hi!\n\n, "));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test180");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", ", \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test181");


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
    var19.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test182");


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
    java.lang.String var63 = var53.getIdUsuario();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test183");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test184");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    boolean var23 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var24 = var5.getNumeroRegistro();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test185");


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
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");
    
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

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test186");


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
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var36 = var35.getNome();
    java.lang.String var37 = var35.getNumeroRegistro();
    int var38 = var35.getAvaliacaoPositiva();
    var35.addConvenio("");
    int var41 = var35.getAvaliacaoPositiva();
    var35.setEspecialidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var44 = var35.getConvenio();
    var35.setEspecialidade("hi!, hi!\nhi!\n, hi!");
    boolean var47 = var27.equals((java.lang.Object)var35);
    
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
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var44.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test187");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getRua();
    java.lang.String var12 = var6.getCidade();
    var6.setEstado(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getEstado();
    java.lang.String var16 = var6.getEstado();
    var6.setCidade("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var16.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test188");


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
    model.Endereco var35 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var35.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var38 = var5.equals((java.lang.Object)var35);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test189");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    var2.setNome("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test190");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    java.lang.String var16 = var5.getEspecialidade();
    var5.setRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var19 = var5.getTipo();
    boolean var24 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("hi!, hi!\n\n, , \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test191");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    var6.setSala("hi!, hi!\nhi!\nhi!, \n");
    var6.setBairro("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test192");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    int var9 = var5.getAvaliacaoNegativa();
    java.lang.String var10 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test193");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test194");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("hi!");
    var5.addConvenio("");
    int var22 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test195");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    int var12 = var5.getAvaliacaoNegativa();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var17 = var5.getNome();
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test196");


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
    model.Usuario var55 = new model.Usuario("", "");
    java.lang.String var56 = var55.getIdentificacao();
    var55.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var59 = var55.getIdentificacao();
    model.Avaliacao var63 = new model.Avaliacao("", "hi!", false);
    boolean var64 = var55.equals((java.lang.Object)"hi!");
    java.lang.String var65 = var55.getIdentificacao();
    boolean var66 = var6.equals((java.lang.Object)var65);
    model.Endereco var73 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var73.setCidade("");
    var73.setBairro("hi!");
    var73.setSala("hi!");
    model.Usuario var82 = new model.Usuario("", "");
    java.lang.String var83 = var82.getIdentificacao();
    var82.setIdentificacao("hi!");
    var82.setIdentificacao("hi!");
    boolean var88 = var73.equals((java.lang.Object)"hi!");
    java.lang.String var89 = var73.getSala();
    var73.setNumero("");
    boolean var92 = var6.equals((java.lang.Object)"");
    var6.setBairro("hi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + ""+ "'", var83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi!"+ "'", var89.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test197");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var16 = var6.getCidade();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test198");


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
    int var74 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var74 == 3);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test199");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getEstado();
    var6.setNumero("hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var6.getBairro();
    var6.setSala("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
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

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test200");


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
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var24 = var5.getTipo();
    model.Endereco var31 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var33 = var31.equals((java.lang.Object)10L);
    java.lang.String var34 = var31.getNumero();
    java.lang.String var35 = var31.getBairro();
    var31.setRua("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var38 = var5.equals((java.lang.Object)"hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test201");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    model.Avaliacao var18 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var5.addAvaliacao(var18);
    java.lang.String var20 = var18.getIdUsuario();
    boolean var21 = var18.isAvaliacao();
    boolean var22 = var18.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test202");


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
    java.lang.String var26 = var19.getIdUsuario();
    java.lang.String var27 = var19.getCrm();
    java.lang.String var28 = var19.getIdUsuario();
    boolean var29 = var19.isAvaliacao();
    
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
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test203");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!");
    model.Usuario var7 = new model.Usuario("hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var7.getIdentificacao();
    boolean var9 = var2.equals((java.lang.Object)var7);
    var2.setNome("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test204");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var9 = var6.getNumero();
    var6.setRua("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test205");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", true);
    java.lang.String var4 = var3.getCrm();
    boolean var5 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var4.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test206");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test207");


    model.Endereco var6 = new model.Endereco("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!\n");

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test208");


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
    model.Avaliacao var33 = new model.Avaliacao("", "hi!", false);
    java.lang.String var34 = var33.getIdUsuario();
    boolean var35 = var33.isAvaliacao();
    boolean var36 = var27.equals((java.lang.Object)var35);
    java.lang.String var37 = var27.getIdentificacao();
    
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
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var37.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test209");


    model.Usuario var2 = new model.Usuario("hi!", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "+ "'", var3.equals(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test210");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var15 = var5.getAvaliacaoNegativa();
    model.Avaliacao var19 = new model.Avaliacao("hi!", "", true);
    var5.addAvaliacao(var19);
    model.Avaliacao var24 = new model.Avaliacao("hi!, hi!\n\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    boolean var25 = var24.isAvaliacao();
    boolean var26 = var24.isAvaliacao();
    boolean var27 = var24.isAvaliacao();
    var5.addAvaliacao(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test211");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var10 = var5.verificaParametros("hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!\n");
    int var11 = var5.getAvaliacaoNegativa();
    java.lang.String var12 = var5.getNome();
    java.lang.String var13 = var5.getConvenio();
    int var14 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var12.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test212");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getConvenio();
    int var7 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test213");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    model.Endereco var14 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var16 = var14.equals((java.lang.Object)10L);
    java.lang.String var17 = var14.getNumero();
    boolean var18 = var6.equals((java.lang.Object)var17);
    var6.setBairro("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test214");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!\n, hi!", true);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test215");


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
    java.lang.String var33 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var33.equals("hi!, hi!\n\nhi!, "));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test216");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\n\n, ");
    var2.setNome("hi!, hi!\n\n, ");
    java.lang.String var7 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\n, "+ "'", var7.equals("hi!, hi!\n\n, "));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test217");


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
    int var80 = var56.getAvaliacaoNegativa();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test218");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setNumeroRegistro("hi!");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var21 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var25 = new model.Avaliacao("", "hi!", false);
    java.lang.String var26 = var25.getIdUsuario();
    var21.addAvaliacao(var25);
    var21.setNumeroRegistro("");
    java.lang.String var30 = var21.getConvenio();
    model.Avaliacao var34 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var21.addAvaliacao(var34);
    boolean var36 = var34.isAvaliacao();
    var5.addAvaliacao(var34);
    java.lang.String var38 = var34.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var30.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var38.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test219");


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
    var5.setNome("");
    int var23 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test220");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test221");


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
    var5.addConvenio("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    boolean var36 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue(var36 == true);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test222");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    int var14 = var5.getAvaliacaoPositiva();
    java.lang.String var15 = var5.getNome();
    var5.setNumeroRegistro("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test223");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!");
    var5.setEspecialidade("hi!\n");
    java.lang.String var24 = var5.getConvenio();
    java.lang.String var25 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test224");


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
    var20.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var36 = var20.getEspecialidade();
    
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
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test225");


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
    boolean var29 = var8.verificaParametros("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    int var30 = var8.getAvaliacaoNegativa();
    var8.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var33 = var8.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test226");


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
    var14.addConvenio("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test227");


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
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var40 = var6.getEstado();
    java.lang.String var41 = var6.getNumero();
    
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
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test228");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test229");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var2.getIdentificacao();
    model.Avaliacao var10 = new model.Avaliacao("", "hi!", false);
    boolean var11 = var2.equals((java.lang.Object)"hi!");
    java.lang.String var12 = var2.getIdentificacao();
    java.lang.String var13 = var2.getNome();
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var16 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "+ "'", var16.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , "));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test230");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test231");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test232");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    model.Usuario var11 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var12 = var5.equals((java.lang.Object)var11);
    java.lang.String var13 = var11.getIdentificacao();
    var11.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var16 = var11.getNome();
    var11.setIdentificacao(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test233");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", false);
    java.lang.String var4 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var4.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test234");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var16 = var6.getNumero();
    var6.setCidade("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var19 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test235");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    var6.setCidade("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test236");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var13 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test237");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "");
    var6.setEstado("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var9 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var9.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test238");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var6.setBairro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setBairro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var21 = var6.getRua();
    java.lang.String var22 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test239");


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
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var39 = new model.Avaliacao("", "hi!", false);
    java.lang.String var40 = var39.getIdUsuario();
    var35.addAvaliacao(var39);
    int var42 = var35.getAvaliacaoNegativa();
    var35.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var50 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var54 = new model.Avaliacao("", "hi!", false);
    java.lang.String var55 = var54.getIdUsuario();
    var50.addAvaliacao(var54);
    var50.setTipo("hi!, \nhi!\n, ");
    boolean var59 = var35.equals((java.lang.Object)var50);
    boolean var60 = var5.equals((java.lang.Object)var50);
    model.ProfissionalSaude var66 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var67 = var66.getNome();
    java.lang.String var68 = var66.getNumeroRegistro();
    int var69 = var66.getAvaliacaoPositiva();
    var66.setTipo("hi!, hi!\nhi!\n, ");
    int var72 = var66.getAvaliacaoPositiva();
    java.lang.String var73 = var66.getNome();
    var66.setEspecialidade("hi!, \nhi!\n, ");
    model.Avaliacao var79 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, \nhi!\n, hi!", true);
    var66.addAvaliacao(var79);
    var5.addAvaliacao(var79);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test240");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getIdUsuario();
    java.lang.String var7 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test241");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getNumero();
    var6.setCidade("hi!, hi!\n\nhi!, ");
    var6.setNumero("hi!, \nhi!\n, ");
    var6.setBairro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test242");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    boolean var10 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test243");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getSala();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getNumero();
    java.lang.String var15 = var6.getSala();
    java.lang.String var16 = var6.getBairro();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test244");


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
    java.lang.String var22 = var6.getCidade();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "+ "'", var20.equals("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "+ "'", var21.equals("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var22.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test245");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \n");
    int var15 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test246");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    boolean var27 = var5.verificaParametros("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Avaliacao var31 = new model.Avaliacao(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    var5.addAvaliacao(var31);
    java.lang.String var33 = var31.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test247");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setTipo("hi!, hi!\n\nhi!, \nhi!\n, , hi!");

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test248");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getTipo();
    boolean var19 = var5.verificaParametros("hi!", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setNumeroRegistro(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
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
    var5.addAvaliacao(var61);
    boolean var66 = var61.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
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
    assertTrue(var66 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test249");


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
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
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

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test250");


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
    java.lang.String var33 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var33.equals("hi!, hi!\n\nhi!, "));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test251");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.toString();
    java.lang.String var11 = var6.getEstado();
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var26 = var24.equals((java.lang.Object)10L);
    var24.setCidade("hi!, \nhi!\n, ");
    boolean var29 = var17.equals((java.lang.Object)"hi!, \nhi!\n, ");
    java.lang.String var30 = var17.getNome();
    boolean var31 = var6.equals((java.lang.Object)var30);
    java.lang.String var32 = var6.getBairro();
    java.lang.String var33 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, \nhi!\n, "+ "'", var30.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test252");


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
    var5.setNome("hi!, \nhi!\n, hi!");
    var5.setRegistro("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test253");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var29 = var5.getAvaliacaoNegativa();
    
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

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test254");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    var15.setEstado("hi!");
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

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test255");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    java.lang.String var13 = var6.getSala();
    var6.setCidade("hi!, \nhi!\n, ");
    var6.setCidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test256");


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
    var5.setTipo("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    
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

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test257");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test258");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getEspecialidade();
    boolean var13 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test259");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setConvenio(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test260");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test261");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = var6.getEstado();
    java.lang.String var11 = var6.getNumero();
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var14 = var6.getCidade();
    model.Endereco var21 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var22 = var21.getNumero();
    var21.setRua("hi!, \nhi!\n, ");
    java.lang.String var25 = var21.toString();
    var21.setEstado("");
    var21.setRua("hi!, hi!\nhi!\nhi!, ");
    boolean var30 = var6.equals((java.lang.Object)var21);
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var10.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var25.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test262");


    model.Usuario var2 = new model.Usuario("", "hi!, hi!\nhi!\nhi!, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var9.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var9.getSala();
    var9.setCidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var15 = var2.equals((java.lang.Object)var9);
    java.lang.String var16 = var9.getEstado();
    var9.setSala("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var19 = var9.getNumero();
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    boolean var26 = var9.equals((java.lang.Object)"hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    var9.setRua("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test263");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNome();
    var5.setNome("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var17 = var5.getEspecialidade();
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test264");


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
    model.Endereco var34 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var35 = var34.getNumero();
    java.lang.String var36 = var34.toString();
    java.lang.String var37 = var34.getRua();
    var34.setNumero("hi!, \nhi!\n, ");
    java.lang.String var40 = var34.getEstado();
    java.lang.String var41 = var34.getNumero();
    boolean var42 = var8.equals((java.lang.Object)var41);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var35.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var36.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var40.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, \nhi!\n, "+ "'", var41.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test265");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test266");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    java.lang.String var21 = var6.getRua();
    var6.setBairro(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
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

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test267");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    var6.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    var6.setBairro(", hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test268");


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
    java.lang.String var34 = var20.getTipo();
    java.lang.String var35 = var20.getTipo();
    model.Endereco var42 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var44 = var42.equals((java.lang.Object)10L);
    java.lang.String var45 = var42.getNumero();
    java.lang.String var46 = var42.getSala();
    java.lang.String var47 = var42.getRua();
    boolean var48 = var20.equals((java.lang.Object)var47);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test269");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test270");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test271");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    var6.setSala("hi!");
    var6.setCidade("hi!");
    java.lang.String var16 = var6.getCidade();
    java.lang.String var17 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test272");


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
    var5.setRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ");
    
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

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test273");


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
    var6.setSala("hi!, hi!\nhi!\nhi!, \n");
    var6.setEstado("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test274");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("");
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var29 = var28.getNumero();
    var28.setSala("hi!");
    java.lang.String var32 = var28.getRua();
    java.lang.String var33 = var28.toString();
    java.lang.String var34 = var28.getBairro();
    boolean var35 = var5.equals((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test275");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setTipo("");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test276");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var6.toString();
    java.lang.String var14 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var17 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var13.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test277");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getNumero();
    java.lang.String var9 = var6.toString();
    var6.setNumero("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var6.setBairro(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test278");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var19 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var19.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test279");


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
    java.lang.String var25 = var6.toString();
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    
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
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\n, "));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test280");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", true);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getCrm();
    boolean var7 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test281");


    model.Endereco var6 = new model.Endereco(", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var7.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test282");


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
    var5.addConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    
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

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test283");


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
    int var18 = var5.getAvaliacaoPositiva();
    
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
    assertTrue(var18 == 0);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test284");


    model.Endereco var6 = new model.Endereco("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var7.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var8.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test285");


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
    java.lang.String var53 = var6.getNumero();
    
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

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test286");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test287");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test288");


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
    java.lang.String var21 = var2.getNome();
    java.lang.String var22 = var2.getNome();
    
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
    assertTrue("'" + var21 + "' != '" + "hi!, \nhi!\n, "+ "'", var21.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, "));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test289");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var15 = var5.getAvaliacaoNegativa();
    var5.setTipo("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var18 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test290");


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
    int var42 = var5.getAvaliacaoPositiva();
    
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
    assertTrue(var42 == 0);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test291");


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
    java.lang.String var26 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, "));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test292");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test293");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("");
    java.lang.String var7 = var2.getNome();
    java.lang.String var8 = var2.getNome();
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
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

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test294");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getSala();
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getNumero();
    java.lang.String var15 = var6.getSala();
    java.lang.String var16 = var6.getNumero();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test295");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setEspecialidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\n\n, ");
    java.lang.String var19 = var5.getConvenio();
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var14.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test296");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var5 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test297");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var18 = new model.Avaliacao("", "hi!", false);
    java.lang.String var19 = var18.getIdUsuario();
    var14.addAvaliacao(var18);
    java.lang.String var21 = var18.getIdUsuario();
    boolean var22 = var2.equals((java.lang.Object)var18);
    java.lang.String var23 = var18.getIdUsuario();
    boolean var24 = var18.isAvaliacao();
    java.lang.String var25 = var18.getCrm();
    java.lang.String var26 = var18.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test298");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!\n", "hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, ");
    java.lang.String var7 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test299");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test300");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test301");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", true);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test302");


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
    java.lang.String var22 = var8.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test303");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test304");


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
    model.Usuario var22 = new model.Usuario("hi!", "");
    java.lang.String var23 = var22.getNome();
    java.lang.String var24 = var22.getIdentificacao();
    var22.setIdentificacao("hi!, \nhi!\n, ");
    var22.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var29 = var22.getIdentificacao();
    boolean var30 = var15.equals((java.lang.Object)var22);
    var15.setEstado("hi!, \nhi!\n, hi!");
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, \nhi!\n, "+ "'", var29.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test305");


    model.Avaliacao var3 = new model.Avaliacao(", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test306");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf(", hi!\n\nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test307");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var6.getNumero();
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test308");


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
    var5.setConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test309");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    java.lang.String var13 = var5.getEspecialidade();
    int var14 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var17 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test310");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getSala();
    var6.setNumero("hi!\n");
    java.lang.String var13 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test311");


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
    int var18 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var18 == 0);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test312");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test313");


    model.Usuario var2 = new model.Usuario("", "hi!, hi!\nhi!\nhi!, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var9.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var9.getSala();
    var9.setCidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var15 = var2.equals((java.lang.Object)var9);
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test314");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    boolean var13 = var5.equals((java.lang.Object)1.0d);
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
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
    assertTrue(var13 == false);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test315");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    var5.setNome("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    int var15 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test316");


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
    boolean var35 = var14.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!", "hi!, hi!\nhi!\n, ");
    
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
    assertTrue(var35 == true);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test317");


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
    java.lang.String var40 = var2.getNome();
    
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
    assertTrue("'" + var40 + "' != '" + "hi!, \nhi!\n, "+ "'", var40.equals("hi!, \nhi!\n, "));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test318");


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
    java.lang.String var33 = var6.getNumero();
    
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
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test319");


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
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setTipo("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
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

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test320");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoNegativa();
    
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

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test321");


    model.Usuario var2 = new model.Usuario("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test322");


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
    model.ProfissionalSaude var32 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var36 = new model.Avaliacao("", "hi!", false);
    java.lang.String var37 = var36.getIdUsuario();
    var32.addAvaliacao(var36);
    java.lang.String var39 = var32.getConvenio();
    var32.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var46 = var32.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!\n");
    boolean var47 = var5.equals((java.lang.Object)var46);
    
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
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var39.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test323");


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
    java.lang.String var32 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test324");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    var5.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test325");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!");

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test326");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var10 = var9.getNumero();
    var9.setCidade("hi!");
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    boolean var23 = var9.equals((java.lang.Object)var22);
    var9.setBairro("");
    java.lang.String var26 = var9.getNumero();
    java.lang.String var27 = var9.getCidade();
    java.lang.String var28 = var9.getRua();
    boolean var29 = var2.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test327");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    int var17 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test328");


    model.Avaliacao var3 = new model.Avaliacao("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    java.lang.String var4 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test329");


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
    java.lang.String var28 = var2.getNome();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var31 = var2.getNome();
    
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
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var31.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, "));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test330");


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
    java.lang.String var23 = var5.getEspecialidade();
    var5.setNome(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test331");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getBairro();
    java.lang.String var8 = var6.getCidade();
    var6.setNumero(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test332");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getEstado();
    var6.setNumero("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var11 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var8.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var11.equals("hi!, hi!\n\nhi!, "));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test333");


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
    int var32 = var5.getAvaliacaoNegativa();
    int var33 = var5.getAvaliacaoNegativa();
    java.lang.String var34 = var5.getConvenio();
    java.lang.String var35 = var5.getNome();
    java.lang.String var36 = var5.getNome();
    
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
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var34.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test334");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var9 = var6.getNumero();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test335");


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
    java.lang.String var35 = var6.getCidade();
    java.lang.String var36 = var6.toString();
    
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
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var36.equals("hi!, hi!\n\nhi!, "));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test336");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!\n", "hi!, hi!\n\n, ", "", "");
    boolean var24 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \n", "hi!, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test337");


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
    java.lang.String var49 = var5.getNumeroRegistro();
    java.lang.String var50 = var5.getConvenio();
    
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
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var50.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test338");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var12 = var2.getNome();
    java.lang.String var13 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, "));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test339");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", false);
    java.lang.String var4 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var4.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test340");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var15 = var5.getAvaliacaoNegativa();
    java.lang.String var16 = var5.getEspecialidade();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test341");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setEspecialidade("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    
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

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test342");


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
    var5.addConvenio("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    model.ProfissionalSaude var49 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var53 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var54 = var53.getIdUsuario();
    java.lang.String var55 = var53.getIdUsuario();
    java.lang.String var56 = var53.getCrm();
    java.lang.String var57 = var53.getIdUsuario();
    java.lang.String var58 = var53.getIdUsuario();
    var49.addAvaliacao(var53);
    var5.addAvaliacao(var53);
    
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
    assertTrue("'" + var54 + "' != '" + "hi!, \nhi!\n, "+ "'", var54.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!, \nhi!\n, "+ "'", var55.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!, \nhi!\n, "+ "'", var57.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!, \nhi!\n, "+ "'", var58.equals("hi!, \nhi!\n, "));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test343");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var15.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var15.getRua();
    var15.setSala("hi!, hi!\nhi!\nhi!, ");
    var15.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var23 = var6.equals((java.lang.Object)var15);
    var15.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var15.setBairro("hi!, hi!\nhi!\nhi!, \nhi!");
    var15.setRua(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var30 = var15.getNumero();
    java.lang.String var31 = var15.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var30.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var31.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test344");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getBairro();
    java.lang.String var8 = var6.getBairro();
    var6.setNumero("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test345");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test346");


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
    java.lang.String var43 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
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
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test347");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test348");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("hi!");
    java.lang.String var15 = var6.getBairro();
    var6.setSala("hi!");
    java.lang.String var18 = var6.getRua();
    java.lang.String var19 = var6.toString();
    java.lang.String var20 = var6.toString();
    var6.setRua("hi!, \nhi!\n, hi!");
    
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
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\n, "));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test349");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var17 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var20 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test350");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getNumero();
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test351");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getRua();
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test352");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", true);
    boolean var4 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test353");


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
    int var36 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    
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
    assertTrue(var36 == 0);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test354");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var11 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var12 = var11.getNome();
    var11.setEspecialidade("hi!, \nhi!\n, ");
    var11.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Avaliacao var20 = new model.Avaliacao("hi!", "", true);
    java.lang.String var21 = var20.getIdUsuario();
    java.lang.String var22 = var20.getCrm();
    java.lang.String var23 = var20.getIdUsuario();
    java.lang.String var24 = var20.getIdUsuario();
    var11.addAvaliacao(var20);
    boolean var26 = var5.equals((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test355");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("hi!");
    java.lang.String var15 = var6.getBairro();
    var6.setSala("hi!");
    java.lang.String var18 = var6.getRua();
    java.lang.String var19 = var6.toString();
    java.lang.String var20 = var6.getEstado();
    var6.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var23 = var6.getBairro();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var19.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test356");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test357");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test358");


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
    var35.setTipo("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test359");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getEstado();
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var16 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test360");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    var5.addConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Endereco var31 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var32 = var31.getNumero();
    model.Endereco var39 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var40 = var39.getNumero();
    var39.setCidade("hi!");
    model.Endereco var49 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var51 = var49.equals((java.lang.Object)10L);
    java.lang.String var52 = var49.getNumero();
    boolean var53 = var39.equals((java.lang.Object)var52);
    var39.setBairro("");
    java.lang.String var56 = var39.getBairro();
    var39.setNumero("hi!, hi!\nhi!\n, ");
    boolean var59 = var31.equals((java.lang.Object)var39);
    java.lang.String var60 = var31.getNumero();
    var31.setRua("hi!, \nhi!\n, ");
    var31.setSala("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var68 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var69 = var68.getCrm();
    java.lang.String var70 = var68.getCrm();
    java.lang.String var71 = var68.getIdUsuario();
    boolean var72 = var31.equals((java.lang.Object)var68);
    java.lang.String var73 = var68.getCrm();
    var5.addAvaliacao(var68);
    java.lang.String var75 = var68.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!, \nhi!\n, "+ "'", var69.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!, \nhi!\n, "+ "'", var70.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var71.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!, \nhi!\n, "+ "'", var73.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var75.equals("hi!, hi!\nhi!\n, "));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test361");


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
    var14.addConvenio("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
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

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test362");


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
    java.lang.String var26 = var24.getIdUsuario();
    java.lang.String var27 = var24.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var26.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test363");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test364");


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
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
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

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test365");


    model.Avaliacao var3 = new model.Avaliacao("hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var4.equals("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test366");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    var6.setNumero("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getNumero();
    java.lang.String var13 = var6.getNumero();
    var6.setNumero("");
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test367");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var16 = var6.getCidade();
    var6.setNumero("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var19 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var19.equals("hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test368");


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
    model.Avaliacao var49 = new model.Avaliacao("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", false);
    boolean var50 = var2.equals((java.lang.Object)"hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
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
    assertTrue(var50 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test369");


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
    java.lang.String var37 = var14.getNumero();
    var14.setEstado("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var14.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var37 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var37.equals("hi!, hi!\nhi!\n, "));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test370");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.toString();
    java.lang.String var17 = var6.getNumero();
    var6.setBairro("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test371");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test372");


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
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
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
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test373");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ");

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test374");


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
    java.lang.String var46 = var5.getConvenio();
    java.lang.String var47 = var5.getConvenio();
    
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
    assertTrue("'" + var46 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var46.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var47.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test375");


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
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
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

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test376");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var30 = var28.equals((java.lang.Object)10L);
    var28.setCidade("");
    java.lang.String var33 = var28.getEstado();
    model.Endereco var40 = new model.Endereco("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    boolean var41 = var28.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    java.lang.String var42 = var28.getEstado();
    var28.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var28.setNumero("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var47 = var28.getRua();
    boolean var48 = var6.equals((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var47.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test377");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var6.setEstado(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Usuario var16 = new model.Usuario("hi!", "");
    java.lang.String var17 = var16.getNome();
    java.lang.String var18 = var16.getIdentificacao();
    var16.setIdentificacao("hi!, \nhi!\n, ");
    var16.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var23 = var6.equals((java.lang.Object)var16);
    var6.setCidade("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test378");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
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

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test379");


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
    int var27 = var5.getAvaliacaoNegativa();
    java.lang.String var28 = var5.getEspecialidade();
    
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
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test380");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test381");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getCidade();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var12 = var6.toString();
    var6.setCidade("hi!, hi!\nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, "));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test382");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.getNumero();
    var6.setEstado(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var26 = var6.toString();
    
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
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var26.equals("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test383");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getEstado();
    var6.setNumero("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    model.Endereco var17 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var17.setCidade("");
    var17.setBairro("hi!");
    var17.setSala("hi!");
    model.Usuario var26 = new model.Usuario("", "");
    java.lang.String var27 = var26.getIdentificacao();
    var26.setIdentificacao("hi!");
    var26.setIdentificacao("hi!");
    boolean var32 = var17.equals((java.lang.Object)"hi!");
    java.lang.String var33 = var17.getSala();
    java.lang.String var34 = var17.getNumero();
    java.lang.String var35 = var17.getEstado();
    java.lang.String var36 = var17.toString();
    boolean var37 = var6.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var8.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var36.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test384");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var9 = var6.getNumero();
    var6.setRua("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test385");


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
    int var31 = var5.getAvaliacaoNegativa();
    var5.setConvenio("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    
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
    assertTrue(var31 == 1);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test386");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test387");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test388");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setEstado("hi!\n");
    var6.setNumero("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test389");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var19 = var5.getEspecialidade();
    var5.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test390");


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
    java.lang.String var37 = var14.getNumero();
    java.lang.String var38 = var14.getRua();
    
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
    assertTrue("'" + var37 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var37.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test391");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ");

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test392");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    java.lang.String var15 = var5.getConvenio();
    var5.setRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test393");


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
    var5.setNome("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    var5.addConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
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

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test394");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test395");


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
    int var28 = var19.getAvaliacaoPositiva();
    var19.setRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test396");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    java.lang.String var6 = var5.getEspecialidade();
    java.lang.String var7 = var5.getConvenio();
    model.ProfissionalSaude var13 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var14 = var13.getNome();
    java.lang.String var15 = var13.getNumeroRegistro();
    int var16 = var13.getAvaliacaoPositiva();
    var13.setTipo("hi!, hi!\nhi!\n, ");
    int var19 = var13.getAvaliacaoPositiva();
    var13.addConvenio("hi!, hi!\nhi!\n, ");
    int var22 = var13.getAvaliacaoPositiva();
    boolean var27 = var13.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var13.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var13.setConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var37 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var38 = var37.getNome();
    java.lang.String var39 = var37.getNumeroRegistro();
    int var40 = var37.getAvaliacaoPositiva();
    var37.setTipo("hi!, hi!\nhi!\n, ");
    int var43 = var37.getAvaliacaoPositiva();
    var37.addConvenio("hi!, hi!\nhi!\n, ");
    var37.setTipo("");
    model.Usuario var50 = new model.Usuario("", "");
    java.lang.String var51 = var50.getIdentificacao();
    var50.setIdentificacao("hi!");
    java.lang.String var54 = var50.getNome();
    var50.setNome("hi!");
    model.ProfissionalSaude var62 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var66 = new model.Avaliacao("", "hi!", false);
    java.lang.String var67 = var66.getIdUsuario();
    var62.addAvaliacao(var66);
    java.lang.String var69 = var66.getIdUsuario();
    boolean var70 = var50.equals((java.lang.Object)var66);
    java.lang.String var71 = var66.getIdUsuario();
    boolean var72 = var66.isAvaliacao();
    java.lang.String var73 = var66.getIdUsuario();
    java.lang.String var74 = var66.getCrm();
    var37.addAvaliacao(var66);
    var13.addAvaliacao(var66);
    var5.addAvaliacao(var66);
    java.lang.String var78 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + ""+ "'", var74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var78.equals("hi!, hi!\nhi!\n, "));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test397");


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
    java.lang.String var51 = var5.getTipo();
    
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
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var51.equals("hi!, hi!\nhi!\n, "));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test398");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.toString();
    java.lang.String var14 = var6.getEstado();
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test399");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", "hi!, hi!\nhi!\n, ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test400");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    java.lang.String var15 = var2.getIdentificacao();
    java.lang.String var16 = var2.getNome();
    java.lang.String var17 = var2.getIdentificacao();
    java.lang.String var18 = var2.getNome();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, \nhi!\n, "+ "'", var18.equals("hi!, \nhi!\n, "));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test401");


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
    java.lang.String var40 = var6.getSala();
    java.lang.String var41 = var6.getSala();
    
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

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test402");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", true);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test403");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    int var23 = var5.getAvaliacaoNegativa();
    int var24 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test404");


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
    int var23 = var5.getAvaliacaoNegativa();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test405");


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
    model.Avaliacao var31 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var32 = var31.getIdUsuario();
    boolean var33 = var5.equals((java.lang.Object)var31);
    var5.setNome(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    
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
    assertTrue("'" + var32 + "' != '" + "hi!, \nhi!\n, "+ "'", var32.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test406");


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
    java.lang.String var44 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test407");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var5.getNumeroRegistro();
    int var16 = var5.getAvaliacaoPositiva();
    java.lang.String var17 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test408");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    var2.setNome("hi!, hi!\nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test409");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test410");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test411");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getNumero();
    java.lang.String var18 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test412");


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
    var5.setRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test413");


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
    var20.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var20.setConvenio("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
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

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test414");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");
    var6.setBairro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!\n");
    var6.setRua("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var25 = new model.Usuario("hi!", "hi!");
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getIdentificacao();
    java.lang.String var28 = var25.getIdentificacao();
    var25.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var25.setNome("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    boolean var33 = var6.equals((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test415");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test416");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getSala();
    var6.setSala("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var13 = var6.getCidade();
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test417");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test418");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!");

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test419");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    java.lang.String var17 = var8.getTipo();
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var27 = new model.Avaliacao("", "hi!", false);
    java.lang.String var28 = var27.getIdUsuario();
    var23.addAvaliacao(var27);
    var8.addAvaliacao(var27);
    var8.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    java.lang.String var33 = var8.getNumeroRegistro();
    boolean var34 = var2.equals((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test420");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test421");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test422");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoPositiva();
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNome();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test423");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.toString();
    java.lang.String var24 = var6.getEstado();
    java.lang.String var25 = var6.getNumero();
    java.lang.String var26 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var23.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test424");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var5.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test425");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\n\nhi!, ");
    model.Endereco var13 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var14 = var13.getNumero();
    var13.setCidade("hi!");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    java.lang.String var26 = var23.getNumero();
    boolean var27 = var13.equals((java.lang.Object)var26);
    var13.setBairro("");
    var13.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var32 = var2.equals((java.lang.Object)var13);
    var2.setNome("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test426");


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
    java.lang.String var28 = var19.getIdUsuario();
    java.lang.String var29 = var19.getIdUsuario();
    
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
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test427");


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
    int var23 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test428");


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
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setCidade("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test429");


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
    boolean var38 = var5.verificaParametros("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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
    assertTrue(var38 == true);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test430");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var10.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test431");


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
    var2.setIdentificacao(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
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

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test432");


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
    int var29 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test433");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!");

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test434");


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
    java.lang.String var25 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \n");
    
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
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\n, "));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test435");


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
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var31 = var5.getConvenio();
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    int var34 = var5.getAvaliacaoNegativa();
    
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
    assertTrue("'" + var31 + "' != '" + "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var31.equals("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test436");


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

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test437");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var15.setCidade("");
    java.lang.String var18 = var15.getSala();
    java.lang.String var19 = var15.getCidade();
    boolean var20 = var5.equals((java.lang.Object)var15);
    java.lang.String var21 = var15.getRua();
    java.lang.String var22 = var15.getEstado();
    var15.setBairro("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test438");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test439");


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
    model.Endereco var29 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var29.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var29.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    boolean var34 = var5.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var5.setNome("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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
    assertTrue(var34 == false);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test440");


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
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var36 = var6.getRua();
    
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
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test441");


    model.Endereco var6 = new model.Endereco("", "", "", "", "hi!", "");
    var6.setCidade("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test442");


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
    java.lang.String var24 = var21.getIdUsuario();
    java.lang.String var25 = var21.getIdUsuario();
    java.lang.String var26 = var21.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test443");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var2.setIdentificacao("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test444");


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
    java.lang.String var30 = var5.getEspecialidade();
    
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
    assertTrue("'" + var30 + "' != '" + "hi!, \nhi!\n, "+ "'", var30.equals("hi!, \nhi!\n, "));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test445");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    int var15 = var5.getAvaliacaoNegativa();
    java.lang.String var16 = var5.getNumeroRegistro();
    boolean var21 = var5.verificaParametros(", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test446");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoPositiva();
    java.lang.String var14 = var5.getConvenio();
    model.ProfissionalSaude var20 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var24 = new model.Avaliacao("", "hi!", false);
    java.lang.String var25 = var24.getIdUsuario();
    var20.addAvaliacao(var24);
    var20.setTipo("hi!, \nhi!\n, ");
    var20.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var20.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var36 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var20.addAvaliacao(var36);
    boolean var42 = var20.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "", "hi!, hi!\nhi!\n, ");
    boolean var43 = var5.equals((java.lang.Object)var42);
    int var44 = var5.getAvaliacaoNegativa();
    
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
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test447");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var4 = var3.getIdUsuario();
    java.lang.String var5 = var3.getIdUsuario();
    java.lang.String var6 = var3.getCrm();
    java.lang.String var7 = var3.getIdUsuario();
    java.lang.String var8 = var3.getIdUsuario();
    java.lang.String var9 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, \nhi!\n, "+ "'", var8.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, "));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test448");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\n, ");
    var6.setCidade("");
    java.lang.String var16 = var6.getBairro();
    java.lang.String var17 = var6.getBairro();
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test449");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test450");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, , \nhi!\n, ");
    java.lang.String var6 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , "+ "'", var6.equals("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , "));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test451");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var6.equals("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test452");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getTipo();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test453");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var15 = var6.getNumero();
    java.lang.String var16 = var6.toString();
    java.lang.String var17 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!"+ "'", var16.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!"+ "'", var17.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!"));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test454");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var11 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var12 = var11.isAvaliacao();
    java.lang.String var13 = var11.getCrm();
    boolean var14 = var11.isAvaliacao();
    var5.addAvaliacao(var11);
    java.lang.String var16 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var16.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test455");


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
    java.lang.String var27 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test456");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    java.lang.String var16 = var5.getTipo();
    model.Avaliacao var20 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var21 = var20.getCrm();
    java.lang.String var22 = var20.getCrm();
    var5.addAvaliacao(var20);
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var31 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getIdUsuario();
    var31.addAvaliacao(var35);
    int var38 = var31.getAvaliacaoNegativa();
    var31.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var45 = var31.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    var31.setEspecialidade("hi!");
    var31.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var31.setNumeroRegistro("hi!, \nhi!\n, ");
    int var52 = var31.getAvaliacaoNegativa();
    model.ProfissionalSaude var58 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var59 = var58.getNome();
    var58.setEspecialidade("hi!, \nhi!\n, ");
    var58.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var64 = var58.getTipo();
    var58.setNumeroRegistro("hi!");
    boolean var67 = var31.equals((java.lang.Object)var58);
    model.Avaliacao var71 = new model.Avaliacao("", "hi!", false);
    java.lang.String var72 = var71.getCrm();
    java.lang.String var73 = var71.getIdUsuario();
    boolean var74 = var71.isAvaliacao();
    java.lang.String var75 = var71.getCrm();
    java.lang.String var76 = var71.getCrm();
    boolean var77 = var31.equals((java.lang.Object)var76);
    int var78 = var31.getAvaliacaoNegativa();
    boolean var79 = var5.equals((java.lang.Object)var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, \nhi!\n, "+ "'", var21.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + ""+ "'", var72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + ""+ "'", var76.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test457");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoPositiva();
    int var14 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
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
    assertTrue(var14 == 0);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test458");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", true);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test459");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", true);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test460");


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
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    java.lang.String var26 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, \nhi!\n, "+ "'", var26.equals("hi!, \nhi!\n, "));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test461");


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
    int var23 = var5.getAvaliacaoNegativa();
    
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
    assertTrue(var23 == 1);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test462");


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
    java.lang.String var27 = var5.getConvenio();
    java.lang.String var28 = var5.getConvenio();
    var5.setConvenio("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, "+ "'", var28.equals("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, "));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test463");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    var6.setSala("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test464");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNome();
    var5.setNome("hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test465");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    var5.setTipo("hi!, hi!\n\n, ");
    java.lang.String var16 = var5.getNome();
    var5.setConvenio("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test466");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test467");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.toString();
    java.lang.String var12 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var12.equals("hi!, hi!\n\nhi!, "));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test468");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\n, ");
    java.lang.String var18 = var5.getNome();
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var21 = var5.getConvenio();
    java.lang.String var22 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, hi!\nhi!\n, "));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test469");


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
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test470");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Usuario var17 = new model.Usuario("hi!, \nhi!\n, ", "hi!");
    boolean var18 = var5.equals((java.lang.Object)var17);
    var5.setConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.addConvenio("hi!, \nhi!\n, ");
    boolean var27 = var5.verificaParametros("hi!, hi!\n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test471");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\n\n, , \nhi!\n, ");

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test472");


    model.Avaliacao var3 = new model.Avaliacao("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var5.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test473");


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
    int var32 = var5.getAvaliacaoNegativa();
    int var33 = var5.getAvaliacaoNegativa();
    boolean var38 = var5.verificaParametros("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test474");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test475");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var5.setEspecialidade("hi!, hi!\n\nhi!, ");
    java.lang.String var18 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var18.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test476");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test477");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var6 = var5.getAvaliacaoNegativa();
    int var7 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!");
    int var10 = var5.getAvaliacaoPositiva();
    java.lang.String var11 = var5.getTipo();
    int var12 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test478");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test479");


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
    java.lang.String var22 = var8.getTipo();
    var8.setConvenio("hi!, \nhi!\n, , hi!\n\nhi!, ");
    
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

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test480");


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
    java.lang.String var26 = var5.getNome();
    model.Avaliacao var30 = new model.Avaliacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", true);
    var5.addAvaliacao(var30);
    java.lang.String var32 = var30.getIdUsuario();
    
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
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, \nhi!\n, "+ "'", var32.equals("hi!, \nhi!\n, "));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test481");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test482");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.toString();
    java.lang.String var24 = var6.getEstado();
    java.lang.String var25 = var6.getNumero();
    var6.setNumero("hi!, hi!\n\n, , \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var23.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test483");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test484");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    java.lang.String var13 = var6.getSala();
    java.lang.String var14 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test485");


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
    var6.setBairro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test486");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.setTipo("hi!");
    int var16 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test487");


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
    var5.setTipo("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var34 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var35 = var34.getNome();
    java.lang.String var36 = var34.getNumeroRegistro();
    int var37 = var34.getAvaliacaoPositiva();
    var34.setTipo("hi!, hi!\nhi!\n, ");
    int var40 = var34.getAvaliacaoPositiva();
    java.lang.String var41 = var34.getNome();
    model.Endereco var48 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var50 = var48.equals((java.lang.Object)10L);
    java.lang.String var51 = var48.getNumero();
    var48.setNumero("");
    var48.setSala("hi!");
    boolean var56 = var34.equals((java.lang.Object)"hi!");
    var34.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var64 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var68 = new model.Avaliacao("", "hi!", false);
    java.lang.String var69 = var68.getIdUsuario();
    var64.addAvaliacao(var68);
    var34.addAvaliacao(var68);
    java.lang.String var72 = var68.getIdUsuario();
    boolean var73 = var68.isAvaliacao();
    var5.addAvaliacao(var68);
    
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
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test488");


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
    java.lang.String var29 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test489");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\n\nhi!, ", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test490");


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
    java.lang.String var38 = var6.getSala();
    
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
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test491");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    var6.setRua(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test492");


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
    var5.setNome("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test493");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!\n");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    int var8 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test494");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", true);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test495");


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
    int var61 = var5.getAvaliacaoPositiva();
    java.lang.String var62 = var5.getNome();
    
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
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test496");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    boolean var12 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, \nhi!\n, hi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test497");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    int var13 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoPositiva();
    java.lang.String var17 = var5.getConvenio();
    model.Endereco var24 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var26 = var24.equals((java.lang.Object)10L);
    var24.setCidade("");
    var24.setBairro("");
    var24.setSala("hi!");
    java.lang.String var33 = var24.toString();
    java.lang.String var34 = var24.getEstado();
    var24.setEstado("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    boolean var37 = var5.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var17.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\n\n, "+ "'", var33.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test498");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getBairro();
    java.lang.String var8 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test499");


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
    java.lang.String var24 = var5.getConvenio();
    var5.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test500");


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
    model.Avaliacao var43 = new model.Avaliacao("", "hi!", false);
    java.lang.String var44 = var43.getCrm();
    java.lang.String var45 = var43.getCrm();
    java.lang.String var46 = var43.getCrm();
    boolean var47 = var43.isAvaliacao();
    boolean var48 = var43.isAvaliacao();
    java.lang.String var49 = var43.getCrm();
    boolean var50 = var9.equals((java.lang.Object)var49);
    var9.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

}
