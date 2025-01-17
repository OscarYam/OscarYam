package com.example.myamaptestdemo.data;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class PlaylistWithSongs {
    @Embedded
    public Playlist playlist;

    @Relation(
            parentColumn = "playlistId",
            entityColumn = "songId",
            associateBy = @Junction(PlaylistSongCrossRef.class)
    )

    public List<Song> songs;
}
