import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BannerComponent } from './banner/banner.component';
import { TechHeadlinesComponent } from './technology/techHeadlines.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NavigationComponent } from './navigation/navigation.component';
import { BrowserModule } from '@angular/platform-browser';
import { SearchComponent } from './search/search.component';

const routes: Routes = [

];

@NgModule({
  imports: [FormsModule,ReactiveFormsModule,BrowserModule,
    RouterModule.forRoot([
    {path: 'home', component: HomepageComponent,},
    {path: 'tech', component: TechHeadlinesComponent},
    {path: 'nav', component: NavigationComponent},
    {path: 'banner', component: BannerComponent,},
    {path: 'search', component: SearchComponent,},
    {path: '', redirectTo: '/home', pathMatch: 'full'},
  ]),],
  exports: [RouterModule]
})
export class AppRoutingModule { }
