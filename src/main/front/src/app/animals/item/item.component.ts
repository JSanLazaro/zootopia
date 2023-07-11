import { Component, Input } from '@angular/core';
import { Animal } from 'src/app/models/Animal.model';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.scss']
})
export class ItemComponent {
  @Input() animal!:Animal
}
