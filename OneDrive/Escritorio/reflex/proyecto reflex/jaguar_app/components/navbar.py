import reflex as rx
from jaguar_app.components.styles.styles import spacer as spacer
from jaguar_app.components.styles.colors import Colors as colors
from jaguar_app.components.styles.colors import textcolors

def navbar() -> rx.Component:
    return rx.hstack(
        rx.text(
            "Welcome to Jaguar Web",
            font_family="Arial, sans-serif",
            color=colors.PRIMARY.value,
        ),
        position="sticky",
        bg=colors.BACKGROUND.value,
        padding_x=spacer.BIG.value,
        padding_y=spacer.DEFAULT.value,
        z_index="999",
        width="100%",
        top="0",
        
    )



