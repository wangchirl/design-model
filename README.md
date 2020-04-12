### 1. 代理模式
>  - 静态代理
>  - jdk动态代理 -> Proxy
>  - cglib动态代理 -> Cglib -> MethodInterceptor
#### 1. jdk动态代理与cglib动态代理区别
- jdk动态代理必须实现接口
- jdk动态代理使用 Proxy.newProxyInstance创建代理对象
- cglib动态代理无需实现接口或继承显示父类
- cglib使用 Enhancer 创建代理对象
- cglib需要实现MethodInterceptor接口重写 intercept方法
#### 2.动态代理在Spring中的使用场景
- AOP（日志，权限，事务等）
 
 
### 2. 模板模式
>   - 模板方法（在父类中规定了方法的调用流程 m1->m2->m3...）
>   - 抽象方法（m2,m3...）
>   - 子类方法实现（m2,m3...）
#### 1. 钩子方法
- 方法可以没有任何实现，或者返回 boolean 值来决定哪些方法在模板方法中执行
#### 2. 模板模式在Spring中的使用场景
- Spring IOC容器初始化的 refresh方法
    
### 3.装饰模式
#### 1. 特点
- 装饰对象和真实对象有相同的父类
- 装饰对象持有真实对象的引用（父引用）
- 装饰对象将请求转发给真实对象
- 装饰对象可以在转发请求前或后增加一些附件功能
#### 2. Java中的应用场景
- IO流 InputStream -> FileInputStream -> FilterInputStream(BufferInputStream)
    
### 4. 单例模式
> 只能存在一个对象实例

#### 1. 单例模式八种方式
>- 饿汉式（静态常量）
>> 特点:线程安全，可能造成内存浪费
>- 饿汉式（静态代码块）
>> 特点:线程安全，可能造成内存浪费
>- 懒汉式（线程不安全）
>- 懒汉式（线程安全，同步方法）
>- 懒汉式（线程不安全，同步代码块）
>- 双重检查
>- 静态内部类
>- 枚举
#### 2. 推荐使用的方式
>- 饿汉式
>- 双重检查
>- 静态内部类
>- 枚举
#### 2. 单例模式的应用场景
>- Runtime类（饿汉式）
>- Spring中的单例bean - scope=singleton

### 5. 原型模式 - Cloneable接口
#### 1. 实现方式
>- 实现 Cloneable 接口
>- 重写 clone 方法
#### 2. 原型模式的使用
>- Spring中的原型bean - scope=prototype
#### 3. 浅拷贝与深拷贝
#####3.1 浅拷贝
> 引用类型的对象并没有进行拷贝
#####3.2 深拷贝
> 引用类型的对象也进行了拷贝
#####3.3 深拷贝的实现方式
>- 重写clone方法来实现
>- 通过对象序列化实现深拷贝

### 6. 简单工厂模式
#### 1. 介绍
>简单工厂模式是工厂模式中最简单实用的模式
>简单工厂模式是由一个工厂对象决定创建出哪一种产品的实例
>定义一个创建对象的类，由这个类来封装实例对象的行为
>用到大量的创建某种/某类/某批对象时，就会使用到工厂模式
#### 2. 