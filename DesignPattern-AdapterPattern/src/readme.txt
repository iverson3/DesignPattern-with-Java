适配器模式：

定义：适配器模式将一个类的接口，装换成客户期望的另外一个接口。
          使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作了。
          
          
适配器分类：

1. 组合： 采用组合方式的适配器称为 对象适配器
   
     特点： 把"被适配者"作为一个对象组合到适配器类中，以修改目标接口 、包装"被适配者"
     优点： 可以适配"被适配者"的任何子类
     
     
2. 继承： 采用继承方式的适配器称为 类适配器

      特点： 通过多重继承不兼容接口，实现对目标接口的匹配，单一的为某个类而实现适配
      缺点： 不能继承"被适配者"的任何子类，只能专一的为当前类提供(进行)适配
                  如果希望对其子类进行适配，就必须再创建一个适配器，对指定子类进行适配(代码重用性不高)
                 
                 
                 
                 
作用：

1. 透明： 通过适配器，客户端可以调用适配器的同一个接口，因而实际调用的是什么 对于客户端来说是透明的。
                  这样做更简单、直接、紧凑

2. 重用： 复用了现存的类，解决了现存类和复用环境要求不一致的问题

3. 低耦合： 将目标类和适配者类解耦，通过引入一个适配器类重用现有的适配者类，而无需修改原有代码(遵循开放-封闭原则)
      
