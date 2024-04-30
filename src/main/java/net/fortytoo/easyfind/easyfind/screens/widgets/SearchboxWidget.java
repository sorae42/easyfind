package net.fortytoo.easyfind.easyfind.screens.widgets;

import net.fortytoo.easyfind.easyfind.screens.Spotlight;
import net.fortytoo.easyfind.easyfind.utils.SearchResult;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;

import java.util.function.BiConsumer;

public class SearchboxWidget extends TextFieldWidget {
    private final Spotlight spotlight;
    private BiConsumer<SearchResult, ResultWidget> resultConsumer = null;
    
    public SearchboxWidget(Spotlight screen, TextRenderer textRenderer, int x, int y, int width, int height, Text text, Text placeholder) {
        super(textRenderer, x, y, width, height, text);
        this.spotlight = screen;
        this.setPlaceholder(placeholder);
    }
    
    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        final SearchResult result = SearchResult.fromKeyCode(keyCode);
        if (result != null) {
            final ResultWidget resultWidgetEntry = this.spotlight.getResultList().getSelectedOrNull();
            if (resultWidgetEntry != null) {
                this.resultConsumer.accept(result, resultWidgetEntry);
            }
            return true;
        }
        
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    public void setResultConsumer(BiConsumer<SearchResult, ResultWidget> resultConsumer) {
        this.resultConsumer = resultConsumer;
    }
}
