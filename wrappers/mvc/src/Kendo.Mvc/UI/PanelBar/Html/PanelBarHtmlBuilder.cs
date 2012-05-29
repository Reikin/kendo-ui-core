namespace Kendo.Mvc.UI
{

    using Extensions;
    using Infrastructure;

    public class PanelBarHtmlBuilder : NavigationHtmlBuilderBase<PanelBar, PanelBarItem>, INavigationComponentHtmlBuilder<PanelBarItem>
    {
        public PanelBarHtmlBuilder(PanelBar panelBar, IActionMethodCache actionMethodCache)
            : base(panelBar)
        {
        }

        public IHtmlNode ChildrenTag(PanelBarItem item)
        {
            IHtmlNode ul = ListTag();

            if(!item.Enabled)
                ul.Attribute("style", "display:none");
            else if (item.Enabled && !item.Expanded)
                ul.Attribute("style", "display:none");

            return ul;
        }

        public IHtmlNode Build()
        {
            return ComponentTag("ul")
                .PrependClass(UIPrimitives.Widget, "k-panelbar", UIPrimitives.ResetStyle);
        }

        public IHtmlNode ItemTag(PanelBarItem item)
        {
            return ListItemTag(item, li =>
            {
                if (item.Expanded)
                {
                    li.PrependClass(UIPrimitives.ActiveState);
                }
                else if (!item.Selected)
                {
                    li.PrependClass(UIPrimitives.DefaultState);
                }
            });
        }

        public IHtmlNode ItemInnerContentTag(PanelBarItem item, bool hasAccessibleChildren)
        {
            IHtmlNode a = LinkTag(item, tag =>
            {
                if (item.Parent == null)
                {
                    tag.PrependClass(UIPrimitives.Header);
                }

                if (item.Selected)
                {
                    tag.PrependClass(UIPrimitives.SelectedState);
                }
            });

            if (hasAccessibleChildren || item.Template.HasValue() || item.ContentUrl.HasValue())
            {
                new HtmlElement("span")
                    .AddClass(UIPrimitives.Icon)
                    .ToggleClass("k-arrow-up", item.Expanded)
                    .ToggleClass("k-panelbar-collapse", item.Expanded)
                    .ToggleClass("k-arrow-down", !item.Expanded)
                    .ToggleClass("k-panelbar-expand", !item.Expanded)
                    .AppendTo(a);
            }

            return a;
        }

        public IHtmlNode ItemContentTag(PanelBarItem item)
        {
            IHtmlNode div = ContentTag(item);

            if (!item.Expanded || item.ContentUrl.HasValue() || !item.Enabled)
            {
                div.Attribute("style", "display:none");
            }

            return div;
        }
    }
}
