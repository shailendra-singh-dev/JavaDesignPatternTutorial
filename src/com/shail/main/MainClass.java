package com.shail.main;

import java.util.Scanner;

import com.shail.designpatterns.behavioural.ChainResposibilityDesignPattern;
import com.shail.designpatterns.behavioural.CommandDesignPattern;
import com.shail.designpatterns.behavioural.InterpreterDesignPattern;
import com.shail.designpatterns.behavioural.IteratorDesignPattern;
import com.shail.designpatterns.behavioural.MediatorDesignPatternTest;
import com.shail.designpatterns.behavioural.MomentoDesignPattern;
import com.shail.designpatterns.behavioural.ObserverDesignPatternTest;
import com.shail.designpatterns.behavioural.StateDesignPattern;
import com.shail.designpatterns.behavioural.StrategyDesignPatternTest;
import com.shail.designpatterns.behavioural.VisitorDesignPattern;
import com.shail.designpatterns.behavioural.templatemethod.TemplateMethodDesignPatternTest;
import com.shail.designpatterns.creational.abstractfactory.ComputerAbstractFactory;
import com.shail.designpatterns.creational.abstractfactory.DesktopFactory;
import com.shail.designpatterns.creational.abstractfactory.LaptopFactory;
import com.shail.designpatterns.creational.builder.Document;
import com.shail.designpatterns.creational.factory.Computer;
import com.shail.designpatterns.creational.factory.ComputerFactory;
import com.shail.designpatterns.creational.factory.ComputerFactory.TYPE;
import com.shail.designpatterns.creational.prototype.PrototypeDesignControllerMainClass;
import com.shail.designpatterns.creational.singleton.SerializedSingletonTest;
import com.shail.designpatterns.structural.adapter.SocketAdapterImpl_Inheritance;
import com.shail.designpatterns.structural.bridge.BridgeDesignPatterns;
import com.shail.designpatterns.structural.composite.CompositeDesignPattern;
import com.shail.designpatterns.structural.decorator.DecoratorDesignPattern;
import com.shail.designpatterns.structural.facade.FacadeDesignPattern;
import com.shail.designpatterns.structural.flyweight.FlyWeightDesignPattern;
import com.shail.designpatterns.structural.proxy.CommandExecutorTest;

public class MainClass {


  /**
   * @param args
   */
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int input = scanner.nextInt();
    switch (input) {
      case 1:
        testSingleton();
        break;

      case 2:
        testFactoryDesignPattern(TYPE.LAPTOP);
        break;

      case 3:
        testAbstractFactoryDesignPattern();
        break;

      case 4:
        testBuilderDesignPattern();
        break;

      case 5:
        testPrototypeDesignPattern();
        break;

      case 6:
        testAdapterDesignPattern();
        break;

      case 7:
        testCompositeDesignPattern();
        break;

      case 8:
        testProxyDesignPattern();
        break;

      case 9:
        testFlyWeightPattern();
        break;

      case 10:
        testFacadeDesignPattern(args);
        break;

      case 11:
        testBridgeDesignPattern();
        break;

      case 12:
        testDecoratorDesignPattern();
        break;

      case 13:
        testTemplateMethodDesignPattern();
        break;

      case 14:
        testMediatorDesignPattern();
        break;

      case 15:
        testChainResposibilityDesignPattern();
        break;

      case 16:
        testStrategyDesignPattern();
        break;

      case 17:
        testCommandDesignPattern();
        break;

      case 18:
        testStateDesignPattern();
        break;

      case 19:
        testVisitorDesignPattern();
        break;

      case 20:
        testInterpreterDesignPattern();
        break;

      case 21:
        testIteratorDesignPattern();
        break;

      case 22:
        testMomentoDesignPattern();
        break;

      case 23:
        testObserverDesignPattern();
        break;

      default:
        break;
    }
  }

  private static void testFacadeDesignPattern(String[] args) {
    FacadeDesignPattern.testFacadeDesignPattern(args);
  }

  private static void testSingleton() {
    SerializedSingletonTest.isSameReference();
  }

  private static void testMomentoDesignPattern() {
    MomentoDesignPattern.testMomentoDesignPattern();
  }

  private static void testIteratorDesignPattern() {
    IteratorDesignPattern.testIteratorDesignPattern();
  }

  private static void testInterpreterDesignPattern() {
    InterpreterDesignPattern.testInterpreterDesignPattern();
  }

  private static void testVisitorDesignPattern() {
    VisitorDesignPattern.testVisitorDesignPattern();
  }

  private static void testStateDesignPattern() {
    StateDesignPattern.testStateDesignPattern();
  }

  private static void testCommandDesignPattern() {
    CommandDesignPattern.testCommandDesignPattern();
  }

  private static void testStrategyDesignPattern() {
    StrategyDesignPatternTest.testStrategyDesignPattern();
  }

  private static void testObserverDesignPattern() {
    ObserverDesignPatternTest.testObserverDesignPattern();
  }

  private static void testChainResposibilityDesignPattern() {
    ChainResposibilityDesignPattern.testChainResposibilityDesignPattern();
  }

  private static void testMediatorDesignPattern() {
    MediatorDesignPatternTest.testMediatorDesignPatternTest();
  }

  private static void testTemplateMethodDesignPattern() {
    TemplateMethodDesignPatternTest.testTemplateMethodDesignPatternTest();
  }

  private static void testBridgeDesignPattern() {
    BridgeDesignPatterns.testBridgeDesignPatter();
  }

  private static void testDecoratorDesignPattern() {
    DecoratorDesignPattern.testDecoratorDesighPattern();
  }

  private static void testProxyDesignPattern() {
    CommandExecutorTest.testProxyPattern();
  }

  private static void testCompositeDesignPattern() {
    CompositeDesignPattern.testCompositeDesignPattern();
  }

  private static void testAdapterDesignPattern() {

    SocketAdapterImpl_Inheritance socketAdapterImpl_Inheritance =
        new SocketAdapterImpl_Inheritance();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an Voltage:\t");
    int index = scanner.nextInt();
    int voltage = 0;

    switch (index) {
      case 120:
        voltage = socketAdapterImpl_Inheritance.get120Volt().getVolt();
        break;

      case 3:
        voltage = socketAdapterImpl_Inheritance.get3Volt().getVolt();
        break;

      case 40:
        voltage = socketAdapterImpl_Inheritance.get40Volt().getVolt();
        break;

      default:
        break;
    }
    System.out.print("\n Voltage is :" + voltage);
  }

  private static void testPrototypeDesignPattern() {
    PrototypeDesignControllerMainClass.testProtoTypeDesign();
  }

  private static void testFlyWeightPattern() {
    FlyWeightDesignPattern.testFlyWeightPatternTest();
  }

  private static void testBuilderDesignPattern() {
    String authorName = "Mr.Sharma";
    String title = "Happiness Of Life";
    String documentType = "Novell";
    Document.DocumentBuilder documentBuilder = new Document.DocumentBuilder(authorName, title);
    documentBuilder.setDocumentType(documentType);
    int numberOfPages = 100;
    documentBuilder.setNumberOfPages(numberOfPages);
    Document document = documentBuilder.build();
    System.out.print("testBuilderDesignPattern(),document:" + document);
  }

  private static void testFactoryDesignPattern(TYPE type) {
    String ram = "2 Gb";
    String hdd = "1 TB";
    String cpu = "2 Mz";
    Computer computer = ComputerFactory.getComputer(type, ram, hdd, cpu);
    System.out.print("testFactoryDesignPattern(),computer:" + computer);
  }

  private static void testAbstractFactoryDesignPattern() {
    String ram = "2 Gb";
    String hdd = "1 TB";
    String cpu = "2 Mz";
    // Desktop factory
    ComputerAbstractFactory desktopfactory = new DesktopFactory(ram, hdd, cpu);
    Computer desktop = ComputerFactory.getComputerFactory(desktopfactory);

    // Laptop Factory..
    ComputerAbstractFactory laptopfactory = new LaptopFactory(ram, hdd, cpu);
    Computer laptop = ComputerFactory.getComputerFactory(laptopfactory);

    System.out.print("testAbstractFactoryDesignPattern(),desktop:" + desktop + ",laptop:" + laptop);
  }

}
