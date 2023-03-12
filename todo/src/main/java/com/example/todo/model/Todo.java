package com.example.todo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="todo_db")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private boolean status;

//    use NoArgsConstructor to create without writing constructor code
//    Todo(){
//
//    }
//    use AllArgsConstructor to create without writing constructor code
//    Todo(Integer id,String title,boolean status){
//        this.id=id;
//        this.title=title;
//        this.status=status;
//    }
//
//    use @DAta to create getter , setter and toString without writing code
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//
//    @Override
//    public String toString() {
//        return "Todo{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", status=" + status +
//                '}';
//    }
}
