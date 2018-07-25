# Design Pattern

## 1, Creational Patterns
* 關注於系統中對象之間的創建過程。

### 1.1, Factory Method
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/factory_method.png?raw=true)
#### 要點：
* 為了解決 Simple Factory 無法滿足 OCP 原則。
* 透過每個不同的  Factory 來實現不同的 Product。

### 1.2, Abstract Factory
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/abstract_factory.png?raw=true)
* 用來產生產品群的全部產品，無法增加新的產品，而是增加產品群。
* 適用於處理透過「一群」個體組成一項產品，則適用於此模式。

### 1.3, Builder
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/builder.png?raw=true)
* 需要建構一個複雜的產品，在這個產品中的組件是否在組裝時有組裝步驟的問題。
* 需實現 Builder 來建告組件，由 Director 來組裝所有的組件。

### 1.4, Prototype
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/prototype.png?raw=true)
* 透過初始化產生一個物件時，需要非常繁鎖的數據準備，或存取方式，可用 Prototype。
* clone 類似於 new 但不同在於所 clone 出來的物件會完全的複製所有的數據，而非原本的參考。

### 1.5, Singleton
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/singleton.png?raw=true)
* 某些類別只需要一個實例，來避免因為過多的實例而產生各種各樣的問題及資源的演費，則適用於些模式。

## 2, Structural Patterns
* 關注系統中對象和類別之間的組成。

### 2.1, Adapter
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/adapter.png?raw=true)
* 將兩個不同的接口，透過一個 Adapter 來做介接，使兩個不兼容的接口可以互相溝通，則為此模式

### 2.2, Bridge
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/bridge.png?raw=true)
* 當遇到「多層繼承結構」的類別時，例如一個類別中有兩個因素會影響到繼承關係，使得繼承更為複雜。
* 一個類別中有兩個變化維度，如：電腦類型、電腦品牌。

### 2.3, Composite
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/composite.png?raw=true)
* 把部份和整體的關係用「樹形」結構表示，而使客戶端可以使用統一的方式處理部份對象和整體對象。

### 2.4, Decorator
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/decorator.png?raw=true)
* 動態的為一個對象增加新的功能
* 是一種用於代替繼承的技術，無須透過繼承增加子類別就能擴展對向的新功能。使用對象的關聯關係代替繼承關係，更加靈活。

### 2.5, Facade
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/facade.png?raw=true)
* 為子系統提供了一個統一的入口，封裝子系統的複雜性，便於客戶端的調用。

### 2.6, Flyweight
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/flyweight.png?raw=true)
* 如果有很多個完全相同或相似的對象，可以透過此模式來結省內存的稀有資源。
* 此模式提供了以共享方式高效地支援大量的對象重用。
* 內部狀態相對獨立，不影響內部狀態

### 2.7, Proxy
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/proxy.png?raw=true)
* 透過代理，可以控制對象的訪問，可以詳細控制訪問某個對象的方法，在調用這個方法前做前置處理，調用這個方法後做後置的處理。

## 3, Behavioral Patterns
* 關注系統中對象的互相的交互，研究系統在運行對象之間的相互通信和動作，進一步了解對象間的職責。

### 3.1, Chain of Responsibility
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/chain_of_responsibility.png?raw=true)
* 將能夠處理同一類請求的對象串成一個鏈，所提交的請求沿著鏈結的順序有上而下判斷是否可以在這個階段處理，如果不行這往下一個階段傳送。

### 3.2, Command
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/command.png?raw=true)
* 

### 3.3, Interpreter
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/interpreter.png?raw=true)
### 3.4, Iterator
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/iterator.png?raw=true)
### 3.5, Mediator
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/mediator.png?raw=true)
### 3.6, Memento
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/memento.png?raw=true)
### 3.7, Observer
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/observer.png?raw=true)
### 3.8, State
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/state.png?raw=true)
### 3.9, Strategy
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/strategy.png?raw=true)
### 3.10, Template Method
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/template_method.png?raw=true)
### 3.11, Visitor
![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/visitor.png?raw=true)
