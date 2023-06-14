import { Component, OnInit } from '@angular/core';
import { FormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { Article } from '../models/article';
import { ArticleService } from '../service/article.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';



@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss']
})
export class NavigationComponent implements OnInit {


  articles: Article[] | undefined

  searchForm: FormGroup = new FormGroup({
    searchBox:new FormControl("", [
      Validators.required
    ])
  })


  constructor(private articleService: ArticleService,  private formBuilder: FormBuilder, http: HttpClient) {FormsModule }
  // anything placed here will take affect the moment the application runs
  ngOnInit() {
  }

  getSearch =() => {
    return this.searchForm.get("searchBox")
  }



  // search topic will come from html
  onSubmit = () => {
    console.log("its been called")
    console.log(this.searchForm.value["searchBox"])
    let articles = this.articleService.search(this.searchForm.value["searchBox"]).subscribe(data=> {
    console.log(this.articles = data)
   },

// error handling might be necessary but does not seem to be needed at the moment
   error =>{

   }
   )
    console.log(articles)
    // return result
 }

}




