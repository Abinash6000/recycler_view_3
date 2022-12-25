package com.project.recyclerview3.data

import com.project.recyclerview3.R
import com.project.recyclerview3.model.Item

class DataSource {
    fun loadItem(): List<Item> {
        return listOf(Item(
            R.drawable.albert, "“Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.”\n" +
                    "― Albert Einstein"),
            Item(
                R.drawable.frank, "“So many books, so little time.”\n" +
                        "― Frank Zappa"),
            Item(
                R.drawable.brown, "“Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do. So throw off the bowlines. Sail away from the safe harbor. Catch the trade winds in your sails. Explore. Dream. Discover.”\n" +
                        "― H. Jackson Brown Jr., P.S. I Love You"),
            Item(
                R.drawable.sadhguru, "“The sign of intelligence is that you are constantly wondering. Idiots are always dead sure about every damn thing they are doing in their life.”\n" +
                        "― Jaggi Vasudev"),
            Item(R.drawable.sadhguru, "“The planet is spinning on time: not a small event. All the galaxies are managing fine; the whole cosmos is doing great. But you have one nasty little thought crawling through your head, and it is a bad day! The problem is you are living in a psychological space that bears no connection with reality. And you are insecure, because it can collapse at any moment.”\n~Jaggi Vasudev")
        )
    }
}