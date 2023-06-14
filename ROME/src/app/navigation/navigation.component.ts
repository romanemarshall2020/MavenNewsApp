import { Component, OnInit } from '@angular/core';
import { FormsModule, ReactiveFormsModule, FormGroup, FormControl } from '@angular/forms';
// import { NgModule } from '@angular/forms';
import {NgForm} from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { Article } from '../models/article';
import { ArticleService } from '../service/article.service';


@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss']
})
export class NavigationComponent implements OnInit {


  articles: Article[] | undefined

  searchForm: FormGroup = new FormGroup({
    searchBox:new FormControl("")
  })


  constructor(private articleService: ArticleService,  private formBuilder: FormBuilder,) {FormsModule }

  ngOnInit(): void {

  }

  // search topic will come from html
  onSubmit() {
    console.log("its been called")
    let result = this.articleService.search(this.searchForm.value)
    console.log(result)
    return result
 }

}




