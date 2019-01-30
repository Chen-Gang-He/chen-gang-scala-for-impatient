package com.chengang.ch10

/**
  * In the Java AWT library, we have a class Container , a subclass of Component that collects multiple components.
  * For example, a Button is a Component , but a Panel is a Container . That’s the composite pattern at work.
  *
  * Swing has JComponent and JContainer , but if you look closely, you will notice something strange.
  *
  * JComponent extends Container , even though it makes no sense to add other components to, say, a JButton .
  * The Swing designers would have ideally preferred the design in Figure 10–4 . Figure 10–4.
  *
  * A better design for Swing containers But that’s not possible in Java. Explain why not.
  *
  * How could the design be executed in Scala with traits?
  */
object Ex6 extends {
  //  multiple inheritance is not allowed.


}
