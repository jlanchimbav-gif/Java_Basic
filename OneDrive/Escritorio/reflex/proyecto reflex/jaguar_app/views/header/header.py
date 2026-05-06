import reflex as rx
import jaguar_app.components.link_icon as link_icon
from jaguar_app.components.info_text import info_text as info_text_link_icon
from jaguar_app.components.styles.colors import Colors as colors
from jaguar_app.components.styles.colors import textcolors



def header() -> rx.Component:
    return rx.vstack(
        rx.hstack(
            rx.avatar(src="/jaguar.png", size="8"),
            rx.vstack(
                rx.heading("Jaguar Web link redes sociales", size="6"),
                rx.text("Welcome to our application"),
                rx.text("hello my name is jaguar EW"),
            ),
            rx.hstack(
                link_icon.link_icon(),
                link_icon.link_icon(),
                link_icon.link_icon(),
                spacing="4",
            ),
            width="100%",
        ),
        rx.flex(
            info_text_link_icon(title="Learn More", body="Click here to learn more about our services."),
            rx.spacer(),
            info_text_link_icon(title="Contact Us", body="Get in touch with our team."),
            rx.spacer(),
            info_text_link_icon(title="About Us", body="Discover more about our company."),
            width="100%",
        ),
        rx.text("soy un estudiante de ingenieria en TicS ," \
        "de la universidad estatal de Milagro , " \
        "en la ciudad de Guayaquil Ecuador"),
        rx.text("bienvenido a mi primera web"),
        padding="20px",
        color=textcolors.BODY.value,
    ) 
