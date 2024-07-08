package Prac

object Quec01 {

  var itemNames:Array[String]=Array("Sugar","Rice","Dhal","Corn Flour","Chilli Powder")
  var itemQuantity:Array[Int]=Array(20,100,50,30,15)

  def displayInventory():Unit={
    println("***Currently available inventory of the store***")
    for(i<-itemNames.indices){
      println(s"${itemNames(i)}:${itemQuantity(i)} Kg Currently available in the inventory")
    }
  }

  def reStockItem(Name:String,Quantity:Int):Unit={
    val index=itemNames.indexOf(Name)
    if(index == -1){
      println(s"$Name does not exist in the inventory")
    }
    else{
      itemQuantity(index) += Quantity
      println(s"$Name re-stock with $Quantity Kg")
    }
  }

  def sellItem(Name: String, Quantity: Int): Unit = {
    val index = itemNames.indexOf(Name)
    if (index == -1) {
      println(s"$Name does not exist in the inventory")
    }
    else {
      if (Quantity > itemQuantity(index)) {
        println(s"No enough $Name Quantity to sell!")
      }
      else {
        itemQuantity(index) -= Quantity
        println(s"$Name sold by $Quantity Kg and currently existing quantity is  ${itemQuantity(index)} Kg")
      }
    }
  }
    def main(args: Array[String]): Unit = {
      displayInventory()
      println()
      reStockItem("Rice", 5)
      println()
      sellItem("Chilli Powder", 2)
      println()
      sellItem("Dhal", 10)
      println()
      reStockItem("Corn Flour", 3)
      println()
      displayInventory()
      println()
      sellItem("Vegetable", 10)
    }
  }


