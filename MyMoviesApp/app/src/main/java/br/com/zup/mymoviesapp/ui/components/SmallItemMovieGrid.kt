package br.com.zup.mymoviesapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.zup.mymoviesapp.MovieSample
import br.com.zup.mymoviesapp.R
import br.com.zup.mymoviesapp.sample.sampleMovies
import br.com.zup.mymoviesapp.ui.theme.MyMoviesAppTheme

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun SmallMovieItemGridPreview() {
    MyMoviesAppTheme {
        SmallMovieItemGrid()
    }
}

@Composable
fun SmallMovieItemGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(168.dp)
    ) {
        items(sampleMovies) { item ->
            SmallMovieItem(drawable = item.drawable, text = item.title)
        }
    }
}