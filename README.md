Ludum Dare Compo codebase (LibGDX)
==================

This is the code base I use for Ludum Dare compo. It's for LibGDX.

The main features are mainly about resource management - resources are automatically loaded from the "default", so there's no need to individually load each and every asset.

There's also an automatic texture atlas creation in the desktop launcher. It takes all image files in "images" folder, packs them as an atlas called "game.atlas" and places it in the "assets/graphics" folder.

In addition to these, there's stub classes for screen, gamestage and "entity", which is essentially an extension of scene2D Actor class with a Sprite attached to it. It reflects all the transformations of the actor to the sprite.

Feel free to modify and use this - all I ask is to let me know if you used it. :)
