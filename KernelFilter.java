import java.awt.Color;

public class KernelFilter {
    public static Picture identity(Picture picture)
    { return picture; }

    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        Picture a = new Picture(w, h);

        double[][] guassian = {
                { 0.0625, 0.125, 0.0625 },
                { 0.125, 0.25, 0.125 },
                { 0.0625, 0.125, 0.0625 } };

        for (int y = 0; y < h; y++)
        {
            for (int x = 0; x < w; x++)
            {
                double r = 0, g = 0, b = 0;
                for (int i = -1; i < 2; i++)
                {
                    for (int j = -1; j < 2; j++)
                    {
                        int nx = x, ny = y;
                        Color point;
                        while (nx + i < 0)
                            nx += w;
                        while (nx + i >= w)
                            nx -= w;

                        while (ny + j < 0)
                            ny += h;
                        while (ny + j >= h)
                            ny -= h;

                        point = picture.get(nx + i, ny + j);

                        r += point.getRed() * guassian[1 + i][1 + j];
                        g += point.getGreen() * guassian[1 + i][1 + j];
                        b += point.getBlue() * guassian[1 + i][1 + j];

                    }
                }

                if (r > 255)
                    r = 255;
                else if (r < 0)
                    r = 0;
                else
                    r = Math.round(r);

                if (g > 255)
                    g = 255;
                else if (g < 0)
                    g = 0;
                else
                    g = Math.round(g);

                if (b > 255)
                    b = 255;
                else if (b < 0)
                    b = 0;
                else
                    b = Math.round(b);

                Color result = new Color((int) r, (int) g, (int) b);
                a.set(x, y, result);
            }
        }
        return a;
    }

    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        Picture a = new Picture(w, h);

        int[][] guassian = {
                { 0, -1, 0 },
                { -1, 5, -1 },
                { 0, -1, 0 }};

        for (int y = 0; y < h; y++)
        {
            for (int x = 0; x < w; x++)
            {
                double r = 0, g = 0, b = 0;
                for (int i = -1; i < 2; i++)
                {
                    for (int j = -1; j < 2; j++)
                    {
                        int nx = x, ny = y;
                        Color point;
                        while (nx + i < 0)
                            nx += w;
                        while (nx + i >= w)
                            nx -= w;

                        while (ny + j < 0)
                            ny += h;
                        while (ny + j >= h)
                            ny -= h;

                        point = picture.get(nx + i, ny + j);

                        r += point.getRed() * guassian[1 + i][1 + j];
                        g += point.getGreen() * guassian[1 + i][1 + j];
                        b += point.getBlue() * guassian[1 + i][1 + j];

                    }
                }

                if (r > 255)
                    r = 255;
                else if (r < 0)
                    r = 0;
                else
                    r = Math.round(r);

                if (g > 255)
                    g = 255;
                else if (g < 0)
                    g = 0;
                else
                    g = Math.round(g);

                if (b > 255)
                    b = 255;
                else if (b < 0)
                    b = 0;
                else
                    b = Math.round(b);

                Color result = new Color((int) r, (int) g, (int) b);
                a.set(x, y, result);
            }
        }
        return a;
    }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        Picture a = new Picture(w, h);

        int[][] guassian = {
                { -1, -1, -1 },
                { -1, 8, -1 },
                { -1, -1, -1 }};

        for (int y = 0; y < h; y++)
        {
            for (int x = 0; x < w; x++)
            {
                double r = 0, g = 0, b = 0;
                for (int i = -1; i < 2; i++)
                {
                    for (int j = -1; j < 2; j++)
                    {
                        int nx = x, ny = y;
                        Color point;
                        while (nx + i < 0)
                            nx += w;
                        while (nx + i >= w)
                            nx -= w;

                        while (ny + j < 0)
                            ny += h;
                        while (ny + j >= h)
                            ny -= h;

                        point = picture.get(nx + i, ny + j);

                        r += point.getRed() * guassian[1 + i][1 + j];
                        g += point.getGreen() * guassian[1 + i][1 + j];
                        b += point.getBlue() * guassian[1 + i][1 + j];

                    }
                }

                if (r > 255)
                    r = 255;
                else if (r < 0)
                    r = 0;
                else
                    r = Math.round(r);

                if (g > 255)
                    g = 255;
                else if (g < 0)
                    g = 0;
                else
                    g = Math.round(g);

                if (b > 255)
                    b = 255;
                else if (b < 0)
                    b = 0;
                else
                    b = Math.round(b);

                Color result = new Color((int) r, (int) g, (int) b);
                a.set(x, y, result);
            }
        }
        return a;
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        Picture a = new Picture(w, h);

        int[][] guassian = {
                { -2, -1, 0 },
                { -1, 1, 1 },
                { 0, 1, 2 }};

        for (int y = 0; y < h; y++)
        {
            for (int x = 0; x < w; x++)
            {
                double r = 0, g = 0, b = 0;
                for (int i = -1; i < 2; i++)
                {
                    for (int j = -1; j < 2; j++)
                    {
                       int nx = x, ny = y;
                        Color point;
                        while (nx + i < 0)
                            nx += w;
                        while (nx + i >= w)
                            nx -= w;

                        while (ny + j < 0)
                            ny += h;
                        while (ny + j >= h)
                            ny -= h;

                        point = picture.get(nx + i, ny + j);

                        r += point.getRed() * guassian[1 + i][1 + j];
                        g += point.getGreen() * guassian[1 + i][1 + j];
                        b += point.getBlue() * guassian[1 + i][1 + j];

                    }
                }

                if (r > 255)
                    r = 255;
                else if (r < 0)
                    r = 0;
                else
                    r = Math.round(r);

                if (g > 255)
                    g = 255;
                else if (g < 0)
                    g = 0;
                else
                    g = Math.round(g);

                if (b > 255)
                    b = 255;
                else if (b < 0)
                    b = 0;
                else
                    b = Math.round(b);

                Color result = new Color((int) r, (int) g, (int) b);
                a.set(x, y, result);
            }
        }
        return a;
    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        Picture a = new Picture(w, h);

        int[][] guassian = {
                { 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 1 } };

        for (int y = 0; y < h; y++)
        {
            for (int x = 0; x < w; x++)
            {
                double r = 0, g = 0, b = 0;
                for (int i = -4 ; i < 5; i++)
                {
                    int nx = x, ny = y;
                    Color point;

                    while (nx + i < 0)
                        nx += w;
                    while (nx + i >= w)
                        nx -= w;

                    while (ny + i < 0)
                        ny += h;
                    while (ny + i >= h)
                        ny -= h;

                    point = picture.get(nx + i, ny + i);

                    r += point.getRed();
                    g += point.getGreen();
                    b += point.getBlue();
                }
                r = Math.round(r/9);
                g = Math.round(g/9);
                b = Math.round(b/9);

                if (r > 255)
                    r = 255;
                else if (r < 0)
                    r = 0;
                else
                    r = Math.round(r);

                if (g > 255)
                    g = 255;
                else if (g < 0)
                    g = 0;
                else
                    g = Math.round(g);

                if (b > 255)
                    b = 255;
                else if (b < 0)
                    b = 0;
                else
                    b = Math.round(b);

                Color result = new Color((int) r, (int) g, (int) b);
                a.set(x, y, result);
            }
        }
        return a;
    }

    // Test client (ungraded).
    public static void main(String[] args)
    {
        Picture picture = new Picture("baboon.png");
        identity(picture);
        gaussian(picture);
        sharpen(picture);
        laplacian(picture);
        emboss(picture);
        motionBlur(picture);

    }

}