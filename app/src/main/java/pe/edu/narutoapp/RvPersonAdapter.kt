package pe.edu.narutoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import pe.edu.narutoapp.data.Personajes
import pe.edu.narutoapp.databinding.ItemPersonBinding

class RvPersonAdapter(var person: List<Personajes>): RecyclerView.Adapter<PersonVH>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonVH {
        val binding = ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return PersonVH(binding)
    }

    override fun getItemCount() = person.size

    override fun onBindViewHolder(holder: PersonVH, position: Int) {
        holder.bind(person[position])
    }
}

class PersonVH(private val binding: ItemPersonBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(personajes: Personajes){
        binding.txtName.text  = personajes.name
        binding.txtAppearsIn.text = personajes.appearsIn
        binding.txtStatus.text = personajes.status
        if (personajes.images.isNotEmpty()){
            binding.imgImage.load(personajes.images)
        }else{
            binding.imgImage.setImageResource(R.drawable.imagen1)
        }
    }

}