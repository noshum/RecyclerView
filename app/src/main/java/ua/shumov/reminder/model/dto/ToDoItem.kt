package ua.shumov.reminder.model.dto

class ToDoItem () {

    var id: Long = -1 // primary key
    var toDoId : Long =  -1 // parent task id
    var itemName = ""
    var isCompleted = false
}