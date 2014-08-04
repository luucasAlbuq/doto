package randoop;

import junit.framework.*;

public class RandoopTest6 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test1");


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
    var6.setCidade("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var54 = var6.toString();
    java.lang.String var55 = var6.toString();
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
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var51.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , "+ "'", var54.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , "+ "'", var55.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var56.equals("hi!, hi!\n\nhi!, "));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test2");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getNome();
    java.lang.String var12 = var5.getTipo();
    model.Endereco var19 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var21 = var19.equals((java.lang.Object)10L);
    java.lang.String var22 = var19.getNumero();
    var19.setNumero("");
    java.lang.String var25 = var19.getSala();
    var19.setNumero("hi!");
    var19.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var30 = var5.equals((java.lang.Object)var19);
    java.lang.String var31 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test3");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    java.lang.String var24 = var17.getConvenio();
    java.lang.String var25 = var17.getEspecialidade();
    var17.setEspecialidade("hi!, \nhi!\n, ");
    boolean var28 = var2.equals((java.lang.Object)"hi!, \nhi!\n, ");
    java.lang.String var29 = var2.getNome();
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var36 = var35.getNome();
    java.lang.String var37 = var35.getNumeroRegistro();
    int var38 = var35.getAvaliacaoPositiva();
    var35.setTipo("hi!, hi!\nhi!\n, ");
    int var41 = var35.getAvaliacaoPositiva();
    var35.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var44 = var35.getNumeroRegistro();
    java.lang.String var45 = var35.getConvenio();
    var35.setRegistro("hi!, \nhi!\n, ");
    boolean var48 = var2.equals((java.lang.Object)"hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var29.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var45.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test4");


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
    var19.setConvenio(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var43 = var19.getNome();
    int var44 = var19.getAvaliacaoPositiva();
    var19.addConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var43 + "' != '" + "hi!, \nhi!\n, "+ "'", var43.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test5");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", ", hi!\n\nhi!, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test6");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var2.setNome("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test7");


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
    var8.setRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var8.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test8");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var15 = var5.verificaParametros(", \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test9");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test10");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    int var12 = var5.getAvaliacaoNegativa();
    java.lang.String var13 = var5.getNumeroRegistro();
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
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test11");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getEstado();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getSala();
    java.lang.String var10 = var6.getSala();
    var6.setEstado("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    java.lang.String var13 = var6.toString();
    var6.setSala("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
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

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test12");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    boolean var17 = var5.equals((java.lang.Object)1.0f);
    var5.setNome(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\n\n, , \nhi!\n, ");
    model.Avaliacao var25 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", true);
    boolean var26 = var25.isAvaliacao();
    var5.addAvaliacao(var25);
    var5.setRegistro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test13");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    int var10 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test14");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var8 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    java.lang.String var11 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test15");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    boolean var9 = var5.equals((java.lang.Object)(byte)100);
    int var10 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    java.lang.String var15 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test16");


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
    java.lang.String var32 = var6.getSala();
    java.lang.String var33 = var6.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\n\n, "+ "'", var33.equals("hi!, hi!\n\n, "));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test17");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test18");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    java.lang.String var13 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test19");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var2.getIdentificacao();
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var12.getNome();
    java.lang.String var14 = var12.getNumeroRegistro();
    java.lang.String var15 = var12.getTipo();
    java.lang.String var16 = var12.getTipo();
    java.lang.String var17 = var12.getTipo();
    boolean var18 = var2.equals((java.lang.Object)var12);
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test20");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setRua("hi!, \nhi!\n, ");
    java.lang.String var10 = var6.toString();
    var6.setEstado("");
    var6.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test21");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test22");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test23");


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
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test24");


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
    java.lang.String var26 = var5.getNumeroRegistro();
    java.lang.String var27 = var5.getEspecialidade();
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test25");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getBairro();
    java.lang.String var13 = var6.getNumero();
    var6.setBairro("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test26");


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
    boolean var57 = var51.equals((java.lang.Object)"hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var58 = var51.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var58.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test27");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    var23.setCidade("");
    var23.setBairro("");
    java.lang.String var30 = var23.getNumero();
    boolean var31 = var6.equals((java.lang.Object)var23);
    var6.setCidade("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var34 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!, \nhi!\n, "+ "'", var34.equals("hi!, \nhi!\n, "));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test28");


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
    model.Usuario var34 = new model.Usuario("hi!", "hi!");
    java.lang.String var35 = var34.getNome();
    java.lang.String var36 = var34.getIdentificacao();
    var34.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var39 = var5.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test29");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\n, , \nhi!\n, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test30");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    var8.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var22 = var8.getEspecialidade();
    model.Endereco var29 = new model.Endereco("hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "");
    var29.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    boolean var32 = var8.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test31");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var6.getRua();
    var6.setNumero("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\n, "));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test32");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test33");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    java.lang.String var21 = var6.getBairro();
    java.lang.String var22 = var6.getNumero();
    var6.setBairro("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test34");


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
    var6.setSala("hi!, hi!\n\n, , \nhi!\n, ");
    
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

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test35");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    boolean var16 = var5.verificaParametros(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \n");
    int var17 = var5.getAvaliacaoPositiva();
    java.lang.String var18 = var5.getNumeroRegistro();
    java.lang.String var19 = var5.getTipo();
    var5.addConvenio("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test36");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var7 = var6.getRua();
    model.ProfissionalSaude var13 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var17 = new model.Avaliacao("", "hi!", false);
    java.lang.String var18 = var17.getIdUsuario();
    var13.addAvaliacao(var17);
    int var20 = var13.getAvaliacaoPositiva();
    var13.addConvenio("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("", "hi!", false);
    java.lang.String var33 = var32.getIdUsuario();
    var28.addAvaliacao(var32);
    int var35 = var28.getAvaliacaoNegativa();
    var28.addConvenio("hi!");
    java.lang.String var38 = var28.getTipo();
    java.lang.String var39 = var28.getConvenio();
    boolean var40 = var13.equals((java.lang.Object)var28);
    boolean var45 = var13.verificaParametros("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!", "");
    var13.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var48 = var13.getEspecialidade();
    java.lang.String var49 = var13.getConvenio();
    java.lang.String var50 = var13.getTipo();
    boolean var51 = var6.equals((java.lang.Object)var50);
    java.lang.String var52 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var7.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var39.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var49.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var52.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test37");


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
    java.lang.String var48 = var6.getRua();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!, \nhi!\n, "+ "'", var48.equals("hi!, \nhi!\n, "));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test38");


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
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
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

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test39");


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
    boolean var30 = var15.verificaParametros("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var34 = new model.Avaliacao("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", false);
    var15.addAvaliacao(var34);
    var15.setConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test40");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!", "", "hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var9 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "+ "'", var9.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , "));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test41");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNome();
    var5.setNome("hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    java.lang.String var17 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test42");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    var6.setCidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var12 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, "+ "'", var12.equals("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test43");


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
    var2.setIdentificacao("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test44");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    int var11 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test45");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var10 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test46");


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
    java.lang.String var24 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, \nhi!\n, "+ "'", var21.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, "+ "'", var24.equals("hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, "));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test47");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!\n", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test48");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var10 = var6.getSala();
    var6.setBairro("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test49");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    var6.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var22 = var20.equals((java.lang.Object)10L);
    java.lang.String var23 = var20.getNumero();
    var20.setNumero("");
    java.lang.String var26 = var20.getSala();
    var20.setNumero("hi!");
    java.lang.String var29 = var20.getBairro();
    var20.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var32 = var20.getRua();
    java.lang.String var33 = var20.getSala();
    boolean var34 = var6.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test50");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test51");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
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
    var8.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var27 = var8.getTipo();
    java.lang.String var28 = var8.getNumeroRegistro();
    boolean var29 = var2.equals((java.lang.Object)var8);
    model.ProfissionalSaude var35 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var36 = var35.getNome();
    java.lang.String var37 = var35.getNumeroRegistro();
    int var38 = var35.getAvaliacaoPositiva();
    var35.setTipo("hi!, hi!\nhi!\n, ");
    int var41 = var35.getAvaliacaoPositiva();
    java.lang.String var42 = var35.getNome();
    model.Endereco var49 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var51 = var49.equals((java.lang.Object)10L);
    java.lang.String var52 = var49.getNumero();
    var49.setNumero("");
    var49.setSala("hi!");
    boolean var57 = var35.equals((java.lang.Object)"hi!");
    var35.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var65 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var69 = new model.Avaliacao("", "hi!", false);
    java.lang.String var70 = var69.getIdUsuario();
    var65.addAvaliacao(var69);
    var35.addAvaliacao(var69);
    java.lang.String var73 = var35.getNumeroRegistro();
    java.lang.String var74 = var35.getNome();
    var35.setNumeroRegistro("");
    var35.setNome("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var35.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var81 = var35.getNome();
    boolean var86 = var35.verificaParametros("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var87 = var2.equals((java.lang.Object)", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var73.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!"+ "'", var74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var81.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test52");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getTipo();
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var17 = var5.getEspecialidade();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var5.setEspecialidade("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    
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

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test53");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!\n", false);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!\n"+ "'", var4.equals("hi!\n"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test54");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao(", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test55");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    boolean var4 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test56");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getEspecialidade();
    var5.setConvenio("hi!, \nhi!\n, ");
    var5.setConvenio("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    java.lang.String var22 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , "+ "'", var22.equals("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , "));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test57");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!\n");
    var5.setNome("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test58");


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
    int var20 = var5.getAvaliacaoNegativa();
    java.lang.String var21 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test59");


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
    var5.setConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var29.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test60");


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
    model.ProfissionalSaude var40 = new model.ProfissionalSaude(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var40.setRegistro(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var43 = var40.getConvenio();
    boolean var44 = var2.equals((java.lang.Object)var40);
    
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
    assertTrue("'" + var43 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var43.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test61");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!");

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test62");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    java.lang.String var15 = var6.getEstado();
    java.lang.String var16 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test63");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    java.lang.String var18 = var6.getBairro();
    var6.setEstado("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var21 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test64");


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
    java.lang.String var27 = var6.getCidade();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test65");


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
    boolean var59 = var55.isAvaliacao();
    boolean var60 = var55.isAvaliacao();
    
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
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test66");


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
    var5.setConvenio(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
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

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test67");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setTipo("hi!, \nhi!\nhi!, ");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test68");


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
    java.lang.String var35 = var14.getRua();
    
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

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test69");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test70");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setRua("hi!");
    java.lang.String var15 = var6.getRua();
    var6.setEstado("hi!, hi!\nhi!\nhi!, ");
    var6.setRua(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    var6.setSala("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var22 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!"+ "'", var22.equals(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test71");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setNumeroRegistro("");
    var8.setConvenio("hi!");
    var8.setEspecialidade("hi!, \nhi!\n, ");
    var8.setTipo("hi!");
    boolean var27 = var8.verificaParametros("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!");
    boolean var28 = var2.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test72");


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
    boolean var71 = var64.isAvaliacao();
    
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
    assertTrue(var71 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test73");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.toString();
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var16 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test74");


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
    var5.setConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var5.addConvenio("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var29.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test75");


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
    java.lang.String var21 = var5.getEspecialidade();
    var5.setEspecialidade(", hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test76");


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
    var14.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test77");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    model.Usuario var15 = new model.Usuario("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    var15.setIdentificacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    boolean var18 = var5.equals((java.lang.Object)"hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test78");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!", false);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var5.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test79");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setRua("hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test80");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, \nhi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    model.Usuario var9 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var10 = var6.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test81");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test82");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getCrm();
    java.lang.String var6 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var4.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test83");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNumeroRegistro();
    java.lang.String var15 = var5.getTipo();
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test84");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var5.setTipo("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var24 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test85");


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
    java.lang.String var22 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, \nhi!\n, "+ "'", var22.equals("hi!, \nhi!\n, "));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test86");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, ", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test87");


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
    java.lang.String var37 = var20.getEspecialidade();
    
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
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test88");


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
    model.ProfissionalSaude var32 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var36 = new model.Avaliacao("", "hi!", false);
    java.lang.String var37 = var36.getIdUsuario();
    var32.addAvaliacao(var36);
    int var39 = var32.getAvaliacaoPositiva();
    var32.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Usuario var44 = new model.Usuario("hi!, \nhi!\n, ", "hi!");
    boolean var45 = var32.equals((java.lang.Object)var44);
    var32.setConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var32.addConvenio("hi!, \nhi!\n, ");
    var32.setEspecialidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    boolean var52 = var5.equals((java.lang.Object)", hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test89");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var10 = var5.verificaParametros("hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test90");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setBairro("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getRua();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test91");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var11 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test92");


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
    java.lang.String var24 = var21.getCrm();
    boolean var25 = var21.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test93");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, "));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test94");


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
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var61 = var2.getIdentificacao();
    
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
    assertTrue("'" + var61 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var61.equals("hi!, \nhi!\n, hi!"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test95");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getSala();
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

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test96");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!\n", "hi!, hi!\n\n, ", "", "");
    java.lang.String var20 = var5.getConvenio();
    int var21 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "+ "'", var20.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test97");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    java.lang.String var5 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test98");


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
    var13.setCidade("hi!, hi!\nhi!\nhi!, ");
    
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

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test99");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!");
    model.Avaliacao var9 = new model.Avaliacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var9);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test100");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!\n");
    java.lang.String var18 = var5.getNumeroRegistro();
    java.lang.String var19 = var5.getNome();
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getNumeroRegistro();
    java.lang.String var28 = var25.getTipo();
    java.lang.String var29 = var25.getTipo();
    var25.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var25.addConvenio("hi!, hi!\n\n, ");
    boolean var34 = var5.equals((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test101");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setSala("hi!, hi!\n\nhi!, ");
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test102");


    model.Avaliacao var3 = new model.Avaliacao(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test103");


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
    java.lang.String var22 = var9.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test104");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test105");


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
    var12.setEstado(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var12.getSala();
    java.lang.String var23 = var12.getNumero();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test106");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getCidade();
    var6.setSala("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var13 = var6.getEstado();
    java.lang.String var14 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test107");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.getRua();
    java.lang.String var14 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\n, "));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test108");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var5.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test109");


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
    model.ProfissionalSaude var48 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var49 = var48.getNome();
    java.lang.String var50 = var48.getNumeroRegistro();
    int var51 = var48.getAvaliacaoPositiva();
    var48.setTipo("hi!, hi!\nhi!\n, ");
    int var54 = var48.getAvaliacaoPositiva();
    var48.addConvenio("hi!, hi!\nhi!\n, ");
    var48.setNumeroRegistro("hi!, \nhi!\n, ");
    model.Avaliacao var62 = new model.Avaliacao("", "hi!", false);
    java.lang.String var63 = var62.getCrm();
    boolean var64 = var48.equals((java.lang.Object)var62);
    java.lang.String var65 = var48.getNome();
    java.lang.String var66 = var48.getConvenio();
    var48.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var69 = var2.equals((java.lang.Object)var48);
    java.lang.String var70 = var48.getConvenio();
    
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
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var66.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var70.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test110");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test111");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var13 = var12.getNome();
    java.lang.String var14 = var12.getNumeroRegistro();
    int var15 = var12.getAvaliacaoPositiva();
    var12.setTipo("hi!, hi!\nhi!\n, ");
    int var18 = var12.getAvaliacaoPositiva();
    var12.addConvenio("hi!, hi!\nhi!\n, ");
    var12.setNumeroRegistro("hi!, \nhi!\n, ");
    int var23 = var12.getAvaliacaoPositiva();
    boolean var25 = var12.equals((java.lang.Object)100L);
    boolean var26 = var2.equals((java.lang.Object)100L);
    model.ProfissionalSaude var32 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\n\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \n");
    boolean var33 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \n");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var36 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ");
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
    var47.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    boolean var68 = var2.equals((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var36.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test112");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", \nhi!\n, hi!", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\n\n, ");
    java.lang.String var9 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\n\n, "+ "'", var9.equals("hi!, hi!\n\n, "));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test113");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    java.lang.String var21 = var6.getBairro();
    java.lang.String var22 = var6.getEstado();
    java.lang.String var23 = var6.getCidade();
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test114");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var19 = var5.getAvaliacaoPositiva();
    java.lang.String var20 = var5.getTipo();
    java.lang.String var21 = var5.getConvenio();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var21.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test115");


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
    var25.setCidade("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test116");


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
    java.lang.String var54 = var50.getSala();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var54.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test117");


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
    var6.setBairro("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var19.equals("hi!, hi!\n\nhi!, "));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test118");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test119");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getIdentificacao();
    model.Endereco var10 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var11 = var10.getNumero();
    var10.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var14 = var10.getRua();
    var10.setCidade("hi!, hi!\nhi!\nhi!, ");
    var10.setCidade("hi!, hi!\nhi!\nhi!, ");
    var10.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var21 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var3.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test120");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test121");


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
    int var37 = var24.getAvaliacaoPositiva();
    var24.setRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var40 = var24.getAvaliacaoNegativa();
    
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
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test122");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test123");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var6 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test124");


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
    var5.setEspecialidade("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
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

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test125");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var15 = var6.getCidade();
    model.Avaliacao var19 = new model.Avaliacao("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", true);
    boolean var20 = var19.isAvaliacao();
    boolean var21 = var6.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test126");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test127");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, \nhi!\nhi!, ");

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test128");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var6 = var5.getConvenio();
    boolean var11 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var5.setConvenio(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var6.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test129");


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
    boolean var32 = var8.verificaParametros("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test130");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test131");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("");

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test132");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ");

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test133");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, \nhi!\nhi!, ", "hi!, hi!\n\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test134");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setEspecialidade("");
    int var14 = var5.getAvaliacaoNegativa();
    java.lang.String var15 = var5.getNumeroRegistro();
    boolean var20 = var5.verificaParametros("hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var21 = var5.getTipo();
    
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
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test135");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", false);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var4.equals("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test136");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getTipo();
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var17 = var5.getNumeroRegistro();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    var5.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test137");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoPositiva();
    java.lang.String var14 = var5.getNumeroRegistro();
    java.lang.String var15 = var5.getConvenio();
    java.lang.String var16 = var5.getEspecialidade();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test138");


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
    boolean var25 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var26 = var5.getTipo();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\n, "));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test139");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var6.setEstado(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getEstado();
    java.lang.String var15 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var14.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test140");


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
    java.lang.String var22 = var15.getNumero();
    java.lang.String var23 = var15.getRua();
    model.Endereco var30 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var31 = var30.getEstado();
    java.lang.String var32 = var30.getCidade();
    java.lang.String var33 = var30.getCidade();
    model.Endereco var40 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var42 = var40.equals((java.lang.Object)10L);
    var40.setCidade("");
    var40.setBairro("");
    var40.setSala("hi!");
    java.lang.String var49 = var40.toString();
    java.lang.String var50 = var40.getEstado();
    var40.setEstado("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var53 = var40.toString();
    boolean var54 = var30.equals((java.lang.Object)var53);
    var30.setCidade("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    boolean var57 = var15.equals((java.lang.Object)"hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    var15.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, \nhi!\n, "+ "'", var31.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var33.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, hi!\n\n, "+ "'", var49.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, "+ "'", var53.equals("hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test141");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\n, ", ", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test142");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var8.getNome();
    var8.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var18 = var17.getNome();
    java.lang.String var19 = var17.getNumeroRegistro();
    int var20 = var17.getAvaliacaoPositiva();
    var17.setTipo("hi!, hi!\nhi!\n, ");
    int var23 = var17.getAvaliacaoPositiva();
    var17.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var26 = var17.getConvenio();
    boolean var27 = var8.equals((java.lang.Object)var17);
    var17.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var17.setRegistro("hi!, \nhi!\n, ");
    java.lang.String var32 = var17.getConvenio();
    var17.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var35 = var2.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test143");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var6 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test144");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    var6.setEstado("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test145");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var10 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test146");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test147");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var5.addAvaliacao(var21);
    boolean var23 = var21.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test148");


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
    boolean var62 = var25.verificaParametros("hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var63 = var25.getTipo();
    
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
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var63.equals("hi!, hi!\nhi!\n, "));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test149");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    boolean var13 = var5.equals((java.lang.Object)1.0d);
    java.lang.String var14 = var5.getNumeroRegistro();
    var5.setNumeroRegistro(", hi!\n\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test150");


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
    boolean var48 = var39.isAvaliacao();
    
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
    assertTrue(var48 == false);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test151");


    model.Usuario var2 = new model.Usuario("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test152");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    java.lang.String var13 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test153");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var6 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, "));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test154");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var6 = var5.getNome();
    var5.setNome("hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, \nhi!\n, "+ "'", var6.equals("hi!, \nhi!\n, "));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test155");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var2.getIdentificacao();
    model.ProfissionalSaude var13 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var17 = new model.Avaliacao("", "hi!", false);
    java.lang.String var18 = var17.getIdUsuario();
    var13.addAvaliacao(var17);
    java.lang.String var20 = var13.getNumeroRegistro();
    var13.setNumeroRegistro("hi!, \nhi!\n, ");
    boolean var23 = var2.equals((java.lang.Object)"hi!, \nhi!\n, ");
    model.Endereco var30 = new model.Endereco("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", "hi!\n");
    boolean var31 = var2.equals((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var7.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test156");


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
    java.lang.String var33 = var20.getEspecialidade();
    java.lang.String var34 = var20.getEspecialidade();
    var20.setEspecialidade("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    model.Avaliacao var40 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    boolean var41 = var40.isAvaliacao();
    boolean var42 = var40.isAvaliacao();
    java.lang.String var43 = var40.getIdUsuario();
    var20.addAvaliacao(var40);
    
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
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!, \nhi!\n, "+ "'", var43.equals("hi!, \nhi!\n, "));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test157");


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
    var15.setTipo("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test158");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", true);
    java.lang.String var4 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var4.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test159");


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
    var15.setRua(", \nhi!\n, hi!");
    
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

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test160");


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
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    
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

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test161");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test162");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setRua("hi!");
    java.lang.String var15 = var6.getRua();
    var6.setEstado("hi!, hi!\nhi!\nhi!, ");
    var6.setRua(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    java.lang.String var20 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test163");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var3 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var3.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test164");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    model.ProfissionalSaude var10 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var14 = new model.Avaliacao("", "hi!", false);
    java.lang.String var15 = var14.getIdUsuario();
    var10.addAvaliacao(var14);
    java.lang.String var17 = var10.getTipo();
    java.lang.String var18 = var10.getTipo();
    var10.setTipo("hi!");
    var10.setNumeroRegistro("hi!, hi!\n\nhi!, ");
    var10.setEspecialidade("hi!");
    java.lang.String var25 = var10.getNumeroRegistro();
    java.lang.String var26 = var10.getEspecialidade();
    boolean var27 = var2.equals((java.lang.Object)var26);
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var25.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test165");


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
    var9.setCidade("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
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

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test166");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("");
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test167");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    java.lang.String var7 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test168");


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
    var5.setEspecialidade("hi!, hi!\n\nhi!, ");
    java.lang.String var22 = var5.getNome();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test169");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var8.getNome();
    var8.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var12 = var2.equals((java.lang.Object)"hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.Endereco var19 = new model.Endereco("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var20 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var23 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test170");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\nhi!, ", ", hi!\n\nhi!, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test171");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    java.lang.String var23 = var6.getEstado();
    java.lang.String var24 = var6.getRua();
    java.lang.String var25 = var6.toString();
    
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var25.equals("hi!, hi!\n\nhi!, "));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test172");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Avaliacao var22 = new model.Avaliacao("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", true);
    java.lang.String var23 = var22.getCrm();
    java.lang.String var24 = var22.getIdUsuario();
    java.lang.String var25 = var22.getCrm();
    var5.addAvaliacao(var22);
    var5.setTipo(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var23.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var25.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test173");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var17 = var5.getNumeroRegistro();
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    int var20 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test174");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    int var13 = var5.getAvaliacaoPositiva();
    java.lang.String var14 = var5.getConvenio();
    var5.setRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
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

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test175");


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
    java.lang.String var26 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test176");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getTipo();
    var5.setConvenio(", hi!\n\nhi!, hi!, \nhi!\n, ");
    int var14 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test177");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getConvenio();
    var8.setRegistro(", hi!\n\nhi!, ");
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var29 = var28.getNome();
    java.lang.String var30 = var28.getNumeroRegistro();
    int var31 = var28.getAvaliacaoPositiva();
    var28.setTipo("hi!, hi!\nhi!\n, ");
    int var34 = var28.getAvaliacaoPositiva();
    java.lang.String var35 = var28.getNome();
    model.Endereco var42 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var44 = var42.equals((java.lang.Object)10L);
    java.lang.String var45 = var42.getNumero();
    var42.setNumero("");
    var42.setSala("hi!");
    boolean var50 = var28.equals((java.lang.Object)"hi!");
    var28.setTipo("hi!, hi!\nhi!\n, ");
    boolean var57 = var28.verificaParametros("hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var61 = new model.Avaliacao("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    boolean var62 = var61.isAvaliacao();
    var28.addAvaliacao(var61);
    java.lang.String var64 = var61.getIdUsuario();
    var8.addAvaliacao(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!\n"+ "'", var20.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var64.equals("hi!, hi!\nhi!\n, "));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test178");


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
    var8.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var33 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", true);
    boolean var34 = var8.equals((java.lang.Object)true);
    
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
    assertTrue(var34 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test179");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("");
    var6.setNumero("");
    java.lang.String var12 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test180");


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
    java.lang.String var21 = var5.getEspecialidade();
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    boolean var28 = var5.verificaParametros("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var21 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var21.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test181");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getRua();
    var6.setNumero("hi!, \nhi!\n, ");
    java.lang.String var12 = var6.getSala();
    java.lang.String var13 = var6.getNumero();
    var6.setNumero(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, \nhi!\n, "+ "'", var13.equals("hi!, \nhi!\n, "));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test182");


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
    java.lang.String var26 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test183");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    java.lang.String var7 = var2.getIdentificacao();
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
    var13.setTipo("hi!, hi!\nhi!\n, ");
    var13.setConvenio("hi!, hi!\n\nhi!, ");
    java.lang.String var40 = var13.getNome();
    java.lang.String var41 = var13.getNumeroRegistro();
    boolean var42 = var2.equals((java.lang.Object)var41);
    java.lang.String var43 = var2.getNome();
    model.Usuario var46 = new model.Usuario("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    boolean var47 = var2.equals((java.lang.Object)var46);
    model.ProfissionalSaude var53 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var57 = new model.Avaliacao("", "hi!", false);
    java.lang.String var58 = var57.getIdUsuario();
    var53.addAvaliacao(var57);
    java.lang.String var60 = var53.getTipo();
    int var61 = var53.getAvaliacaoPositiva();
    model.Endereco var68 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var69 = var68.getNumero();
    model.Endereco var76 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var77 = var76.getNumero();
    var76.setCidade("hi!");
    model.Endereco var86 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var88 = var86.equals((java.lang.Object)10L);
    java.lang.String var89 = var86.getNumero();
    boolean var90 = var76.equals((java.lang.Object)var89);
    var76.setBairro("");
    java.lang.String var93 = var76.getBairro();
    var76.setNumero("hi!, hi!\nhi!\n, ");
    boolean var96 = var68.equals((java.lang.Object)var76);
    boolean var97 = var53.equals((java.lang.Object)var76);
    boolean var98 = var2.equals((java.lang.Object)var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
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
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!"+ "'", var77.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi!"+ "'", var89.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + ""+ "'", var93.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test184");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var8 = var5.getNome();
    model.Avaliacao var12 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", false);
    boolean var13 = var12.isAvaliacao();
    var5.addAvaliacao(var12);
    boolean var15 = var12.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var8.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test185");


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
    java.lang.String var35 = var5.getEspecialidade();
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
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test186");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setConvenio("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ");

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test187");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", true);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test188");


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
    java.lang.String var21 = var5.getNumeroRegistro();
    int var22 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var20.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var21.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test189");


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
    boolean var31 = var27.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test190");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test191");


    model.Usuario var2 = new model.Usuario("", "");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var10 = var9.getNumero();
    var9.setNumero("hi!, hi!\nhi!\nhi!, ");
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var15 = var2.equals((java.lang.Object)var9);
    var9.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var9.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    var9.setNumero("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test192");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.setRegistro(", hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test193");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test194");


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
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test195");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var21 = var6.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var6.getBairro();
    java.lang.String var23 = var6.getBairro();
    java.lang.String var24 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, \nhi!\n, "+ "'", var24.equals("hi!, \nhi!\n, "));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test196");


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
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test197");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var10 = var6.getRua();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var10.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test198");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    java.lang.String var12 = var6.getRua();
    var6.setRua("hi!");
    java.lang.String var15 = var6.getEstado();
    java.lang.String var16 = var6.toString();
    java.lang.String var17 = var6.getSala();
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var20 = var6.getSala();
    java.lang.String var21 = var6.getCidade();
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var30 = var28.equals((java.lang.Object)10L);
    var28.setCidade("");
    var28.setBairro("");
    var28.setSala("hi!");
    java.lang.String var37 = var28.toString();
    java.lang.String var38 = var28.getEstado();
    model.Endereco var45 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var47 = var45.equals((java.lang.Object)10L);
    var45.setCidade("");
    var45.setBairro("");
    var45.setSala("hi!");
    java.lang.String var54 = var45.toString();
    java.lang.String var55 = var45.getEstado();
    boolean var56 = var28.equals((java.lang.Object)var55);
    var28.setBairro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    boolean var59 = var6.equals((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var16.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!, hi!\n\n, "+ "'", var37.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!, hi!\n\n, "+ "'", var54.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test199");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", false);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test200");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, ");
    java.lang.String var5 = var2.getIdentificacao();
    boolean var7 = var2.equals((java.lang.Object)"hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test201");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var5.getEspecialidade();
    int var23 = var5.getAvaliacaoPositiva();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test202");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test203");


    model.Usuario var2 = new model.Usuario(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test204");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    java.lang.String var30 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test205");


    model.Endereco var6 = new model.Endereco(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "");
    var6.setEstado("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test206");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var12 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var12.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test207");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var13 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\n\nhi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!, hi!\nhi!\n, "));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test208");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    int var6 = var5.getAvaliacaoNegativa();
    java.lang.String var7 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test209");


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
    java.lang.String var31 = var6.getRua();
    java.lang.String var32 = var6.getEstado();
    var6.setSala("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    
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
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, \nhi!\n, "+ "'", var32.equals("hi!, \nhi!\n, "));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test210");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!");
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test211");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test212");


    model.Endereco var6 = new model.Endereco(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!\n", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setBairro(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    var6.setEstado("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    var6.setSala("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test213");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.getBairro();
    java.lang.String var14 = var6.getEstado();
    java.lang.String var15 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test214");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setNome("hi!");
    java.lang.String var6 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var16 = var15.getNumero();
    boolean var17 = var2.equals((java.lang.Object)var15);
    java.lang.String var18 = var15.getCidade();
    var15.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Endereco var27 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var27.setCidade("");
    var27.setBairro("hi!");
    var27.setSala("hi!");
    model.Usuario var36 = new model.Usuario("", "");
    java.lang.String var37 = var36.getIdentificacao();
    var36.setIdentificacao("hi!");
    var36.setIdentificacao("hi!");
    boolean var42 = var27.equals((java.lang.Object)"hi!");
    java.lang.String var43 = var27.getSala();
    java.lang.String var44 = var27.getNumero();
    java.lang.String var45 = var27.getBairro();
    boolean var46 = var15.equals((java.lang.Object)var27);
    
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
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test215");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test216");


    model.Endereco var6 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var9 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test217");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test218");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    java.lang.String var15 = var6.toString();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var25 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var29 = new model.Avaliacao("", "hi!", false);
    java.lang.String var30 = var29.getIdUsuario();
    var25.addAvaliacao(var29);
    var25.setTipo("hi!, \nhi!\n, ");
    var25.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    var25.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var41 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    var25.addAvaliacao(var41);
    boolean var47 = var25.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "", "hi!, hi!\nhi!\n, ");
    boolean var48 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\n, ");
    java.lang.String var49 = var6.getCidade();
    java.lang.String var50 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var49.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, "+ "'", var50.equals(", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, "));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test219");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.addConvenio("");
    java.lang.String var20 = var8.getNome();
    java.lang.String var21 = var8.getEspecialidade();
    boolean var26 = var8.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    java.lang.String var27 = var8.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test220");


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
    int var77 = var40.getAvaliacaoNegativa();
    java.lang.String var78 = var40.getConvenio();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var78.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test221");


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
    var13.setCidade("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    java.lang.String var25 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , "+ "'", var25.equals("hi!, \nhi!\n, , hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , "));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test222");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("hi!, \nhi!\n, ");
    java.lang.String var17 = var6.getEstado();
    var6.setBairro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
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
    java.lang.String var47 = var28.getEstado();
    java.lang.String var48 = var28.getBairro();
    boolean var49 = var6.equals((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
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
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test223");


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
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    var6.setRua("hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test224");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test225");


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
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
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

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test226");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    model.Usuario var5 = new model.Usuario("", "");
    model.Endereco var12 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var13 = var12.getNumero();
    var12.setNumero("hi!, hi!\nhi!\nhi!, ");
    var12.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var18 = var5.equals((java.lang.Object)var12);
    var12.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var12.setRua("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var12.setRua("hi!, \nhi!\n, hi!");
    java.lang.String var25 = var12.getSala();
    boolean var26 = var2.equals((java.lang.Object)var25);
    model.Endereco var33 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var35 = var33.equals((java.lang.Object)10L);
    var33.setCidade("");
    var33.setBairro("");
    var33.setSala("hi!");
    java.lang.String var42 = var33.toString();
    java.lang.String var43 = var33.getEstado();
    boolean var44 = var2.equals((java.lang.Object)var33);
    var2.setIdentificacao("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var47 = var2.getNome();
    model.ProfissionalSaude var53 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var54 = var53.getNome();
    java.lang.String var55 = var53.getNumeroRegistro();
    int var56 = var53.getAvaliacaoPositiva();
    var53.setTipo("hi!, hi!\nhi!\n, ");
    int var59 = var53.getAvaliacaoPositiva();
    var53.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var62 = var53.getNumeroRegistro();
    java.lang.String var63 = var53.getConvenio();
    var53.setRegistro("hi!, \nhi!\n, ");
    var53.setEspecialidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var53.setEspecialidade("hi!, hi!\n\nhi!, ");
    var53.setNome("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var72 = var2.equals((java.lang.Object)var53);
    var53.setEspecialidade(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!, hi!\n\n, "+ "'", var42.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var47.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var63.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test227");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    java.lang.String var11 = var5.getEspecialidade();
    boolean var16 = var5.verificaParametros("hi!, hi!\n\nhi!, ", "hi!\n", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var17 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test228");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var7 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test229");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ");

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test230");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    java.lang.String var17 = var6.toString();
    java.lang.String var18 = var6.toString();
    var6.setRua("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    var6.setSala("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, , hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , , hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\n\n, "+ "'", var17.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\n\n, "+ "'", var18.equals("hi!, hi!\n\n, "));

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test231");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    var6.setCidade("hi!, \nhi!\n, ");
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var6.setRua("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test232");


    model.Avaliacao var3 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", true);
    java.lang.String var4 = var3.getCrm();
    boolean var5 = var3.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test233");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    var6.setCidade("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var7.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test234");


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
    model.ProfissionalSaude var32 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var36 = new model.Avaliacao("", "hi!", false);
    java.lang.String var37 = var36.getIdUsuario();
    var32.addAvaliacao(var36);
    var32.setConvenio("hi!");
    var32.setNome("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var46 = new model.Avaliacao("", "hi!", false);
    java.lang.String var47 = var46.getCrm();
    java.lang.String var48 = var46.getCrm();
    boolean var49 = var46.isAvaliacao();
    java.lang.String var50 = var46.getCrm();
    java.lang.String var51 = var46.getCrm();
    var32.addAvaliacao(var46);
    java.lang.String var53 = var32.getNome();
    model.Avaliacao var57 = new model.Avaliacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, ", true);
    var32.addAvaliacao(var57);
    model.Avaliacao var62 = new model.Avaliacao("", "hi!", false);
    java.lang.String var63 = var62.getCrm();
    java.lang.String var64 = var62.getCrm();
    var32.addAvaliacao(var62);
    java.lang.String var66 = var62.getCrm();
    var8.addAvaliacao(var62);
    java.lang.String var68 = var62.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var53.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test235");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setSala("hi!");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getEstado();
    var6.setEstado("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var19 = var6.getSala();
    java.lang.String var20 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\n, "+ "'", var15.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test236");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", true);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test237");


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
    java.lang.String var50 = var45.getIdUsuario();
    
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
    assertTrue("'" + var50 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var50.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test238");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!", false);
    java.lang.String var4 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var4.equals("hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test239");


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
    var6.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.ProfissionalSaude var40 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var44 = new model.Avaliacao("", "hi!", false);
    java.lang.String var45 = var44.getIdUsuario();
    var40.addAvaliacao(var44);
    var40.setNumeroRegistro("");
    java.lang.String var49 = var40.getConvenio();
    model.Avaliacao var53 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var40.addAvaliacao(var53);
    boolean var55 = var6.equals((java.lang.Object)var53);
    
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
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var49.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test240");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test241");


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
    java.lang.String var26 = var5.getTipo();
    
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
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\n, "));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test242");


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
    java.lang.String var30 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test243");


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
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var31 = var5.getNumeroRegistro();
    java.lang.String var32 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test244");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Avaliacao var22 = new model.Avaliacao("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", false);
    var5.addAvaliacao(var22);
    boolean var24 = var22.isAvaliacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test245");


    model.Usuario var2 = new model.Usuario("", "");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var10 = var9.getNumero();
    var9.setNumero("hi!, hi!\nhi!\nhi!, ");
    var9.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var15 = var2.equals((java.lang.Object)var9);
    model.Usuario var18 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var18.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var18.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var23 = var18.getNome();
    java.lang.String var24 = var18.getNome();
    boolean var25 = var2.equals((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test246");


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
    java.lang.String var30 = var20.getEspecialidade();
    
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

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test247");


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
    java.lang.String var25 = var8.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test248");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!\n\nhi!, ");
    var6.setSala("hi!, \nhi!\n, ");
    boolean var20 = var6.equals((java.lang.Object)(-1L));
    var6.setRua("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test249");


    model.Endereco var6 = new model.Endereco("hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test250");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNome();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!");
    int var15 = var5.getAvaliacaoPositiva();
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test251");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setRegistro(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var14 = var5.verificaParametros("hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test252");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    java.lang.String var11 = var6.getEstado();
    model.Endereco var18 = new model.Endereco("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!");
    boolean var19 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, ");
    java.lang.String var20 = var6.toString();
    java.lang.String var21 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var20.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test253");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setRua("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var13 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test254");


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
    java.lang.String var30 = var28.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var30.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test255");


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
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    java.lang.String var37 = var30.getNumeroRegistro();
    java.lang.String var38 = var30.getTipo();
    var30.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Avaliacao var44 = new model.Avaliacao("hi!", "", true);
    var30.addAvaliacao(var44);
    boolean var46 = var2.equals((java.lang.Object)var44);
    java.lang.String var47 = var44.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test256");


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
    var11.setConvenio("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var11.setNumeroRegistro("hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ");
    
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

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test257");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var8 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var12 = new model.Avaliacao("", "hi!", false);
    java.lang.String var13 = var12.getIdUsuario();
    var8.addAvaliacao(var12);
    var8.setConvenio("hi!");
    boolean var17 = var2.equals((java.lang.Object)var8);
    var8.setConvenio("hi!, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test258");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getEstado();
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var13 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var10.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test259");


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
    java.lang.String var22 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var22.equals("hi!, hi!\n\nhi!, "));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test260");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!");
    java.lang.String var14 = var6.getNumero();
    java.lang.String var15 = var6.toString();
    model.Avaliacao var19 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var20 = var19.isAvaliacao();
    java.lang.String var21 = var19.getCrm();
    boolean var22 = var19.isAvaliacao();
    boolean var23 = var6.equals((java.lang.Object)var19);
    var6.setRua(", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test261");


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

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test262");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test263");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getNumeroRegistro();
    var5.setNome(", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var11.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test264");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.setTipo("hi!, hi!\nhi!\n, ");
    int var11 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var5.getNome();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\n\n, ");
    model.Avaliacao var22 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var23 = var22.isAvaliacao();
    var5.addAvaliacao(var22);
    boolean var25 = var22.isAvaliacao();
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test265");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test266");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    var6.setCidade("");
    var6.setBairro("");
    var6.setCidade("hi!");
    var6.setEstado("");
    java.lang.String var17 = var6.getSala();
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test267");


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
    java.lang.String var23 = var5.getNome();
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test268");


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
    var5.setRegistro("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test269");


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
    java.lang.String var30 = var14.getTipo();
    var14.setNumeroRegistro("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var38 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var39 = var38.getNome();
    java.lang.String var40 = var38.getNumeroRegistro();
    int var41 = var38.getAvaliacaoPositiva();
    var38.setTipo("hi!, hi!\nhi!\n, ");
    int var44 = var38.getAvaliacaoPositiva();
    var38.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var47 = var38.getNumeroRegistro();
    var38.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Avaliacao var53 = new model.Avaliacao("", "hi!", false);
    java.lang.String var54 = var53.getCrm();
    java.lang.String var55 = var53.getCrm();
    java.lang.String var56 = var53.getCrm();
    boolean var57 = var53.isAvaliacao();
    java.lang.String var58 = var53.getIdUsuario();
    java.lang.String var59 = var53.getCrm();
    var38.addAvaliacao(var53);
    var14.addAvaliacao(var53);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var30.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test270");


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
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var31 = var30.getNome();
    var30.setEspecialidade("hi!, \nhi!\n, ");
    var30.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var36 = var30.getConvenio();
    var30.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var42 = new model.Avaliacao("", "hi!", false);
    java.lang.String var43 = var42.getCrm();
    java.lang.String var44 = var42.getCrm();
    java.lang.String var45 = var42.getIdUsuario();
    var30.addAvaliacao(var42);
    boolean var47 = var2.equals((java.lang.Object)var42);
    java.lang.String var48 = var2.getNome();
    var2.setNome("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    model.Endereco var57 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var58 = var57.getNumero();
    var57.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var61 = var57.getRua();
    var57.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var64 = var57.getNumero();
    var57.setRua("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var67 = var57.getCidade();
    boolean var68 = var2.equals((java.lang.Object)var57);
    
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
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var36.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var64.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var67.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test271");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    boolean var16 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \n", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test272");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test273");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    int var6 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test274");


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
    java.lang.String var21 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var21.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test275");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("");
    var6.setRua("");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test276");


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
    java.lang.String var27 = var6.getCidade();
    java.lang.String var28 = var6.getBairro();
    java.lang.String var29 = var6.getCidade();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test277");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setRua("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    java.lang.String var13 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test278");


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
    int var42 = var5.getAvaliacaoPositiva();
    int var43 = var5.getAvaliacaoPositiva();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test279");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\n\nhi!, ");
    model.ProfissionalSaude var12 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var16 = new model.Avaliacao("", "hi!", false);
    java.lang.String var17 = var16.getIdUsuario();
    var12.addAvaliacao(var16);
    boolean var19 = var2.equals((java.lang.Object)var16);
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test280");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    model.ProfissionalSaude var12 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var13 = var2.equals((java.lang.Object)var12);
    int var14 = var12.getAvaliacaoPositiva();
    java.lang.String var15 = var12.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test281");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var19 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setTipo("hi!");
    java.lang.String var26 = var5.getEspecialidade();
    boolean var31 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", ", \nhi!\n, hi!", "hi!, hi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test282");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var7 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test283");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var10 = var5.verificaParametros("hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!\n");
    int var11 = var5.getAvaliacaoNegativa();
    java.lang.String var12 = var5.getNome();
    java.lang.String var13 = var5.getConvenio();
    java.lang.String var14 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var12.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var14.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test284");


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
    int var32 = var5.getAvaliacaoNegativa();
    int var33 = var5.getAvaliacaoNegativa();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test285");


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
    java.lang.String var31 = var5.getConvenio();
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ");
    int var34 = var5.getAvaliacaoPositiva();
    
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
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var31.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test286");


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
    java.lang.String var27 = var23.getCrm();
    java.lang.String var28 = var23.getCrm();
    java.lang.String var29 = var23.getIdUsuario();
    java.lang.String var30 = var23.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test287");


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
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!");
    
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

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test288");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getSala();
    java.lang.String var9 = var6.getCidade();
    model.ProfissionalSaude var15 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var15.getNome();
    java.lang.String var17 = var15.getNumeroRegistro();
    int var18 = var15.getAvaliacaoPositiva();
    var15.setTipo("hi!, hi!\nhi!\n, ");
    int var21 = var15.getAvaliacaoPositiva();
    var15.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var24 = var15.getNumeroRegistro();
    var15.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Avaliacao var30 = new model.Avaliacao("", "hi!", false);
    java.lang.String var31 = var30.getCrm();
    java.lang.String var32 = var30.getCrm();
    java.lang.String var33 = var30.getCrm();
    boolean var34 = var30.isAvaliacao();
    java.lang.String var35 = var30.getIdUsuario();
    java.lang.String var36 = var30.getCrm();
    var15.addAvaliacao(var30);
    boolean var38 = var6.equals((java.lang.Object)var15);
    var15.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
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
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test289");


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
    java.lang.String var42 = var16.getTipo();
    
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
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test290");


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
    java.lang.String var23 = var5.getNumeroRegistro();
    boolean var28 = var5.verificaParametros("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, \nhi!\n, ", ", hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test291");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getTipo();
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var17 = var5.getTipo();
    
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

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test292");


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
    int var77 = var40.getAvaliacaoNegativa();
    var40.setNome("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    java.lang.String var80 = var40.getNome();
    int var81 = var40.getAvaliacaoNegativa();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "+ "'", var80.equals("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test293");


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
    java.lang.String var28 = var6.getRua();
    var6.setSala("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var25.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test294");


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
    boolean var29 = var5.verificaParametros(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, , \nhi!\n, ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ", "hi!\n");
    
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
    assertTrue(var29 == true);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test295");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    int var6 = var5.getAvaliacaoNegativa();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var7.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\n\n, "+ "'", var8.equals("hi!, hi!\n\n, "));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test296");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    model.Endereco var17 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var17.setRua("hi!, hi!\nhi!\nhi!, ");
    boolean var20 = var6.equals((java.lang.Object)var17);
    java.lang.String var21 = var6.getEstado();
    java.lang.String var22 = var6.toString();
    java.lang.String var23 = var6.getRua();
    var6.setNumero(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test297");


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
    java.lang.String var30 = var6.getRua();
    
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
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test298");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getBairro();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var15 = var6.getCidade();
    var6.setNumero("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ");
    java.lang.String var18 = var6.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , "+ "'", var18.equals("hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , "));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test299");


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
    var5.setEspecialidade("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    
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

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test300");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getConvenio();
    var5.setConvenio("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test301");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var6 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var6.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test302");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var20 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var21 = var20.getEstado();
    boolean var22 = var6.equals((java.lang.Object)var21);
    java.lang.String var23 = var6.getRua();
    java.lang.String var24 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test303");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    java.lang.String var15 = var6.toString();
    java.lang.String var16 = var6.getBairro();
    java.lang.String var17 = var6.getNumero();
    java.lang.String var18 = var6.getEstado();
    model.Usuario var21 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var21.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    var21.setIdentificacao("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var26 = var6.equals((java.lang.Object)"hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
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
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test304");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \n", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!\n\nhi!, ");
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var15.setCidade("");
    java.lang.String var18 = var15.getSala();
    var15.setCidade("");
    java.lang.String var21 = var15.getRua();
    var15.setRua("hi!");
    java.lang.String var24 = var15.getRua();
    var15.setEstado("hi!, hi!\nhi!\nhi!, ");
    var15.setSala("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var29 = var15.getSala();
    boolean var30 = var6.equals((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var29.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test305");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\n, ");
    java.lang.String var14 = var6.getEstado();
    model.Endereco var21 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var21.getBairro();
    java.lang.String var23 = var21.getBairro();
    boolean var24 = var6.equals((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var22.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var23.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test306");


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
    java.lang.String var34 = var6.getSala();
    
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
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test307");


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
    var5.setRegistro("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    var5.setTipo("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test308");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", ", \nhi!\n, hi!");
    var5.setEspecialidade(", hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, ");

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test309");


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
    java.lang.String var44 = var5.getTipo();
    java.lang.String var45 = var5.getTipo();
    
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
    assertTrue("'" + var44 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var44.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var45.equals("hi!, hi!\nhi!\n, "));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test310");


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
    java.lang.String var22 = var15.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test311");


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
    java.lang.String var26 = var2.getNome();
    java.lang.String var27 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, \nhi!\n, "+ "'", var3.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var26.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var27.equals("hi!, hi!\nhi!\n, "));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test312");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.getEstado();
    var6.setEstado("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getBairro();
    var6.setSala("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    java.lang.String var15 = var6.getCidade();
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "+ "'", var8.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var15.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test313");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.addConvenio("hi!");
    var5.setEspecialidade(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    int var17 = var5.getAvaliacaoPositiva();
    java.lang.String var18 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test314");


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
    boolean var23 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue(var23 == true);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test315");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var9.getIdUsuario();
    java.lang.String var13 = var9.getIdUsuario();
    java.lang.String var14 = var9.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test316");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getNumero();
    var6.setSala("hi!, hi!\n\n, ");
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var13 = var6.getNumero();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test317");


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
    var6.setCidade("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test318");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getRua();
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setRua("hi!, \nhi!\nhi!, ");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    java.lang.String var26 = var23.getNumero();
    var23.setNumero("");
    java.lang.String var29 = var23.getNumero();
    java.lang.String var30 = var23.getEstado();
    var23.setEstado("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var23.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    boolean var35 = var6.equals((java.lang.Object)var23);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test319");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    var23.setCidade("");
    var23.setBairro("");
    java.lang.String var30 = var23.getNumero();
    boolean var31 = var6.equals((java.lang.Object)var23);
    var6.setRua("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test320");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\n, ");
    var2.setIdentificacao(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.Usuario var7 = new model.Usuario("hi!, \nhi!\n, ", "hi!");
    var7.setNome("hi!, hi!\nhi!\nhi!, ");
    boolean var10 = var2.equals((java.lang.Object)var7);
    var2.setNome("hi!");
    model.ProfissionalSaude var18 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var22 = new model.Avaliacao("", "hi!", false);
    java.lang.String var23 = var22.getIdUsuario();
    var18.addAvaliacao(var22);
    var18.setConvenio("hi!");
    java.lang.String var27 = var18.getConvenio();
    java.lang.String var28 = var18.getNumeroRegistro();
    java.lang.String var29 = var18.getNumeroRegistro();
    java.lang.String var30 = var18.getNumeroRegistro();
    java.lang.String var31 = var18.getTipo();
    var18.addConvenio("hi!, hi!\nhi!\nhi!, \n");
    boolean var34 = var2.equals((java.lang.Object)"hi!, hi!\nhi!\nhi!, \n");
    model.Usuario var37 = new model.Usuario("", "");
    java.lang.String var38 = var37.getIdentificacao();
    var37.setIdentificacao("hi!");
    var37.setIdentificacao("hi!");
    var37.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var45 = var37.getNome();
    model.ProfissionalSaude var51 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var55 = new model.Avaliacao("", "hi!", false);
    java.lang.String var56 = var55.getIdUsuario();
    var51.addAvaliacao(var55);
    var51.setNumeroRegistro("");
    var51.setConvenio("hi!");
    var51.setEspecialidade("hi!, \nhi!\n, ");
    boolean var64 = var37.equals((java.lang.Object)var51);
    int var65 = var51.getAvaliacaoNegativa();
    int var66 = var51.getAvaliacaoPositiva();
    boolean var67 = var2.equals((java.lang.Object)var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test321");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getTipo();
    java.lang.String var14 = var5.getNome();
    var5.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var26 = new model.Avaliacao("", "hi!", false);
    java.lang.String var27 = var26.getIdUsuario();
    var22.addAvaliacao(var26);
    var22.setNumeroRegistro("");
    var22.setConvenio("hi!");
    var22.setEspecialidade("hi!, \nhi!\n, ");
    var22.setEspecialidade("hi!");
    java.lang.String var37 = var22.getTipo();
    var22.setTipo("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    boolean var40 = var5.equals((java.lang.Object)var22);
    var22.setTipo("hi!, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test322");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    var5.setNome("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var5.getTipo();
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var26 = new model.Avaliacao("", "hi!", false);
    java.lang.String var27 = var26.getIdUsuario();
    var22.addAvaliacao(var26);
    var22.setNumeroRegistro("");
    boolean var35 = var22.verificaParametros("hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    int var36 = var22.getAvaliacaoPositiva();
    var22.setConvenio("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var22.setTipo("hi!, hi!\nhi!\nhi!, \nhi!");
    int var41 = var22.getAvaliacaoNegativa();
    boolean var42 = var5.equals((java.lang.Object)var22);
    var22.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test323");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude(", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\nhi!, ", "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ", "hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test324");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var9 = var6.getNumero();
    model.Usuario var12 = new model.Usuario("", "");
    java.lang.String var13 = var12.getIdentificacao();
    var12.setNome("hi!");
    java.lang.String var16 = var12.getIdentificacao();
    var12.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var19 = var12.getIdentificacao();
    boolean var20 = var6.equals((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test325");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test326");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var9 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test327");


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
    int var34 = var20.getAvaliacaoPositiva();
    model.Avaliacao var38 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", false);
    java.lang.String var39 = var38.getCrm();
    var20.addAvaliacao(var38);
    
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
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var39.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test328");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test329");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test330");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    boolean var17 = var5.verificaParametros("hi!", "", "hi!", "hi!, \nhi!\n, ");
    var5.setRegistro("");
    java.lang.String var20 = var5.getEspecialidade();
    int var21 = var5.getAvaliacaoNegativa();
    var5.setEspecialidade("hi!, \nhi!\n, , hi!\nhi!\n, ");
    java.lang.String var24 = var5.getConvenio();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var24.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test331");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test332");


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
    java.lang.String var23 = var5.getConvenio();
    boolean var28 = var5.verificaParametros("hi!\n", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, \nhi!\n, , hi!\nhi!, hi!\n\nhi!, \nhi!\n, , hi!\n, ", "hi!, \nhi!\n, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test333");


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
    var5.setNumeroRegistro("hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test334");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    var2.setIdentificacao("hi!");
    java.lang.String var8 = var2.getIdentificacao();
    java.lang.String var9 = var2.getIdentificacao();
    java.lang.String var10 = var2.getIdentificacao();
    java.lang.String var11 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test335");


    model.Avaliacao var3 = new model.Avaliacao(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", true);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test336");


    model.Usuario var2 = new model.Usuario(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test337");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    java.lang.String var17 = var5.getTipo();
    java.lang.String var18 = var5.getNumeroRegistro();
    model.Endereco var25 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var26 = var25.getNumero();
    var25.setNumero("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var29 = var25.getRua();
    var25.setCidade("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var32 = var25.getNumero();
    java.lang.String var33 = var25.getBairro();
    boolean var34 = var5.equals((java.lang.Object)var33);
    int var35 = var5.getAvaliacaoPositiva();
    model.ProfissionalSaude var41 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var42 = var41.getNome();
    java.lang.String var43 = var41.getNumeroRegistro();
    int var44 = var41.getAvaliacaoPositiva();
    var41.setTipo("hi!, hi!\nhi!\n, ");
    int var47 = var41.getAvaliacaoPositiva();
    var41.addConvenio("hi!, hi!\nhi!\n, ");
    int var50 = var41.getAvaliacaoPositiva();
    boolean var55 = var41.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var56 = var41.getConvenio();
    var41.setNumeroRegistro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    boolean var63 = var41.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, \nhi!\n, hi!");
    model.Avaliacao var67 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var68 = var67.getIdUsuario();
    java.lang.String var69 = var67.getIdUsuario();
    java.lang.String var70 = var67.getCrm();
    var41.addAvaliacao(var67);
    var5.addAvaliacao(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var32.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var56.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!, \nhi!\n, "+ "'", var68.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!, \nhi!\n, "+ "'", var69.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test338");


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
    java.lang.String var44 = var39.getIdUsuario();
    java.lang.String var45 = var39.getCrm();
    
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
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test339");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getEstado();
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var14 = new model.Usuario("", "");
    java.lang.String var15 = var14.getIdentificacao();
    var14.setIdentificacao("hi!");
    var14.setIdentificacao("hi!");
    var14.setIdentificacao("hi!, hi!\nhi!\nhi!, ");
    java.lang.String var22 = var14.getNome();
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("", "hi!", false);
    java.lang.String var33 = var32.getIdUsuario();
    var28.addAvaliacao(var32);
    var28.setNumeroRegistro("");
    var28.setConvenio("hi!");
    var28.setEspecialidade("hi!, \nhi!\n, ");
    boolean var41 = var14.equals((java.lang.Object)var28);
    model.ProfissionalSaude var47 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var51 = new model.Avaliacao("", "hi!", false);
    java.lang.String var52 = var51.getIdUsuario();
    var47.addAvaliacao(var51);
    java.lang.String var54 = var47.getNumeroRegistro();
    var47.setNumeroRegistro("hi!, \nhi!\n, ");
    var47.setNumeroRegistro(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var59 = var14.equals((java.lang.Object)var47);
    var47.setTipo("hi!, \nhi!\n, hi!");
    int var62 = var47.getAvaliacaoNegativa();
    model.ProfissionalSaude var68 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var69 = var68.getNome();
    var68.setEspecialidade("hi!, \nhi!\n, ");
    model.ProfissionalSaude var77 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var78 = var77.getNome();
    java.lang.String var79 = var77.getNumeroRegistro();
    int var80 = var77.getAvaliacaoPositiva();
    var77.setTipo("hi!, hi!\nhi!\n, ");
    int var83 = var77.getAvaliacaoPositiva();
    var77.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var86 = var77.getConvenio();
    boolean var87 = var68.equals((java.lang.Object)var77);
    int var88 = var68.getAvaliacaoPositiva();
    java.lang.String var89 = var68.getEspecialidade();
    int var90 = var68.getAvaliacaoNegativa();
    boolean var91 = var47.equals((java.lang.Object)var68);
    var47.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var47.setEspecialidade("hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");
    boolean var96 = var6.equals((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!"+ "'", var78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var86.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi!, \nhi!\n, "+ "'", var89.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test340");


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
    java.lang.String var19 = var5.getNumeroRegistro();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    
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

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test341");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    java.lang.String var18 = var5.getConvenio();
    int var19 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test342");


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
    var24.setRua("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    
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

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test343");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade(", hi!\n\nhi!, hi!, \nhi!\n, ");
    var5.addConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var24 = var5.verificaParametros("hi!\n, hi!, \nhi!\n, , hi!\nhi!\n, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test344");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test345");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    java.lang.String var15 = var2.getIdentificacao();
    java.lang.String var16 = var2.getNome();
    java.lang.String var17 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ");
    
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

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test346");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \n");
    var5.setNome("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test347");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var7 = var2.getNome();
    var2.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.Endereco var18 = new model.Endereco("", "", "hi!", "", "", "hi!");
    var18.setRua("hi!, hi!\nhi!\nhi!, ");
    var18.setRua(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var23 = var18.getCidade();
    boolean var24 = var2.equals((java.lang.Object)var18);
    java.lang.String var25 = var18.getEstado();
    model.Endereco var32 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var33 = var32.getNumero();
    var32.setCidade("hi!");
    java.lang.String var36 = var32.getBairro();
    var32.setEstado("hi!, \nhi!\n, ");
    var32.setRua("");
    model.Endereco var47 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var48 = var47.getNumero();
    var47.setCidade("hi!");
    java.lang.String var51 = var47.getRua();
    java.lang.String var52 = var47.getSala();
    boolean var53 = var32.equals((java.lang.Object)var52);
    java.lang.String var54 = var32.getSala();
    boolean var55 = var18.equals((java.lang.Object)var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test348");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getRua();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getNumero();
    model.Usuario var14 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var15 = var14.getNome();
    java.lang.String var16 = var14.getNome();
    boolean var17 = var6.equals((java.lang.Object)var16);
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
    assertTrue("'" + var15 + "' != '" + "hi!, \nhi!\n, "+ "'", var15.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test349");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    var6.setEstado("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setBairro("hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test350");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\n, , \nhi!\n, ");

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test351");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    java.lang.String var10 = var6.getSala();
    var6.setSala("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var7.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test352");


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
    int var32 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test353");


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
    var8.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \n");
    var8.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test354");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setNumero("");
    var6.setBairro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setNumero("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var19 = var6.toString();
    java.lang.String var20 = var6.getRua();
    model.Usuario var23 = new model.Usuario("", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var23.setNome("hi!, hi!\nhi!\nhi!, ");
    var23.setNome("hi!, hi!\n\nhi!, ");
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var37 = new model.Avaliacao("", "hi!", false);
    java.lang.String var38 = var37.getIdUsuario();
    var33.addAvaliacao(var37);
    var33.setNumeroRegistro("");
    java.lang.String var42 = var33.getNome();
    var33.setEspecialidade("hi!");
    boolean var45 = var23.equals((java.lang.Object)var33);
    java.lang.String var46 = var33.getNumeroRegistro();
    boolean var47 = var6.equals((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, "+ "'", var19.equals("hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test355");


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
    var6.setRua("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
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

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test356");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var9 = var6.getNumero();
    var6.setCidade("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    var19.addAvaliacao(var23);
    var19.setTipo("hi!, \nhi!\n, ");
    var19.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var30 = var19.getAvaliacaoNegativa();
    java.lang.String var31 = var19.getTipo();
    java.lang.String var32 = var19.getNumeroRegistro();
    int var33 = var19.getAvaliacaoPositiva();
    boolean var34 = var6.equals((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var9.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, \nhi!\n, "+ "'", var31.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test357");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    java.lang.String var10 = var6.getSala();
    java.lang.String var11 = var6.getEstado();
    var6.setRua("hi!, hi!\nhi!\n, ");
    var6.setCidade("");
    java.lang.String var16 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test358");


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
    java.lang.String var26 = var5.getNome();
    var5.setRegistro("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var29 = var5.getTipo();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var29.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test359");


    model.Endereco var6 = new model.Endereco("", "", "", "", "hi!", "");
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, \n, ");

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test360");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.getNumero();
    model.Endereco var18 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var20 = var18.equals((java.lang.Object)10L);
    var18.setCidade("");
    var18.setBairro("");
    var18.setCidade("hi!");
    var18.setEstado("");
    java.lang.String var29 = var18.getSala();
    java.lang.String var30 = var18.getBairro();
    java.lang.String var31 = var18.toString();
    var18.setRua("hi!, \nhi!\n, ");
    model.ProfissionalSaude var39 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var43 = new model.Avaliacao("", "hi!", false);
    java.lang.String var44 = var43.getIdUsuario();
    var39.addAvaliacao(var43);
    var39.setNumeroRegistro("");
    var39.setConvenio("hi!");
    java.lang.String var50 = var39.getTipo();
    model.Avaliacao var54 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var55 = var54.getCrm();
    java.lang.String var56 = var54.getCrm();
    var39.addAvaliacao(var54);
    boolean var58 = var18.equals((java.lang.Object)var39);
    var18.setRua("hi!, hi!\n\n, ");
    boolean var61 = var6.equals((java.lang.Object)"hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var31.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!, \nhi!\n, "+ "'", var55.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi!, \nhi!\n, "+ "'", var56.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test361");


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
    java.lang.String var26 = var17.getCidade();
    
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
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test362");


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
    var16.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    
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

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test363");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, \n, ", "hi!\n", ", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ");

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test364");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\n\n, , \nhi!\n, ");

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test365");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "");
    var2.setNome("hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    model.Endereco var13 = new model.Endereco("hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", "", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var14 = var2.equals((java.lang.Object)"");
    java.lang.String var15 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var15.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test366");


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
    model.Usuario var30 = new model.Usuario("", "");
    model.Endereco var37 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var38 = var37.getNumero();
    var37.setNumero("hi!, hi!\nhi!\nhi!, ");
    var37.setCidade("hi!, hi!\nhi!\nhi!, ");
    boolean var43 = var30.equals((java.lang.Object)var37);
    var37.setEstado("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var37.setRua("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var37.setSala("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ");
    boolean var50 = var5.equals((java.lang.Object)var37);
    var5.setRegistro("hi!, \nhi!\n, , hi!\n\nhi!, ");
    
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
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test367");


    model.Usuario var2 = new model.Usuario("", "");
    java.lang.String var3 = var2.getIdentificacao();
    var2.setIdentificacao("hi!");
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    model.Endereco var15 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var17 = var15.equals((java.lang.Object)10L);
    java.lang.String var18 = var15.getNumero();
    var15.setNumero("");
    java.lang.String var21 = var15.getSala();
    var15.setNumero("hi!");
    java.lang.String var24 = var15.getBairro();
    model.Endereco var31 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var31.setCidade("");
    var31.setBairro("hi!");
    var31.setSala("hi!");
    java.lang.String var38 = var31.toString();
    boolean var39 = var15.equals((java.lang.Object)var38);
    boolean var40 = var2.equals((java.lang.Object)var38);
    var2.setIdentificacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var38.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test368");


    model.Avaliacao var3 = new model.Avaliacao(", hi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test369");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, ");
    int var6 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test370");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getNome();
    model.ProfissionalSaude var10 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var11 = var10.getNome();
    java.lang.String var12 = var10.getNumeroRegistro();
    int var13 = var10.getAvaliacaoPositiva();
    var10.setTipo("hi!, hi!\nhi!\n, ");
    int var16 = var10.getAvaliacaoPositiva();
    int var17 = var10.getAvaliacaoNegativa();
    java.lang.String var18 = var10.getNumeroRegistro();
    java.lang.String var19 = var10.getNome();
    var10.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!\n, , ");
    boolean var22 = var2.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test371");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getTipo();
    var5.setEspecialidade("");
    java.lang.String var17 = var5.getNome();
    model.ProfissionalSaude var23 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    boolean var24 = var5.equals((java.lang.Object)var23);
    var23.setRegistro(", hi!\nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test372");


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
    java.lang.String var79 = var6.getNumero();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test373");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setNumeroRegistro("");
    var5.setConvenio("hi!");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var20 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test374");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!\nhi!\n, hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test375");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getTipo();
    java.lang.String var13 = var5.getTipo();
    boolean var18 = var5.verificaParametros("hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    boolean var23 = var5.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test376");


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
    java.lang.String var71 = var64.getCrm();
    
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
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test377");


    model.Usuario var2 = new model.Usuario("", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\n, hi!");

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test378");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\n\nhi!, ", "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test379");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n");

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test380");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, \nhi!\n, ");
    var2.setIdentificacao("hi!");
    java.lang.String var5 = var2.getIdentificacao();
    var2.setNome("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var8 = var2.getIdentificacao();
    java.lang.String var9 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test381");


    model.Usuario var2 = new model.Usuario("hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\n\nhi!, \nhi!\n, , hi!");

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test382");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    model.Usuario var13 = new model.Usuario("hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var14 = var13.getNome();
    boolean var15 = var6.equals((java.lang.Object)var14);
    var6.setSala("hi!");
    java.lang.String var18 = var6.getSala();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test383");


    model.Avaliacao var3 = new model.Avaliacao("", "hi!, \nhi!\n, ", true);
    java.lang.String var4 = var3.getIdUsuario();
    java.lang.String var5 = var3.getIdUsuario();
    java.lang.String var6 = var3.getCrm();
    java.lang.String var7 = var3.getIdUsuario();
    java.lang.String var8 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test384");


    model.Endereco var6 = new model.Endereco("hi!", "hi!, \nhi!\n, ", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getCidade();
    java.lang.String var8 = var6.getBairro();
    var6.setSala("");
    model.Endereco var17 = new model.Endereco("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    java.lang.String var18 = var17.getEstado();
    boolean var19 = var6.equals((java.lang.Object)var18);
    var6.setCidade("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    java.lang.String var22 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var18.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test385");


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
    boolean var37 = var5.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", ", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue(var37 == true);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test386");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var5.addConvenio("hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test387");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, , hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test388");


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
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    var2.setIdentificacao("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var61 = new model.Endereco("hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , ", "hi!, hi!\n\n, hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    var61.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    boolean var64 = var2.equals((java.lang.Object)var61);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test389");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, , hi!\n\nhi!, hi!, \nhi!\n, ");

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test390");


    model.Usuario var2 = new model.Usuario(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ");
    var2.setIdentificacao("hi!, hi!\n\n, ");
    var2.setNome("hi!, hi!\n\n, ");
    var2.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test391");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoNegativa();
    int var9 = var5.getAvaliacaoPositiva();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test392");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!\nhi!\n, ");
    java.lang.String var9 = var6.getSala();
    var6.setNumero("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var6.setRua(", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var19 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var23 = new model.Avaliacao("", "hi!", false);
    java.lang.String var24 = var23.getIdUsuario();
    var19.addAvaliacao(var23);
    var19.setConvenio("hi!");
    java.lang.String var28 = var19.getConvenio();
    java.lang.String var29 = var19.getNumeroRegistro();
    java.lang.String var30 = var19.getNome();
    var19.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var19.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var19.setNome("");
    java.lang.String var37 = var19.getConvenio();
    boolean var38 = var6.equals((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var9.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test393");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    java.lang.String var9 = var6.getSala();
    var6.setCidade("");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setRua("hi!");
    var6.setRua("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test394");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\nhi!, \nhi!\n, , hi!", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test395");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    int var11 = var5.getAvaliacaoPositiva();
    java.lang.String var12 = var5.getNome();
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!");
    var5.setConvenio(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test396");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    boolean var9 = var5.equals((java.lang.Object)(byte)100);
    int var10 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var15 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test397");


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
    java.lang.String var32 = var5.getTipo();
    
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
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test398");


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
    java.lang.String var31 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var31 + "' != '" + "hi!, hi!\n\n, "+ "'", var31.equals("hi!, hi!\n\n, "));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test399");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setTipo("hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var16 = var5.getTipo();
    java.lang.String var17 = var5.getNome();
    var5.setNome("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    var5.setEspecialidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, \nhi!\n, "+ "'", var16.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test400");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\n\n, ");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    int var16 = var5.getAvaliacaoNegativa();
    var5.setRegistro("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    model.ProfissionalSaude var24 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var25 = var24.getNome();
    java.lang.String var26 = var24.getNumeroRegistro();
    int var27 = var24.getAvaliacaoPositiva();
    var24.setTipo("hi!, hi!\nhi!\n, ");
    int var30 = var24.getAvaliacaoPositiva();
    java.lang.String var31 = var24.getNome();
    var24.setEspecialidade("hi!, \nhi!\n, ");
    var24.setEspecialidade("hi!\n");
    var24.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var24.setConvenio("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    model.Endereco var46 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var47 = var46.getNumero();
    model.Endereco var54 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var55 = var54.getNumero();
    var54.setCidade("hi!");
    model.Endereco var64 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var66 = var64.equals((java.lang.Object)10L);
    java.lang.String var67 = var64.getNumero();
    boolean var68 = var54.equals((java.lang.Object)var67);
    var54.setBairro("");
    java.lang.String var71 = var54.getBairro();
    var54.setNumero("hi!, hi!\nhi!\n, ");
    boolean var74 = var46.equals((java.lang.Object)var54);
    java.lang.String var75 = var46.getNumero();
    var46.setRua("hi!, \nhi!\n, ");
    var46.setSala("hi!, hi!\nhi!\nhi!, \nhi!");
    model.Avaliacao var83 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var84 = var83.getCrm();
    java.lang.String var85 = var83.getCrm();
    java.lang.String var86 = var83.getIdUsuario();
    boolean var87 = var46.equals((java.lang.Object)var83);
    java.lang.String var88 = var83.getCrm();
    java.lang.String var89 = var83.getCrm();
    var24.addAvaliacao(var83);
    var5.addAvaliacao(var83);
    
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
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi!, \nhi!\n, "+ "'", var84.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!, \nhi!\n, "+ "'", var85.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var86.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "hi!, \nhi!\n, "+ "'", var88.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi!, \nhi!\n, "+ "'", var89.equals("hi!, \nhi!\n, "));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test401");


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
    java.lang.String var19 = var6.getNome();
    model.Usuario var22 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var28 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var32 = new model.Avaliacao("", "hi!", false);
    java.lang.String var33 = var32.getIdUsuario();
    var28.addAvaliacao(var32);
    var28.setConvenio("hi!");
    boolean var37 = var22.equals((java.lang.Object)var28);
    var28.addConvenio("");
    java.lang.String var40 = var28.getNome();
    java.lang.String var41 = var28.getEspecialidade();
    boolean var46 = var28.verificaParametros("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    java.lang.String var47 = var28.getConvenio();
    boolean var48 = var6.equals((java.lang.Object)var28);
    
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
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var19.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!\n"+ "'", var47.equals("hi!\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test402");


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
    java.lang.String var43 = var2.getNome();
    model.Usuario var46 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var46.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var46.setIdentificacao("hi!, \nhi!\n, hi!");
    java.lang.String var51 = var46.getNome();
    var46.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var46.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    model.ProfissionalSaude var61 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var65 = new model.Avaliacao("", "hi!", false);
    java.lang.String var66 = var65.getIdUsuario();
    var61.addAvaliacao(var65);
    var61.setTipo("hi!, \nhi!\n, ");
    var61.setEspecialidade("hi!, hi!\nhi!\nhi!, ");
    int var72 = var61.getAvaliacaoNegativa();
    java.lang.String var73 = var61.getTipo();
    var61.setEspecialidade("hi!, \nhi!\n, ");
    var61.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    boolean var78 = var46.equals((java.lang.Object)var61);
    boolean var79 = var2.equals((java.lang.Object)var61);
    
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
    assertTrue("'" + var43 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var43.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var51.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!, \nhi!\n, "+ "'", var73.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test403");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    var6.setBairro("hi!, hi!\nhi!\nhi!, ");
    model.Endereco var29 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var31 = var29.equals((java.lang.Object)10L);
    var29.setCidade("");
    var29.setBairro("");
    var29.setSala("hi!");
    java.lang.String var38 = var29.toString();
    model.Endereco var45 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var45.setCidade("");
    java.lang.String var48 = var45.getSala();
    var45.setCidade("hi!, \nhi!\n, ");
    boolean var51 = var29.equals((java.lang.Object)"hi!, \nhi!\n, ");
    boolean var52 = var6.equals((java.lang.Object)var29);
    java.lang.String var53 = var6.getCidade();
    var6.setRua("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\n\n, "+ "'", var38.equals("hi!, hi!\n\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test404");


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
    java.lang.String var24 = var13.getNumero();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, \nhi!\n, , hi!\nhi!\n, "+ "'", var17.equals("hi!, \nhi!\n, , hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!, \nhi!\n, "+ "'", var21.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test405");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var3.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test406");


    model.Endereco var6 = new model.Endereco("", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var7 = var6.getNumero();
    java.lang.String var8 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!, hi!\nhi!\n, \n\nhi!, "+ "'", var7.equals("hi!, hi!, hi!\nhi!\n, \n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test407");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getConvenio();
    java.lang.String var13 = var5.getEspecialidade();
    java.lang.String var14 = var5.getTipo();
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    model.ProfissionalSaude var22 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    model.Endereco var29 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var31 = var29.equals((java.lang.Object)10L);
    var29.setCidade("hi!, \nhi!\n, ");
    boolean var34 = var22.equals((java.lang.Object)"hi!, \nhi!\n, ");
    boolean var39 = var22.verificaParametros(", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ", "hi!, , hi!\nhi!, hi!\nhi!\n, \nhi!, \nhi!\n, ");
    boolean var40 = var5.equals((java.lang.Object)"hi!, hi!\nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var12.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test408");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    boolean var12 = var5.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, \nhi!\n, hi!", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    java.lang.String var13 = var5.getEspecialidade();
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test409");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", true);
    java.lang.String var4 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var4.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test410");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.addConvenio("hi!");
    model.Avaliacao var18 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", true);
    boolean var19 = var5.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test411");


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
    model.Avaliacao var24 = new model.Avaliacao("", "hi!, hi!\nhi!\nhi!, ", false);
    boolean var25 = var24.isAvaliacao();
    java.lang.String var26 = var24.getIdUsuario();
    java.lang.String var27 = var24.getIdUsuario();
    boolean var28 = var24.isAvaliacao();
    var5.addAvaliacao(var24);
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var27.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test412");


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
    var22.setNumeroRegistro(", hi!, \nhi!\n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test413");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getRua();
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, "+ "'", var9.equals("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, "));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test414");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getRua();
    var6.setEstado("hi!");
    java.lang.String var10 = var6.getRua();
    java.lang.String var11 = var6.getRua();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test415");


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
    java.lang.String var48 = var43.getCrm();
    java.lang.String var49 = var43.getCrm();
    java.lang.String var50 = var43.getCrm();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!, \nhi!\n, "+ "'", var48.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!, \nhi!\n, "+ "'", var49.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!, \nhi!\n, "+ "'", var50.equals("hi!, \nhi!\n, "));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test416");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test417");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ", true);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test418");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", ", hi!\nhi!, hi!\nhi!\n, \nhi!, ", "hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    int var10 = var5.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test419");


    model.Usuario var2 = new model.Usuario("hi!", "");
    java.lang.String var3 = var2.getNome();
    java.lang.String var4 = var2.getIdentificacao();
    var2.setNome("hi!, hi!\n\nhi!, ");
    model.Usuario var9 = new model.Usuario("hi!, hi!\n\n, , \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var10 = var2.equals((java.lang.Object)var9);
    var9.setIdentificacao("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test420");


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
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getCrm();
    java.lang.String var37 = var35.getCrm();
    var5.addAvaliacao(var35);
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.addConvenio("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test421");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, \nhi!\n, ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var5 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, \nhi!\n, "+ "'", var5.equals("hi!, \nhi!\n, "));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test422");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    int var8 = var5.getAvaliacaoPositiva();
    var5.addConvenio("");
    int var11 = var5.getAvaliacaoPositiva();
    var5.setConvenio("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var5.setConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test423");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getTipo();
    java.lang.String var9 = var5.getTipo();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    var5.addConvenio("hi!, hi!\n\n, ");
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var16 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, "+ "'", var16.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\n, "));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test424");


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
    var8.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var27 = var8.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var27.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test425");


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
    model.ProfissionalSaude var30 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var34 = new model.Avaliacao("", "hi!", false);
    java.lang.String var35 = var34.getIdUsuario();
    var30.addAvaliacao(var34);
    var30.setNumeroRegistro("");
    java.lang.String var39 = var30.getConvenio();
    model.Avaliacao var43 = new model.Avaliacao("hi!", "hi!, hi!\nhi!\nhi!, ", false);
    var30.addAvaliacao(var43);
    var5.addAvaliacao(var43);
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var39.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test426");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setRua("hi!, \nhi!\n, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    model.ProfissionalSaude var20 = new model.ProfissionalSaude(", hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var21 = var6.equals((java.lang.Object)", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var22 = var6.getBairro();
    java.lang.String var23 = var6.getBairro();
    var6.setRua("hi!, hi!, hi!\n\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test427");


    model.Usuario var2 = new model.Usuario("hi!\n, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\n\nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test428");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\n, \n\nhi!, ", true);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test429");


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
    var6.setRua("");
    
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

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test430");


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
    model.Usuario var23 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var29 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var33 = new model.Avaliacao("", "hi!", false);
    java.lang.String var34 = var33.getIdUsuario();
    var29.addAvaliacao(var33);
    var29.setConvenio("hi!");
    boolean var38 = var23.equals((java.lang.Object)var29);
    var29.addConvenio("");
    var29.addConvenio("hi!, \nhi!\n, ");
    model.Avaliacao var46 = new model.Avaliacao(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", false);
    boolean var47 = var29.equals((java.lang.Object)var46);
    var8.addAvaliacao(var46);
    java.lang.String var49 = var8.getTipo();
    
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
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test431");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    java.lang.String var3 = var2.getNome();
    var2.setIdentificacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var3.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test432");


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
    var6.setBairro("hi!, hi!\nhi!\nhi!, \n");
    java.lang.String var38 = var6.getBairro();
    
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
    assertTrue("'" + var38 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var38.equals("hi!, hi!\nhi!\nhi!, \n"));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test433");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    java.lang.String var10 = var6.getBairro();
    var6.setEstado("hi!, \nhi!\n, ");
    var6.setRua("");
    java.lang.String var15 = var6.toString();
    var6.setCidade("hi!, hi!\nhi!\nhi!, ");
    var6.setNumero(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var20 = var6.getRua();
    java.lang.String var21 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var15.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, "+ "'", var21.equals(", , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, , hi!, \nhi!\n, "));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test434");


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
    java.lang.String var22 = var5.getNumeroRegistro();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    model.Usuario var27 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var33 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var37 = new model.Avaliacao("", "hi!", false);
    java.lang.String var38 = var37.getIdUsuario();
    var33.addAvaliacao(var37);
    var33.setConvenio("hi!");
    boolean var42 = var27.equals((java.lang.Object)var33);
    var33.addConvenio("");
    java.lang.String var45 = var33.getNome();
    boolean var50 = var33.verificaParametros(", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var33.setRegistro("hi!, hi!\nhi!\nhi!, \nhi!");
    boolean var53 = var5.equals((java.lang.Object)var33);
    var5.setTipo("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test435");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\n, ", "hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var7 = var6.getSala();
    java.lang.String var8 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test436");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!\nhi!\n, ");

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test437");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, \nhi!", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    boolean var4 = var3.isAvaliacao();
    java.lang.String var5 = var3.getIdUsuario();
    java.lang.String var6 = var3.getCrm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var5.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \nhi!"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test438");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setNumero("hi!, hi!\nhi!\nhi!, ");
    var6.setBairro("hi!, hi!\nhi!\n, ");
    java.lang.String var12 = var6.getRua();
    java.lang.String var13 = var6.getCidade();
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ");
    java.lang.String var16 = var6.getSala();
    java.lang.String var17 = var6.getSala();
    
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

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test439");


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
    boolean var23 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , \nhi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\n\n, hi!\nhi!, hi!\nhi!\n, \nhi!, , ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, ");
    
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
    assertTrue(var23 == true);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test440");


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
    model.Usuario var50 = new model.Usuario("", "");
    java.lang.String var51 = var50.getIdentificacao();
    var50.setIdentificacao("hi!");
    model.Endereco var60 = new model.Endereco("hi!", "hi!", "hi!, hi!\nhi!\nhi!, ", "", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var61 = var60.getSala();
    boolean var62 = var50.equals((java.lang.Object)var61);
    model.ProfissionalSaude var68 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var72 = new model.Avaliacao("", "hi!", false);
    java.lang.String var73 = var72.getIdUsuario();
    var68.addAvaliacao(var72);
    int var75 = var68.getAvaliacaoPositiva();
    var68.addConvenio("hi!, hi!\nhi!\nhi!, ");
    int var78 = var68.getAvaliacaoNegativa();
    model.Avaliacao var82 = new model.Avaliacao("hi!", "", true);
    var68.addAvaliacao(var82);
    boolean var84 = var50.equals((java.lang.Object)var82);
    var5.addAvaliacao(var82);
    
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
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test441");


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
    var2.setNome("hi!, hi!\n\n, , \nhi!\n, ");
    java.lang.String var30 = var2.getNome();
    
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
    assertTrue("'" + var30 + "' != '" + "hi!, hi!\n\n, , \nhi!\n, "+ "'", var30.equals("hi!, hi!\n\n, , \nhi!\n, "));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test442");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n", "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ", "hi!, hi!, hi!\n\nhi!, \nhi!, hi!\nhi!\nhi!, \n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ");
    java.lang.String var7 = var6.getEstado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ", hi!\n\nhi!, hi!, \nhi!\n, "+ "'", var7.equals(", hi!\n\nhi!, hi!, \nhi!\n, "));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test443");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!\n\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, ");
    int var6 = var5.getAvaliacaoPositiva();
    java.lang.String var7 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var7.equals("hi!, hi!\n\nhi!, "));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test444");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    var5.setEspecialidade("hi!, \nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var11 = var5.getConvenio();
    var5.addConvenio("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, ");
    model.Avaliacao var19 = new model.Avaliacao("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", true);
    var5.addAvaliacao(var19);
    boolean var21 = var19.isAvaliacao();
    java.lang.String var22 = var19.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var11.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var22.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test445");


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
    var5.setNome("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var5.setTipo("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.Avaliacao var36 = new model.Avaliacao("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, \nhi!\n, hi!", false);
    boolean var37 = var36.isAvaliacao();
    var5.addAvaliacao(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test446");


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
    java.lang.String var33 = var20.getEspecialidade();
    java.lang.String var34 = var20.getNome();
    model.ProfissionalSaude var40 = new model.ProfissionalSaude("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var41 = var40.getNome();
    model.Endereco var48 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var49 = var48.getNumero();
    var48.setCidade("hi!");
    model.Endereco var58 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var60 = var58.equals((java.lang.Object)10L);
    java.lang.String var61 = var58.getNumero();
    boolean var62 = var48.equals((java.lang.Object)var61);
    var48.setBairro("");
    java.lang.String var65 = var48.getNumero();
    java.lang.String var66 = var48.getBairro();
    model.Avaliacao var70 = new model.Avaliacao("", "hi!", false);
    java.lang.String var71 = var70.getCrm();
    boolean var72 = var70.isAvaliacao();
    java.lang.String var73 = var70.getIdUsuario();
    boolean var74 = var48.equals((java.lang.Object)var70);
    boolean var75 = var70.isAvaliacao();
    var40.addAvaliacao(var70);
    var20.addAvaliacao(var70);
    
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
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "+ "'", var41.equals("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test447");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    var6.setEstado("hi!");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!");
    java.lang.String var17 = var6.getCidade();
    java.lang.String var18 = var6.toString();
    var6.setBairro("hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!"+ "'", var17.equals("hi!, hi!\nhi!\nhi!, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!"+ "'", var18.equals("hi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test448");


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
    model.Avaliacao var35 = new model.Avaliacao("", "hi!", false);
    java.lang.String var36 = var35.getCrm();
    java.lang.String var37 = var35.getCrm();
    var5.addAvaliacao(var35);
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var41 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test449");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      model.TipoProfissional var1 = model.TipoProfissional.valueOf("hi!, hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, \n\nhi!, ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test450");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getNumero();
    var6.setEstado("hi!");
    var6.setBairro("hi!, \nhi!\n, ");
    var6.setRua("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var6.setSala("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test451");


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
    java.lang.String var61 = var2.getIdentificacao();
    
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
    assertTrue("'" + var61 + "' != '" + "hi!, \nhi!\n, hi!"+ "'", var61.equals("hi!, \nhi!\n, hi!"));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test452");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var8 = var6.equals((java.lang.Object)10L);
    java.lang.String var9 = var6.getNumero();
    var6.setNumero("");
    java.lang.String var12 = var6.getSala();
    var6.setBairro("hi!, hi!\n\nhi!, ");
    var6.setRua("hi!, hi!\nhi!\nhi!, \n");
    var6.setBairro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var19 = var6.getRua();
    var6.setCidade("hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ");
    model.Endereco var28 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var28.setCidade("");
    var28.setBairro("hi!");
    java.lang.String var33 = var28.getEstado();
    java.lang.String var34 = var28.getCidade();
    java.lang.String var35 = var28.getBairro();
    java.lang.String var36 = var28.getEstado();
    var28.setRua("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    boolean var39 = var6.equals((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!, hi!\nhi!\nhi!, \n"+ "'", var19.equals("hi!, hi!\nhi!\nhi!, \n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test453");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, , hi!, \nhi!\n, hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \n, hi!\n\nhi!, hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test454");


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
    var8.setConvenio("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    var8.setEspecialidade("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test455");


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
    boolean var21 = var5.verificaParametros("hi!, hi!\nhi!\n, , \nhi!\nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!\n", "hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , \nhi!\n, hi!\nhi!, hi!\nhi!\nhi!, , ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test456");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\n, \n\nhi!, ", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var6 = var5.getConvenio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ", hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var6.equals(", hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test457");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getBairro();
    var6.setNumero("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");
    java.lang.String var16 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, "+ "'", var16.equals("hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, "));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test458");


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
    java.lang.String var27 = var14.getEspecialidade();
    java.lang.String var28 = var14.getNome();
    var14.setTipo("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    model.ProfissionalSaude var36 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var37 = var36.getNome();
    java.lang.String var38 = var36.getNumeroRegistro();
    int var39 = var36.getAvaliacaoPositiva();
    var36.setTipo("hi!, hi!\nhi!\n, ");
    int var42 = var36.getAvaliacaoPositiva();
    var36.addConvenio("hi!, hi!\nhi!\n, ");
    java.lang.String var45 = var36.getNome();
    var36.addConvenio("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var36.setNome("hi!, hi!\n\n, ");
    model.Avaliacao var53 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", true);
    boolean var54 = var53.isAvaliacao();
    var36.addAvaliacao(var53);
    var14.addAvaliacao(var53);
    var14.setNumeroRegistro("hi!, \nhi!\nhi!, ");
    
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
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test459");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    var5.setTipo("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \n, ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test460");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\nhi!, \nhi!, \nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!");
    model.Usuario var5 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var5.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var8 = var5.getNome();
    model.ProfissionalSaude var14 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var18 = new model.Avaliacao("", "hi!", false);
    java.lang.String var19 = var18.getIdUsuario();
    var14.addAvaliacao(var18);
    var14.setNumeroRegistro("");
    var14.setConvenio("hi!");
    java.lang.String var25 = var14.getTipo();
    model.Avaliacao var29 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var30 = var29.getCrm();
    java.lang.String var31 = var29.getCrm();
    var14.addAvaliacao(var29);
    boolean var33 = var5.equals((java.lang.Object)var14);
    var14.setTipo("hi!\n");
    var14.setTipo("hi!, \nhi!\n, ");
    java.lang.String var38 = var14.getNome();
    boolean var39 = var2.equals((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var8.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!, \nhi!\n, "+ "'", var30.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!, \nhi!\n, "+ "'", var31.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test461");


    model.Usuario var2 = new model.Usuario("hi!", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!, hi!, hi!\nhi!\n, \n\nhi!, ");

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test462");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var2.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    model.Usuario var9 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    java.lang.String var10 = var9.getIdentificacao();
    boolean var11 = var2.equals((java.lang.Object)var9);
    model.ProfissionalSaude var17 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var21 = new model.Avaliacao("", "hi!", false);
    java.lang.String var22 = var21.getIdUsuario();
    var17.addAvaliacao(var21);
    var17.setNumeroRegistro("");
    java.lang.String var26 = var17.getConvenio();
    boolean var27 = var2.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var10.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var26.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test463");


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
    int var40 = var8.getAvaliacaoPositiva();
    
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
    assertTrue(var40 == 0);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test464");


    model.Avaliacao var3 = new model.Avaliacao("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", true);
    java.lang.String var4 = var3.getCrm();
    java.lang.String var5 = var3.getIdUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, \nhi!\n, "+ "'", var4.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var5.equals("hi!, hi!\nhi!\n, "));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test465");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNumeroRegistro();
    var5.setRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var5.setEspecialidade("hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test466");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getConvenio();
    var5.setRegistro("hi!, hi!\n\n, ");
    var5.setNumeroRegistro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test467");


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
    int var34 = var18.getAvaliacaoNegativa();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test468");


    model.Endereco var6 = new model.Endereco("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "", "hi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ", "hi!, hi!\n\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    var6.setSala("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    var6.setBairro("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , ");
    java.lang.String var11 = var6.getBairro();
    var6.setSala("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var6.setNumero("hi!, hi!\n\nhi!, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var16 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var11.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "+ "'", var16.equals("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , "));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test469");


    model.Avaliacao var3 = new model.Avaliacao("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!\n\n, , \nhi!\n, ", false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test470");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    var6.setSala("hi!");
    java.lang.String var13 = var6.toString();
    java.lang.String var14 = var6.getRua();
    var6.setNumero("hi!, hi!\nhi!\n, hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var13.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test471");


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
    var8.addConvenio("hi!, hi!, hi!, hi!\nhi!\n, \n\nhi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test472");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    java.lang.String var3 = var2.getIdentificacao();
    model.ProfissionalSaude var9 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var10 = var9.getNome();
    java.lang.String var11 = var9.getNumeroRegistro();
    int var12 = var9.getAvaliacaoPositiva();
    var9.setTipo("hi!, hi!\nhi!\n, ");
    int var15 = var9.getAvaliacaoPositiva();
    java.lang.String var16 = var9.getNome();
    model.Endereco var23 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var25 = var23.equals((java.lang.Object)10L);
    java.lang.String var26 = var23.getNumero();
    var23.setNumero("");
    var23.setSala("hi!");
    boolean var31 = var9.equals((java.lang.Object)"hi!");
    var9.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var38 = var9.verificaParametros("", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ", "hi!");
    var9.setConvenio("hi!");
    model.ProfissionalSaude var46 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var47 = var46.getNome();
    java.lang.String var48 = var46.getNumeroRegistro();
    int var49 = var46.getAvaliacaoPositiva();
    var46.setTipo("hi!, hi!\nhi!\n, ");
    int var52 = var46.getAvaliacaoPositiva();
    var46.addConvenio("hi!, hi!\nhi!\n, ");
    var46.setTipo("");
    int var57 = var46.getAvaliacaoPositiva();
    java.lang.String var58 = var46.getEspecialidade();
    java.lang.String var59 = var46.getTipo();
    var46.setEspecialidade("");
    java.lang.String var62 = var46.getEspecialidade();
    boolean var63 = var9.equals((java.lang.Object)var46);
    model.Usuario var66 = new model.Usuario("hi!, \nhi!\n, ", "");
    model.ProfissionalSaude var72 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var76 = new model.Avaliacao("", "hi!", false);
    java.lang.String var77 = var76.getIdUsuario();
    var72.addAvaliacao(var76);
    var72.setConvenio("hi!");
    boolean var81 = var66.equals((java.lang.Object)var72);
    var72.addConvenio("");
    var72.addConvenio("hi!, \nhi!\n, ");
    var72.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var88 = var46.equals((java.lang.Object)"hi!, \nhi!\n, , hi!\nhi!\n, ");
    boolean var89 = var2.equals((java.lang.Object)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"+ "'", var3.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!"+ "'", var77.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test473");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!", "hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , hi!\nhi!\n, , ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, ");
    java.lang.String var7 = var6.getRua();
    java.lang.String var8 = var6.getBairro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "+ "'", var7.equals("hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"+ "'", var8.equals("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test474");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    java.lang.String var7 = var6.getNumero();
    var6.setCidade("hi!");
    model.Endereco var16 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var18 = var16.equals((java.lang.Object)10L);
    java.lang.String var19 = var16.getNumero();
    boolean var20 = var6.equals((java.lang.Object)var19);
    java.lang.String var21 = var6.getBairro();
    java.lang.String var22 = var6.getEstado();
    var6.setEstado("hi!, hi!\n\nhi!, ");
    var6.setEstado("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!");
    var6.setEstado("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, ");
    
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

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test475");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    var5.setTipo("hi!, hi!\nhi!\n, ");
    java.lang.String var17 = var5.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var17.equals("hi!, hi!\nhi!\n, "));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test476");


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
    java.lang.String var31 = var5.getNumeroRegistro();
    
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
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test477");


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
    var6.setEstado(", hi!\n\nhi!, hi!, \nhi!\n, ");
    
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

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test478");


    model.Usuario var2 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    model.Endereco var9 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    boolean var11 = var9.equals((java.lang.Object)10L);
    java.lang.String var12 = var9.getNumero();
    java.lang.String var13 = var9.getSala();
    boolean var14 = var2.equals((java.lang.Object)var9);
    java.lang.String var15 = var2.getIdentificacao();
    var2.setIdentificacao("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , ");
    var2.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var2.setNome("hi!");
    java.lang.String var22 = var2.getIdentificacao();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "+ "'", var22.equals("hi!, hi!\n\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , "));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test479");


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
    var51.setNome("hi!, \nhi!\n, , hi!, hi!\nhi!\nhi!, \nhi!\n, , \n\nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ");
    
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

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test480");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\n, ", "hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\n\nhi!, ", "hi!, hi!\n\nhi!, ");
    java.lang.String var7 = var6.getSala();
    var6.setSala(", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setSala("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setCidade("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    java.lang.String var14 = var6.getCidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!, \nhi!\n, "+ "'", var7.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "+ "'", var14.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, "));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test481");


    model.Endereco var6 = new model.Endereco("hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!\n", "hi!, \nhi!\n, , hi!\nhi!\n, ", "hi!", ", hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    var6.setEstado("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    var6.setNumero("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, ");
    model.Usuario var13 = new model.Usuario("hi!, \nhi!\n, ", "hi!, \nhi!\n, ");
    java.lang.String var14 = var13.getNome();
    boolean var15 = var6.equals((java.lang.Object)var14);
    var6.setBairro("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!, \nhi!\n, "+ "'", var14.equals("hi!, \nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test482");


    model.Usuario var2 = new model.Usuario("hi!, hi!\nhi!\n, , hi!\nhi!, \nhi!\n, \nhi!, \nhi!\n, , hi!, hi!\nhi!\n, ", "hi!, hi!\nhi!\nhi!, \n");

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test483");


    model.Endereco var6 = new model.Endereco("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!", ", hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ", "hi!, hi!\nhi!\nhi!, \nhi!\n, , ", "hi!, \nhi!\n, , hi!, hi!\nhi!, hi!\n\nhi!, \nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, , hi!, hi!\n\n, ");

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test484");


    model.Usuario var2 = new model.Usuario("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, ", "hi!, \nhi!\n, , hi!\n\nhi!, ");
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "+ "'", var3.equals("hi!, hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, \nhi!\n, "));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test485");


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
    model.Endereco var46 = new model.Endereco("", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "", "hi!, \nhi!\n, ", "hi!");
    java.lang.String var47 = var46.getSala();
    boolean var48 = var5.equals((java.lang.Object)var46);
    
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
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test486");


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
    var5.setNome("hi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, , , \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\n\nhi!, , hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    
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

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test487");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    var5.setConvenio("hi!");
    java.lang.String var14 = var5.getConvenio();
    java.lang.String var15 = var5.getNumeroRegistro();
    java.lang.String var16 = var5.getNumeroRegistro();
    var5.setTipo("");
    var5.setNumeroRegistro("hi!, \nhi!\n, , hi!\nhi!\n, ");
    int var21 = var5.getAvaliacaoPositiva();
    var5.setRegistro("hi!, hi!\nhi!\nhi!, , \nhi!\n, hi!");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!, hi!\nhi!\nhi!, \nhi!, \nhi!, hi!, hi!\nhi!\nhi!, \nhi!\nhi!, \nhi!\n, , , hi!, hi!\nhi!\nhi!, ");
    
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

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test488");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    java.lang.String var12 = var5.getNumeroRegistro();
    java.lang.String var13 = var5.getConvenio();
    var5.setRegistro("hi!, hi!\n\n, ");
    var5.setTipo("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var13.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test489");


    model.Endereco var6 = new model.Endereco("hi!, hi!\n\nhi!, \nhi!\n, , hi!", "hi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \n, hi!\nhi!\nhi!, hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!", "hi!, hi!\nhi!\n, hi!", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", "hi!, hi!\n\n, , hi!\nhi!\nhi!, \nhi!\n, , ");
    var6.setRua("hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test490");


    model.Endereco var6 = new model.Endereco("hi!", "hi!", "hi!", "hi!", "", "");
    var6.setCidade("");
    var6.setBairro("hi!");
    java.lang.String var11 = var6.getEstado();
    java.lang.String var12 = var6.getCidade();
    java.lang.String var13 = var6.getBairro();
    java.lang.String var14 = var6.getEstado();
    var6.setNumero("hi!, hi!\nhi!\n, hi!, \nhi!\n, , hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, \n, hi!\n\nhi!, hi!, \nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test491");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , ", "hi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", "hi!, hi!\n\n, hi!\n\nhi!, hi!, \nhi!\n, , ");
    java.lang.String var6 = var5.getNumeroRegistro();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , "+ "'", var6.equals("hi!, hi!\nhi!\nhi!, hi!\n\nhi!, , "));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test492");


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
    int var35 = var20.getAvaliacaoPositiva();
    
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
    assertTrue(var35 == 0);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test493");


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
    var8.setNumeroRegistro("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!\n");
    
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

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test494");


    model.Usuario var2 = new model.Usuario("", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var3 = var2.getIdentificacao();
    java.lang.String var4 = var2.getIdentificacao();
    java.lang.String var5 = var2.getIdentificacao();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var3.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var4.equals("hi!, hi!\nhi!\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!, hi!\nhi!\nhi!, "+ "'", var5.equals("hi!, hi!\nhi!\nhi!, "));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test495");


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
    var6.setBairro("hi!, \nhi!\n, , hi!\nhi!\n, , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
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

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test496");


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
    model.Usuario var32 = new model.Usuario("hi!, \nhi!\n, ", "hi!, hi!\nhi!\n, ");
    var32.setNome("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ");
    java.lang.String var35 = var32.getIdentificacao();
    var32.setIdentificacao("hi!, hi!\nhi!\nhi!, \nhi!");
    var32.setIdentificacao("hi!, hi!\n\nhi!, ");
    java.lang.String var40 = var32.getNome();
    java.lang.String var41 = var32.getIdentificacao();
    boolean var42 = var5.equals((java.lang.Object)var41);
    model.Avaliacao var46 = new model.Avaliacao("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, ", ", hi!\n\nhi!, hi!, \nhi!\n, ", false);
    boolean var47 = var46.isAvaliacao();
    var5.addAvaliacao(var46);
    boolean var49 = var46.isAvaliacao();
    java.lang.String var50 = var46.getCrm();
    
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
    assertTrue("'" + var35 + "' != '" + "hi!, hi!\nhi!\n, "+ "'", var35.equals("hi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "+ "'", var40.equals("hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!, hi!\n\nhi!, "+ "'", var41.equals("hi!, hi!\n\nhi!, "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "+ "'", var50.equals("hi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, "));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test497");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoNegativa();
    var5.setNumeroRegistro("hi!, hi!\nhi!\nhi!, ");
    boolean var19 = var5.verificaParametros("hi!, hi!\nhi!\nhi!, ", "hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, ", "hi!, \nhi!\n, ", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var20 = var5.getNome();
    var5.setNumeroRegistro("hi!, hi!\nhi!\n, , \nhi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test498");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    model.Avaliacao var9 = new model.Avaliacao("", "hi!", false);
    java.lang.String var10 = var9.getIdUsuario();
    var5.addAvaliacao(var9);
    int var12 = var5.getAvaliacaoPositiva();
    var5.addConvenio("hi!, hi!\nhi!\nhi!, ");
    var5.setNumeroRegistro("");
    var5.setTipo("hi!, hi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, \nhi!\nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\nhi!\nhi!, ");
    java.lang.String var19 = var5.getEspecialidade();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test499");


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
    var5.setEspecialidade("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\n\nhi!, , hi!, hi!\n\nhi!, , hi!\nhi!, hi!\nhi!\n, , \nhi!, hi!, \nhi!\n, \nhi!\nhi!, hi!, hi!\nhi!\n, \nhi!, hi!\nhi!\n, , , hi!\nhi!\nhi!, hi!, \nhi!\n, \nhi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, , hi!, hi!\nhi!\n, ");
    
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

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest6.test500");


    model.ProfissionalSaude var5 = new model.ProfissionalSaude("hi!", "hi!", "hi!", "hi!", "hi!, hi!\nhi!\nhi!, ");
    java.lang.String var6 = var5.getNome();
    java.lang.String var7 = var5.getNumeroRegistro();
    java.lang.String var8 = var5.getNome();
    var5.setTipo("hi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, \nhi!\n, , hi!, hi!\nhi!\n, \nhi!, \nhi!\n, , hi!\nhi!\n, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\nhi!, \nhi!, hi!\nhi!\n, , hi!, hi!\n\nhi!, ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

}
