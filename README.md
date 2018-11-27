# Design Pattern

## 1, Creational Patterns
* 關注於系統中對象之間的創建過程。

### 1.1, Factory Method
| Diagram | Sample  | 
| :-:   | :-: | 
| ![width](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/factory_method.png "50%") | ![width](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_factory_methods.png "50%") |
#### 要點：
* 為了解決 Simple Factory 無法滿足 OCP 原則。
* 透過每個不同的  Factory 來實現不同的 Product。

### 1.2, Abstract Factory
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/abstract_factory.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_abstract_factory.png "50%") |
* 用來產生產品群的全部產品，無法增加新的產品，而是增加產品群。
* 適用於處理透過「一群」個體組成一項產品，則適用於此模式。

### 1.3, Builder
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/builder.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_builder.png "50%") |
* 需要建構一個複雜的產品，在這個產品中的組件是否在組裝時有組裝步驟的問題。
* 需實現 Builder 來建告組件，由 Director 來組裝所有的組件。

### 1.4, Prototype
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/prototype.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_prototype.png "50%") |
* 透過初始化產生一個物件時，需要非常繁鎖的數據準備，或存取方式，可用 Prototype。
* clone 類似於 new 但不同在於所 clone 出來的物件會完全的複製所有的數據，而非原本的參考。

### 1.5, Singleton
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/singleton.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_singleton.png "50%") |
* 某些類別只需要一個實例，來避免因為過多的實例而產生各種各樣的問題及資源的演費，則適用於些模式。

## 2, Structural Patterns
* 關注系統中對象和類別之間的組成。

### 2.1, Adapter
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/adapter.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_adapter.png "50%") |
* 將兩個不同的接口，透過一個 Adapter 來做介接，使兩個不兼容的接口可以互相溝通，則為此模式

### 2.2, Bridge
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/bridge.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_bridge.png "50%") |
* 當遇到「多層繼承結構」的類別時，例如一個類別中有兩個因素會影響到繼承關係，使得繼承更為複雜。
* 一個類別中有兩個變化維度，如：電腦類型、電腦品牌。

### 2.3, Composite
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/composite.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_composite.png "50%") |
* 把部份和整體的關係用「樹形」結構表示，而使客戶端可以使用統一的方式處理部份對象和整體對象。

### 2.4, Decorator
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/decorator.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_decorator.png "50%") |
* 動態的為一個對象增加新的功能
* 是一種用於代替繼承的技術，無須透過繼承增加子類別就能擴展對向的新功能。使用對象的關聯關係代替繼承關係，更加靈活。

### 2.5, Facade
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/facade.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_facade.png "50%") |
* 為子系統提供了一個統一的入口，封裝子系統的複雜性，便於客戶端的調用。

### 2.6, Flyweight
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/flyweight.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_flyweight.png "50%") |
* 如果有很多個完全相同或相似的對象，可以透過此模式來結省內存的稀有資源。
* 此模式提供了以共享方式高效地支援大量的對象重用。
* 內部狀態相對獨立，不影響內部狀態

### 2.7, Proxy
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/proxy.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_proxy.png "50%") |
* 透過代理，可以控制對象的訪問，可以詳細控制訪問某個對象的方法，在調用這個方法前做前置處理，調用這個方法後做後置的處理。

## 3, Behavioral Patterns
* 關注系統中對象的互相的交互，研究系統在運行對象之間的相互通信和動作，進一步了解對象間的職責。

### 3.1, Chain of Responsibility
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/chain_of_responsibility.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_chain_of_responsibility.png "50%") |
* 將能夠處理同一類請求的對象串成一個鏈，所提交的請求沿著鏈結的順序有上而下判斷是否可以在這個階段處理，如果不行這往下一個階段傳送。

### 3.2, Command
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/command.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_command.png "50%") |
* 將一個請求封裝為一個對象，從而使我們可以用不同的請求對客戶進行參數化，將請求排隊或記錄log，以支援可撒消的操作。

### 3.3, Interpreter
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/interpreter.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_interpreter.png "50%") |
* 用於描述如何構成一個簡單的語言解譯器，可用於使用面對象的語言開發的編譯器及解譯器設計。例如：Math Expression Parser

### 3.4, Iterator
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/iterator.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_iterator.png "50%") |
* * 提供了一種可以聚合對象的方式，實現了聚合對象及迭代器的模式。

### 3.5, Mediator
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/mediator.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_mediator.png "50%") |
* 如果在一個系統中的對象關係呈現網狀結構，對象間存在大量多對多的關係，導致對象關係變的複雜，我們可以引入一個中介者對象，都透過他來相互交互，減少複雜度。

### 3.6, Memento
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/memento.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_memento.png "50%") |
* 當需要保存某個對象內部獎態的，這樣以後就可以將該對象恢復到原先的獎態。

### 3.7, Observer
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/observer.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_observer.png "50%") |
* 觀察者主要用於1:n的通知，當一個對象(目標對象Subject或Observeable)變化時，他需要即時告知一系列對象(Observer)讓他們做出反應。

### 3.8, State
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/state.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_state.png "50%") |
* 用於解決系統中不同的狀態的轉換對應到不同的行為時封裝問題。

### 3.9, Strategy
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/strategy.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_strategy.png "50%") |
* 策略模式對應於解決某一個問題的一個算法群，允許用戶透過選擇其中某一個算法解決其中一個問題，同時可以方便的更換或增加新的算法，來滿足客戶端。

### 3.10, Template Method
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/template_method.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_template_method.png "50%") |
* 定義了一個程序的流程結構，將某些步驟延遲到子類別去實現，這樣新的子類別可以在不改變程序流程的情況下重新定義程序中某些步驟。

### 3.11, Visitor
| Diagram | Sample  | 
| :-:   | :-: | 
| ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/visitor.png "50%") | ![](https://github.com/DarrenHsu/DHDesignPattern/blob/master/app/src/main/res/drawable-v24/s_visitor.png "50%") |
* 訪問模式為當系統中對象為樹裝結構時，當想改變其中或部份的對象內容或程序時，可以例用此模式實現。
